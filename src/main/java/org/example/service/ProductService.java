package org.example.service;

import org.example.madel.Category;
import org.example.madel.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<Product>productList=new ArrayList<>();
    public boolean addProduct(Product product) {
     for (Product product1:productList){
         if (product1.getName().equals(product.getName())){
             System.out.println(" bunday product botor");
             return false;
         }
     }
     for (Category category :CategoryService.categoryList){
         if (category.getId()==product.getCategoryId()&&getById(product.getCategoryId())==null){
             productList.add(product);
             return true;
         }
     }
     return false;
    }
    public boolean deleteProduct(int productId){
        for (Product product:productList){
            if (product.getId()==productId){
                productList.remove(productId);
                return true;
            }
        }
        return false;
    }
    public Product showCategoryProductById(int categoryId){
        for (Product product:productList){
            if (product.getCategoryId()==categoryId){
                return product;
            }
        }return null;
    }
    public  void  showAllProduct(){
        for ( Product product: productList){
            if (product!=null){
                System.out.println(product);
            }
        }
    }

    public Product getProductById(int productId){
        for ( Product product :productList){
            if (product.getId()==productId){
                return product;
            }
        }
        return null;
    }
    public String getNameById(int productId){
        for (Product product:productList){
            if ( product.getId()==productId){
                return product.getName();
            }
        }
        return null;
    }
    public Product getById(int productId){
        for (Product product:productList){
            if (product.getId()==productId){
                return product;
            }
        }
        return null;
    }
}
