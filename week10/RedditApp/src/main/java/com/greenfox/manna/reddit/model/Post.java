package com.greenfox.manna.reddit.model;

import groovy.transform.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mozgaanna on 04/01/17.
 */
@Entity (name = "posts")
//@Getter
//@Setter
@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String content;
    private int score;


    public Post(){

    }

    public Post(long id, String name, String content, int score){
        this.id = id;
        this.name = name;
        this.content = content;
        this.score = score;
    }
}
