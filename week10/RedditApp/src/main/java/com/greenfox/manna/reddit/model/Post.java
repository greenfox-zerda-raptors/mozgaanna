package com.greenfox.manna.reddit.model;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mozgaanna on 04/01/17.
 */
@Entity (name = "posts")
@Getter
@Setter
@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String name;
    private String content;
    private int score;
    private String title;


    public Post(){

    }

    public Post(String title, String name, String content){
        this.title = title;
        this.name = name;
        this.content = content;
    }


    public void increment(){
        score++;
    }

    public void decrement(){
        score--;
    }


}
