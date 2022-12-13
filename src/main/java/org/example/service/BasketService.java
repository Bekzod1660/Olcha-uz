package org.example.service;

import org.example.madel.Basket;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasketService {
   public List<Basket>basketList=new ArrayList<>();
   public void buy(int usersId){
      Date date=new Date();
   for ( Basket basket :basketList){
      if (basket.getbUsersId()==usersId){
           basket.setBuy(true);
         SimpleDateFormat simpleDateFormat=new SimpleDateFormat("xx-yy-MMMM  HH-dd");
         basket.setTime(simpleDateFormat.format(new Date()));
      }
   }
   }
   public void showAllOrderForUAdmin(){
      for (Basket basket:basketList){
         if (basket.isBuy()){
            System.out.println(basket);
         }
      }
   }
   public void showBasket(int usersId){
      for (Basket basket:basketList){
         if (basket.getbUsersId()==usersId){
            System.out.println(basket);
         }
      }
   }
   public void  showBasketBy(int usersId){
      for (Basket basket:basketList){
         if (basket.getbUsersId()==usersId&&basket.isBuy()){
            System.out.println(basket);
         }
      }
   }
   public boolean deleteBasket(int productId){
      for (Basket basket :basketList){
         if (basket.getProductId()==productId){
            basketList.remove(productId);
            return true;
         }
      }
      return false;
   }
   public boolean addBasket(Basket basket){
      for (Basket basket1:basketList){
         if (basket1.getbUsersId()!=basket.getbUsersId()){
            basketList.add(basket);
            return true;
         }
      }
      return false;
   }
   public boolean delete(int basketId){
     for (Basket basket :basketList){
        if (basket.getId()==basketId){
           basketList.remove(basket);
           return true;
        }
     }
     return false;
   }
   public Basket getById(int basketId){
      for (Basket basket:basketList){
         if (basket.getId()==basketId){
            return basket;
         }
      }
      return null;
   }



}
