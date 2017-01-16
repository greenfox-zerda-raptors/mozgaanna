/**
 * Created by mozgaanna on 21/11/16.
 */
public class App {
    public static void main(String[] args) {

        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        System.out.println ("countHowMany(\'a\')=" + wSource.countHowMany('a')); // \\ countHowMany('a')=3
        System.out.println ("countHowMany(\'T\')=" + wSource.countHowMany('T')); // \\ countHowMany('T')=2
        System.out.println ("countHowMany(\'t\')=" + wSource.countHowMany('t')); // \\ countHowMany('t')=2
        System.out.println ("countHowMany(\'x\')=" + wSource.countHowMany('x')); // \\ countHowMany('x')=0



        System.out.println("countHowManyVowels in:" + wSource.countHowManyVowels('a'));
        System.out.println("countHowManyVowels in:" + wSource.countHowManyVowels('e'));
        System.out.println("countHowManyVowels in:" + wSource.countHowManyVowels('i'));
        System.out.println("countHowManyVowels in:" + wSource.countHowManyVowels('o'));
        System.out.println("countHowManyVowels in:" + wSource.countHowManyVowels('u'));


    }
}
