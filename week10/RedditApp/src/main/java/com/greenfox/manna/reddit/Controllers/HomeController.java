package com.greenfox.manna.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mozgaanna on 04/01/17.
 */
@Controller
@RequestMapping ("/reddit")
public class HomeController {

    @ResponseBody
    @RequestMapping (value="", method= RequestMethod.GET )
    public String home(){
        return "home";
    }

}
