package main.java.music;

/**
 * Created by mozgaanna on 16/11/16.
 */
public class ElectricBassGuitar extends StringedInstrument {
    public ElectricBassGuitar(){
        this(4);
    }

    public void play(){
        System.out.printf(formatForPLay, name, numberOfStrings, "Duum-duum-duum");
    }

    public ElectricBassGuitar(int numberOfStrings){
        super(numberOfStrings, "Electric Bass Guitar");
    }
}
