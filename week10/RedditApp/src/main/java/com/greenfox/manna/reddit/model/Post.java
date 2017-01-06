package com.greenfox.manna.reddit.model;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private String content;
    private int score;
    private String title;
    private Date date;


    public Post(){

    }

    public Post(String title, String name, String content, Date date){
        this.title = title;
        this.name = name;
        this.content = content;
        this.date = date;
    }


    public void increment(){
        score++;
    }

    public void decrement(){
        score--;
    }



//
//    public List<Integer> sortAscending(List<Integer> id){
//        Collections.sort(id);
//        return id;
//    }

}
