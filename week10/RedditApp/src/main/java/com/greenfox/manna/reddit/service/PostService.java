package com.greenfox.manna.reddit.service;

import com.greenfox.manna.reddit.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mozgaanna on 10/01/17.
 */

@Service
public class PostService {

    PostRepository repository;

    @Autowired
    public PostService(PostRepository repository){
        this.repository = repository;
    }
    public List<Post> sortPostByScore() {
        return repository.findByOrderByScoreDesc();
    }
    public void save(Post post){
        repository.save(post);
    }




    public void delete(long id){
        repository.delete(id);
    }







    public Post findPost(long id) {
        return repository.findOne(id);
    }
    public void upvote(long id){
        Post post = repository.findOne(id);
        post.score++;
        save(post);
    }




    public void downvote(long id){
        Post post = repository.findOne(id);
        post.score--;
        repository.save(post);
    }
    public void update(long id, String content, String title){
        Post post = repository.findOne(id);
        post.setContent(content);
        post.setTitle(title);
        repository.save(post);
    }




}
