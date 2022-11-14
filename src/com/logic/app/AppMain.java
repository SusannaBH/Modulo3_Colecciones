
package com.logic.app;

import com.logic.examples.ListExamples;
import com.logic.model.User;
import java.util.List;


public class AppMain {

    
    public static void main(String[] args) {
        ListExamples.createUser("Dulcecita28",
                "contrasena123",
                "lucia.vargas@gmail.com");
        ListExamples.createUser("MataTrolls_Super",
                "24101997_Juan",
                "juan_sainz@gmail.com");
        ListExamples.createUser("Petarda2001",
                "cn@#23",
                "josejuliohernandez@gmail.com");
        List<User> users = ListExamples.getUsers();
        
        for(User user : users){
            System.out.println(user);
        }
    }
    
}
