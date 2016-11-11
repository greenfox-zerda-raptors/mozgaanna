import java.util.Random;
import java.util.Scanner;

/**
 * Created by mozgaanna on 11/11/16.
 */


public class Project{
    public static void main (String... args){
        Random randomGenerator = new Random();
        Scanner userInput = new Scanner(System.in);

        int guess;

        System.out.println();
        int number = randomGenerator.nextInt(100) + 1;

        System.out.println("Okay, I've got a number.  You should be able to figure that out in 6 goes, let's begin.  \n");

        int rounds = 0;


        do {
            rounds++;
            if (rounds <= 2 ) {
                System.out.println("Guess");
            } else if (rounds >= 3 || rounds <= 4) {
                System.out.println("Guess again dickhead!");
            } else {
                System.out.println("Come oooon, guess again dickhead!");
            }
            
            guess = userInput.nextInt();


            if (guess > number) {
                System.out.println("You're so high, you Retard!!!!");
            } else if (guess < number) {
                System.out.println("You're low, dumbass!");
            } else {
                System.out.println("Yes, you got it! Finally -.-'' " );
            }
        } while (guess != number && rounds < 6);
        if (rounds > 6) {
            System.out.println("You fucking loser!");
        }
        System.out.println("It was " + number + "! Bye Bitch!");
    }

}