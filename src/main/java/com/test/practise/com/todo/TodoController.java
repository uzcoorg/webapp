package com.test.practise.com.todo;

import com.test.practise.pages.loginController.userValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

@Controller
@SessionAttributes("name1")
public class TodoController {
    @Autowired
    private todoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)

    public String ShowloginPAge(ModelMap model) {

        model.addAttribute("todos", service.retrieveTodos("in28Minutes"));
        return "list-todos";
    }
    //
    //
    // @RequestMapping(value = "/login", method = RequestMethod.POST)

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showTodoPage() {
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @RequestParam String desc) {
        service.addTodo("in28Minutes", desc, new Date(), false);
        model.clear();// to prevent request parameter "name" to be passed
        return "redirect:/list-todos";
    }
    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam int id) {
        service.deleteTodo(id);

        return "redirect:/list-todos";
    }

}
