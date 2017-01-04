package com.calorie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mozgaanna on 02/01/17.
 */

@Entity
@Table (name = "meals")
@Getter
@Setter
@ToString
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Date date;
    private String type;
    private String description;
    private Integer calories;


    public Meal(){

    }

    public Meal(Date date, String type, String description, Integer calories) {
        this.date = date;
        this.type = type;
        this.description = description;
        this.calories = calories;
    }
}
