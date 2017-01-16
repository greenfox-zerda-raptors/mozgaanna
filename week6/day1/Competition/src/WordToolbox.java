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


    public int countHowMany(char charToFind) {
        int count = 0;
        for (int i = 0; i < stringHeld.length(); i++) {
            if (stringHeld.charAt(i) == charToFind) {
                count++;
            }
        }
        return count;

    }

     public int countHowManyVowels(char vowelToFind){
         int vowels = 0;
         int vowelsA = 0;
         int vowelsE = 0;
         int vowelsI = 0;
         int vowelsO = 0;
         int vowelsU = 0;


        for (int i = 0; i < stringHeld.length(); i++){
            if ((stringHeld.charAt(i) == 'a') == true)
                vowelsA++;
            else if ((stringHeld.charAt(i) == 'e') == true)
                vowelsE++;
            else if ((stringHeld.charAt(i) == 'i') == true)
                vowelsI++;
            else if ((stringHeld.charAt(i) == 'o') == true)
                vowelsO++;
            else if ((stringHeld.charAt(i) == 'u') == true)
                vowelsU++;

        }
        return vowelsE;
    }







    @Override
    public void setS(String s) {

    }

    public String getS(){
        return stringHeld;
    }




}
