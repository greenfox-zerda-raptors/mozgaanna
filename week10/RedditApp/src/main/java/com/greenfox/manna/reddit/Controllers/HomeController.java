package com.greenfox.manna.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mozgaanna on 04/01/17.
 */
@Controller
public class HomeController {


    @RequestMapping (value="", method= RequestMethod.GET )
    public String home(){
        return "redirect:/posts";
    }

}
