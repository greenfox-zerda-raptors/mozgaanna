package com.greenfox.manna.reddit.model;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collections;
import java.util.Date;
import java.util.List;

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

    @Column(length=1048576)
    private String content;

    public int score;
    private String title;


    public Post(){

    }

    public Post(String title, String name, String content, int score){
        this.title = title;
        this.name = name;
        this.content = content;
        this.score = score;
    }





}
