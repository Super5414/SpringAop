package com.example.SpringAop.RestApi;


import com.example.SpringAop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api
{
    @Autowired
    private UserService userService;
    @GetMapping("/signup")
    public  String Userlogin()
    {
        userService.login();
        return "User login endpoint called Sucessfully!";
    }
    @GetMapping("/login")
    public  String Userlogin2()
    {
        userService.login();
        return  ("<marquee> Shubham endpoint called Sucessfully!</marquee>");
    }
    @GetMapping("/*")
    public  String NotFound()
    {
        userService.login();
        return  ("<h2> Page Not Found </h2>");
    }
}
