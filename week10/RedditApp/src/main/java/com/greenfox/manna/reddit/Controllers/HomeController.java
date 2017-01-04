package com.greenfox.manna.reddit.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mozgaanna on 04/01/17.
 */
@Controller
@RequestMapping ("/reddit")
public class HomeController {

    @ResponseBody
    @RequestMapping ("/")
    public String home(Model model){
        return "home";
    }

}
