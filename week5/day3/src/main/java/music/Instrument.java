package main.java.music;

/**
 * Created by mozgaanna on 16/11/16.
 */
public abstract class Instrument  {
    public Instrument(){
    }

    protected String name;

    public Instrument(String name){
        this.name = name;
    }

    public abstract void play();

}
