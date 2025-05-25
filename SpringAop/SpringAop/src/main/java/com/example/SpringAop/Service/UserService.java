package com.example.SpringAop.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class UserService
{

    @Getter
    @Setter
    @AllArgsConstructor
    public class User{
        private String name;

        private int age;

        private String address;
    }
    private User user;
    public UserService()
    {
        user=new User("Shubham",20,"Bangalore");
    }
    public void login()
    {
        System.out.println("User logged in");
    }
    public void logout()throws IOException
    {
        System.out.println("User logged out");
        throw new IOException("User not logged in");
    }
}
