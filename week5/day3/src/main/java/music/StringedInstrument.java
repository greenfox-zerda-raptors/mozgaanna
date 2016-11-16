package main.java.music;

/**
 * Created by mozgaanna on 16/11/16.
 */
public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;
    final String formatForPLay = "%s, a %d-stringed instrument that %s\n";


    public StringedInstrument(int numberOfStrings, String name){
        super(name);
        this.numberOfStrings = numberOfStrings;

    }

}
