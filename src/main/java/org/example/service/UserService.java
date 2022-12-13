package org.example.service;

import org.example.madel.Users;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public List<Users>usersList=new ArrayList<>();
    public boolean addUser(Users users){
       for (Users users1:usersList){
           if (users1.getPhone()==users.getPhone()){
               System.out.println("Ruyxatda borsiz");
               return false;
           }
       }

        usersList.add(users);
        System.out.println("Ruyxatdan Utdiz");
        return true;
    }
    public void showUsers(){
        if (usersList!=null){
            System.out.println("Ruyxatimizda ");
        for (Users users:usersList){
            if (users!=null){
                System.out.println(users);
            }
        }
        }
        else {
            System.out.println("Ruyxat bush");
        }
    }
    public boolean deleteUsers(int userId){
        for (Users users:usersList){
            if (users.getId()==userId){
                usersList.remove(userId);
                System.out.println("Ruyxatdan o'chdi");
                return true;
            }
        }
        System.out.println("Bunday id yuq");
        return false;
    }
    public Users login(int phone, String password){
        for (Users users:usersList){
            if (users.getPassword().equals(password)&&users.getPhone()==phone){
                return users;
            }
        }
        return null;
    }

    public String getNameById(int usersId){
        for (Users users: usersList){
            if (users.getId()==usersId){
                return users.getName();
            }
        }
        return null;
    }
    public Users getUserById(int usersId){
        for (Users users:usersList){
            if (users.getId()==usersId){
                return users;
            }
        }
        return null;
    }

}
