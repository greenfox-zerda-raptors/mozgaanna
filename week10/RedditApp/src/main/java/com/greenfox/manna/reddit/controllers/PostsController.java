package com.greenfox.manna.reddit.controllers;

import com.greenfox.manna.reddit.model.Post;
import com.greenfox.manna.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by mozgaanna on 04/01/17.
 */

@Controller
@RequestMapping ("/posts")
public class PostsController {

    @Autowired
    private PostService service;

    @GetMapping(value = "")
    public String listPosts(Model model){
        model.addAttribute("posts",
                service.sortPostByScore());
        return "posts/post";
    }




    @GetMapping("/add")
    public String createPosts(Model model) {
        model.addAttribute("post", new Post());
        return "posts/add";
    }
    @PostMapping(value = "/add")
    public String addPosts(@ModelAttribute Post post){
        service.save(post);
        return "redirect:/posts";
    }






    @GetMapping(value = "/{id}/delete")
    public ModelAndView delete(@PathVariable long id) {
        service.delete(id);
        return new ModelAndView("redirect:/posts");
    }




    @GetMapping(value = "/{id}/edit")
    public String edit(@PathVariable long id,
                       Model model) {
        model.addAttribute("post", service.findPost(id));
        return "posts/edit";
    }
    @PostMapping(value = "/edit")
    public String update(@ModelAttribute Post post) {
        service.save(post);
        return "redirect:/posts";
    }
    @PostMapping(value = "/update")
    public String update(@RequestParam("post_id") long id,
                         @RequestParam("content") String content,
                         @RequestParam("title") String title) {
        service.update(id, content, title);
        return "redirect:/posts";
    }






    @RequestMapping(value = "/{id}/upvote")
    public String upvote(@PathVariable("id") long id) {
        service.upvote(id);
        return "redirect:/posts";
    }
    @RequestMapping(value = "/{id}/downvote")
    public String downvote(@PathVariable("id") long id) {
        service.downvote(id);
        return "redirect:/posts";
    }




}
