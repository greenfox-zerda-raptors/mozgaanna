/**
 * Created by mozgaanna on 18/11/16.
 */
public class Student {
    String name;
    String message;


    public static void main(String[] args) {
        Student Anna = new Student();

        Anna.name = "Anna Mozga";
        Anna.message = "Thank you for your attention!";

        System.out.println(Anna.message +"\n" + Anna.name);
    }


}
