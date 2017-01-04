package com.calorie;

import com.calorie.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by mozgaanna on 02/01/17.
 */

@Controller
@RequestMapping("/meals")
public class MealController {


    @Autowired
    private MealRepository repository;

    @RequestMapping(value="", method=RequestMethod.GET )
    public String listMeals(Model model){
        model.addAttribute("meals", repository.findAll());
       return "meals/list";


    }
}
