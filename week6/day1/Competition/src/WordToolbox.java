import com.greenfox.lesson.junit.IWordToolbox;

/**
 * Created by mozgaanna on 21/11/16.
 */
public class WordToolbox implements IWordToolbox{


    private String stringHeld;

    public WordToolbox(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    public String getStringHeld() {
        return stringHeld;
    }

    public void setStringHeld(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    public boolean isAnAnagram(String stringToCheck){
        return true;
    }

    @Override
    public void WaitingItOut() {

    }


    public int countHowMany(char charToFind){
        int count = 0;
        for (int i = 0; i < stringHeld.length(); i++){
            if (stringHeld.charAt(i) == charToFind){
                count++;
            }
        }
            return count;


    }

    @Override
    public void setS(String s) {

    }

    public String getS(){
        return stringHeld;
    }




}
