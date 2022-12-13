package org.example;

import org.example.madel.Basket;
import org.example.madel.Category;
import org.example.madel.Product;
import org.example.madel.Users;
import org.example.service.BasketService;
import org.example.service.CategoryService;
import org.example.service.ProductService;
import org.example.service.UserService;

import java.util.Scanner;

public class Main {
    static UserService userService =new UserService();
    static CategoryService categoryService=new CategoryService();
    static ProductService productService =new ProductService();
    static BasketService basketService=new BasketService();
    static Scanner scannerStr=new Scanner(System.in);
    static Scanner scannerInt=new Scanner(System.in);
    public static void main(String[] args) {
        int var=10;
        while (var!=0){
            System.out.println("\uD83C\uDF52");
            System.out.println("1 REGISTIRATSIYA  2 LOGIN  ");
            var =scannerInt.nextInt();
            switch (var){
                case 1->{
                    Users user = new Users();
                    System.out.println("NAME");
                    user.setName(new Scanner(System.in).nextLine());
                    System.out.print("PHONE NUMBER\n(+998)");
                    user.setPhone(scannerInt.nextInt());
                    System.out.println("PASSWORD");
                    user.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("ROLE (1.ADMIN 2.USER)");
                    int var10 = 10;
                    var10 = scannerInt.nextInt();
                    if (var10 == 1)
                        user.setRole("ADMIN");
                    else if (var10 == 2)
                        user.setRole("USER");
                    userService.addUser(user);
                }
                case 2->{
                    System.out.println(" PASSWORD ");
                    String password =new Scanner(System.in).nextLine();
                    System.out.println(" PHONE ");
                    int phone =scannerInt.nextInt();
                    Users currentUsers = userService.login(phone, password);
                    if(currentUsers.getRole().equals("ADMIN")){
                        System.out.println( " ASSALOMI ALAYKUM "+ currentUsers.getName());
                        forADMIN();
                    }
                   else if (currentUsers.getRole().equals("USER")){
                        System.out.println( " ASSALOMI ALAYKUM "+ currentUsers.getName());
                        forUser(currentUsers);
                    }


                }

            }




        }



    }

    private static void forUser(Users currentUsers) {
        int var5=10;
        while (var5!=0){
            System.out.println(" 1 Category list  2 Basket ");
            var5=scannerInt.nextInt();
            switch (var5){
                case 1->{
                    categoryService.showAllCategory();
                    System.out.println(" Category id ");
                    int categoryId=scannerInt.nextInt();
                    categoryService.showParentCategory(categoryId);
                    productService.showCategoryProductById(categoryId);
                    if (productService.showCategoryProductById(categoryId)!=null){
                      int var6=10;
                      while (var6!=0){
                          System.out.println(" 1 add product  2 Buy  ");
                          var6=scannerInt.nextInt();
                          switch (var6){
                              case 1->{
                                  Basket basket=new Basket();
                                  basket.setbUsersId(currentUsers.getId());
                                  System.out.println(" product id ");
                                  int s=scannerInt.nextInt();
                                  basket.setProductId(s);
                                  System.out.println(" count ");
                                  int c=scannerInt.nextInt();
                                  if (c>productService.getProductById(s).getCount()){
                                      System.out.println(" bizda "+ c+ "- prodact yuq ");
                                      forUser(currentUsers);
                                  }if (productService.getById(s).getCount()==0){
                                      System.out.println("uzur product qolmadi ");
                                      break;
                                  }
                                  basket.setCountP(productService.getById(s).getCount()-c);
                                  basketService.addBasket(basket);
                              }
                              case 2->{
                                  basketService.showBasket(currentUsers.getId());
                                  int var7=10;
                                  while (var7!=0){
                                      System.out.println(" 1 order 2 edit ");
                                      var7=scannerInt.nextInt();
                                      switch (var7){
                                          case 1->{
                                              basketService.buy(currentUsers.getId());
                                              System.out.println("DONE☑ (THANKS FOR BUYING \uD83D\uDE0A)");
                                          }
                                          case 2->{
                                              System.out.println("PRODUCT ID");
                                              var7 = scannerInt.nextInt();
                                              basketService.deleteBasket(basketService.getById(var7).getId());
                                          }
                                      }
                                  }
                              }
                          }
                      }
                    }

                }
                case 2->{
                    basketService.showBasketBy(currentUsers.getId());
                }

            }
        }

    }

    private static void forADMIN() {
        int var2=10;
        while (var2!=0){
            System.out.println("1 Category  2 Product 3 Basket 4 User ");{
                var2=scannerInt.nextInt();
                switch (var2){
                    case 1->{
                        forCategoryAdmin();
                    }
                    case 2->{
                        forProductAdmin();
                    }
                    case 3->{
                       basketService.showAllOrderForUAdmin();
                    }
                    case 4->{
                        int var8=10;
                        while (var8!=0){
                            System.out.println("1 show 2 delete ");
                            var8=scannerInt.nextInt();
                            switch (var8){
                                case 1->{
                                    userService.showUsers();
                                }
                                case 2->{
                                    System.out.println(" user id ");
                                    userService.deleteUsers(scannerInt.nextInt());
                                }
                            }
                        }
                    }
                }
            }

        }
    }


    private static void forProductAdmin() {
        int var4 =10;
        while (var4 !=0){
            System.out.println(" 1 add  2 delete 3  all show 4 show ");
            var4 =scannerInt.nextInt();
            switch (var4){
                case 1->{
                    Product product=new Product();
                    System.out.println(" NAME ");
                    product.setName(new Scanner(System.in).nextLine());
                    System.out.println("CATEGORY ID ");
                    product.setCategoryId(scannerInt.nextInt());
                    System.out.println(" AMOUNT ");
                    product.setAmount(scannerInt.nextInt());
                    System.out.println(" DISCOUNT ");
                    product.setDisCount(scannerInt.nextDouble());
                    System.out.println(" COUNT ");
                    product.setCount(scannerInt.nextInt());
                    productService.addProduct(product);

                }
                case 2->{
                    System.out.println("PRODUCT id ");
                    productService.deleteProduct(scannerInt.nextInt());
                }
                case 3->{
                    productService.showAllProduct();
                }
                case 4->{
                    System.out.println(" CATEGORY ID SHOW PRODUCT ");
                    productService.showCategoryProductById(scannerInt.nextInt());
                }
            }
        }
    }

    private static void forCategoryAdmin() {
        int var3=10;
        while (var3!=0){
            System.out.println("1 add 2 delete 3 all show 4 show ");
            var3=scannerInt.nextInt();
            switch (var3){
                case 1->{
                    Category category=new Category();
                    System.out.println(" NAME ");
                    category.setName(new Scanner(System.in).nextLine());
                    System.out.println(" PARENT ID  ");
                    category.setParentId(scannerStr.nextInt());
                    categoryService.addCategory(category);
                }
                case 2->{
                    System.out.println("  ");
                    int c=scannerInt.nextInt();
                    categoryService.deleteCategory(c);
                }
                case 3->{
                   categoryService.showAllCategory();
                }
                case 4->{
                    System.out.println(" Category PARENT ID ");
                    int p=scannerInt.nextInt();
                    categoryService.showParentCategory(p);
                }
            }

        }

    }
}