package com.test.practise.com.todo;

import com.test.practise.pages.loginController.userValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
    @Autowired
    todoService service ;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)

    public String ShowloginPAge(ModelMap model){
        model.addAttribute("todos", service.retrieveTodos("in28Minutes"));
        return"list-todos";
    }
   //
    //
    // @RequestMapping(value = "/login", method = RequestMethod.POST)



}
