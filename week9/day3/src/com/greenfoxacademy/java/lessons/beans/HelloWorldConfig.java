package com.greenfoxacademy.java.lessons.beans;
import org.springframework.context.annotation.*;

/**
 * Created by mozgaanna on 21/12/16.
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}

