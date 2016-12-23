package androidapp.greenfox.com.christmasapp;


import java.util.Date;

/**
 * Created by mozgaanna on 23/12/16.
 */

public class Message{
     String username;
     String body;
     Date time;

    public Message(String username, String message){
        this.username = username;
        this.body = message;
    }

    public Message(){

    }


}
