package main.java.music;

/**
 * Created by mozgaanna on 16/11/16.
 */
public class ElectricGuitar extends StringedInstrument{
    public ElectricGuitar(){
        this(6);
    }

    public void play(){
        System.out.printf(formatForPLay, name, numberOfStrings, "Twangs");
    }

    public ElectricGuitar(int numberOfStrings){
        super(numberOfStrings, "Electric Guitar");

    }
}
y