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

        System.out.println("Hello World. Do you wanna play a game? I've got a number. You have 6 guesses. Let the game begin.  \n");

        int rounds = 0;


        do {
            rounds++;
            if (rounds <= 2 ) {
                System.out.println("Guess");
            } else if (rounds >= 5 ) {
                System.out.println("Come oooon, guess again, moron!");
            } else {
                System.out.println("Guess again!");
            }
            
            guess = userInput.nextInt();


            if (guess > number) {
                System.out.println("You're high, pothead!");
            } else if (guess < number) {
                System.out.println("You're low!");
            } else {
                System.out.println("Yes, you got it! Finally -.-'' " );
            }
        } while (guess != number && rounds < 6);
        if (rounds >= 6) {
            System.out.println("Oh, you bloody loser!");
        }
        System.out.println("It was " + number + "! Game over! ");
    }

}