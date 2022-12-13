package org.example.service;

import org.example.madel.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    public static List<Category>categoryList=new ArrayList<>();
    private int count=0;
    public boolean addCategory(Category category){

        for ( Category category1:categoryList){
            if (category1.getName().equals(category.getName())){
                return false;
            }

        }
        ++count;
        categoryList.add(category);
        System.out.println(count +"<-Buldi");
        return true;
    }
    public boolean deleteCategory(int categoryId){
        for (Category category :categoryList){
            if (category.getId()==categoryId){
                --count;
                categoryList.remove(categoryId);
                System.out.println(count+"<- Qoldi");
                return true;
            }
        }
        return false;
    }
    public void showAllCategory(){
        for (Category category : categoryList){
            if (category!=null&&category.getParentId()>0){
                System.out.println(category);
            }
        }
    }
    public String showParentCategory(int parentId){
        for (Category category:categoryList){
            if (category.getParentId()==parentId){
                System.out.println(category);
            }
        }
        return null;
    }
    public String getNameById(int categoryId){
        for (Category category:categoryList){
            if (category.getId()==categoryId){
                return category.getName();
            }
        }
        return null;
    }
    public Category getCategoryById(int categoryId){
        for (Category category:categoryList){
            if (category.getId()==categoryId){
                return category;
            }
        }
        return null;
    }


}
