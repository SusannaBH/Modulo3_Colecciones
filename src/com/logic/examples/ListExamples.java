
package com.logic.examples;

import com.logic.model.User;
import java.util.ArrayList;
import java.util.List;


public class ListExamples {
    
    private final static List<User> users = new ArrayList<>();

    public static List<User> getUsers() {
        return users;
    }
    
    public static void createUser(String nickName, String password, String email){
        User user = new User(nickName,password,email);
        users.add(user);
    }
    
    public static void showUsers(){
        if(!users.isEmpty()){
            for (int i = 0; i < users.size(); i++) {
                if(users.get(i)!=null) {
                    System.out.println(users.get(i));
                }else{ 
                    System.out.println("Este elemento esta vacio.");
                }
            }
        }else{
            System.out.println("No hay valores que mostrar.");
        }
    }
}
