package com.test.practise;

import com.test.practise.pages.loginController.userValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
private userValidator lgService = new  userValidator();
    @RequestMapping(value = "/login", method = RequestMethod.GET)

    public String ShowloginPAge(){
        return"login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)

    public String handleLoginRequest(@RequestParam String name,
                                     @RequestParam String password,
                                     ModelMap mmap){

        if(lgService.validateUser(name, password)){
        mmap.put("name1", name);
       // System.out.println(name);
        mmap.put("password1", password);
        return"welcome";}
        else {
            mmap.put("errorMessage", "Invalid Credentials");
            return "login";

        }

    }
}
