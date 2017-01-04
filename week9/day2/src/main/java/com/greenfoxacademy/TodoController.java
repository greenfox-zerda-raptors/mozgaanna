package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mozgaanna on 20/12/16.
 */
@RequestMapping (value = "/todo")
@Controller
public class TodoController {

    @RequestMapping (value = "/list")
    public String doIt(Model model){
        model.addAttribute("todos", todoService.getTodos());
        return "todo/todo";
    }

    private TodoService todoService;
    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

}




