package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mozgaanna on 19/12/16.
 */
@RestController

public class HelloRESTController {

    @RequestMapping(value = "/greeting")

   public Greeting greeting(@RequestParam("name") String name){
        Greeting greeting = new Greeting("Hello, " + name, 1);
        return greeting;
   }

}
