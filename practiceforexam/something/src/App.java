/**
 * Created by mozgaanna on 30/11/16.
 */
public class App extends  Object{

    public static void main(String[] args) {
        Book lotr = new Book("Lord of the Rings", 1955);
        Book lot2 = new Book("Lord of the Rings 2", 1958);
        System.out.println("I love " + lotr.toString() + ", because it is great!");
        System.out.println("Books: " + Book.count);
    }
}
