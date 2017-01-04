package com.greenfox.manna.reddit.controllers;

import com.greenfox.manna.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mozgaanna on 04/01/17.
 */

@Controller
@RequestMapping ("/posts")
public class PostsController {

    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listPosts(Model model){
        model.addAttribute("posts", repository.findAll());
        return "posts/post";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPosts(Model model){
        return "";
    }

}
