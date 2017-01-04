package com.greenfoxacademy.java.lessons.beans;

/**
 * Created by mozgaanna on 21/12/16.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message (from HelloWorld.java): " + message);
    }
}
