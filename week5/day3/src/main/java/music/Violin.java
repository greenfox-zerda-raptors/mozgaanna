package main.java.music;

/**
 * Created by mozgaanna on 16/11/16.
 */
public class Violin extends StringedInstrument {
    public void play(){
        System.out.printf(formatForPLay, name, numberOfStrings, "screeches");
    }

    public Violin(){
        super(4, "Violin");
    }
}
