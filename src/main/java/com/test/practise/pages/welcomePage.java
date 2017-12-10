package com.test.practise.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class welcomePage {
    @RequestMapping(value = "/page")
@ResponseBody
    public String sayHello(){
        return"Welcome To login";
    }
}
