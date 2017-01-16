import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mozgaanna on 17/11/16.
 */
public class App {
    static boolean forExit = false;
    static ArrayList <ToDo> tasks = new ArrayList<ToDo>();
    static Scanner userInput = new Scanner(System.in);



    public static void main(String[] args) {
        printUsage();

            tasks.add(new ToDo("Walk the dog"));
            tasks.add(new ToDo("Go to Greenfox"));
            tasks.add(new ToDo("Write your code"));
            tasks.add(new ToDo("Have Fun!"));
            tasks.add(new ToDo("Mental breakdown"));

        while (forExit == false) {
            command();
        }

    }



    public static void command(){
        String s = userInput.nextLine();
        handleInput(s);
    }

    public static void printUsage(){
        System.out.println("Select an option!");
        System.out.println();
        System.out.println("Type 'list' to list all the tasks. ");
        System.out.println("   Shorthand for list: 'l' ");
        System.out.println("Type 'add' to add a new task");
        System.out.println("   Shorthand for add: 'a' ");
        System.out.println("Type 'remove' to remove a task");
        System.out.println("   Shorthand for remove: 'r' ");
        System.out.println("Type 'complete' to make a task completed");
        System.out.println("   Shorthand for complete: 'c' ");
        System.out.println("Type 'help' to print out this list again");
        System.out.println("   Shorthand for help: 'h' ");
        System.out.println("Type 'exit' to quit");
        System.out.println("   Shorthand for exit: 'e' ");
        System.out.println();

    }

    public static void handleInput (String command){
        if (command.contentEquals("list") || command.contentEquals("l")){

           for (int i = 0; i < tasks.size(); i++) {
               String s = tasks.get(i).toString();
               System.out.println(s);
           }

            if (tasks.isEmpty()){
                System.out.println("No todos for today! :)");
            }

        }
        if (command.contentEquals("add") || command.contentEquals("a")) {
            System.out.print("Please type the name of the task you want to add: ");
            String taskName = userInput.nextLine();


                if (taskName.length() == 0) {
                    System.out.print("Unable to add: No task is provided.");
                } else {
                    tasks.add(new ToDo(taskName));
                }





        }
        if (command.contentEquals("remove") || command.contentEquals("r")){
            System.out.print("Please type the number of the task you want to remove: ");
            String taskName = userInput.nextLine();
            int removeNumber = Integer.parseInt(taskName);
            tasks.remove(removeNumber);

        }
        if (command.contentEquals("complete") || command.contentEquals("c")){
            System.out.println("Please type the name of the task you want to set to completed: ");
            String taskName = userInput.nextLine();
            int completeNumber = Integer.parseInt(taskName);
            tasks.get(completeNumber).complete();
        }
        if (command.contentEquals("help") || command.contentEquals("h")){
            printUsage();
        }
        if (command.contentEquals("exit") || command.contentEquals("e")){
            forExit = true;

        }
    }




}
