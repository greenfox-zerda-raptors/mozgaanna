package com.greenfoxacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mozgaanna on 20/12/16.
 */
@Controller
public class HelloController {


    @RequestMapping (value = "/helloThymeleaf")
    public String hello(Model model, @RequestParam(required = false, defaultValue = "Thymeleaf") String name){
        model.addAttribute("name", name);

        Date today = new Date();
        model.addAttribute("time", today);
        return "hello";
    }

}
