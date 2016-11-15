import com.sun.tools.javac.jvm.ClassWriter;

/**
 * Created by mozgaanna on 15/11/16.
 */
public class Animal {
    int lifeExpectancy;
    boolean isCarnivore;


    void sleep(){
        System.out.println("The animal is sleeping.");
    }
    void eat(){
        System.out.println("The animal is eating.");
    }
    void speak(){
        System.out.println("speaks");
    }

    public String toString(){
        return String.format("isCarnivore=%b, lifeExpectancy=%d",
            isCarnivore,
            lifeExpectancy
        );
    }

    public Animal (int lifeExpectancy, boolean isCarnivore){
        this.isCarnivore = isCarnivore;
        this.lifeExpectancy = lifeExpectancy;
        System.out.println("created an animal");
    }

    public Animal(){
        lifeExpectancy = 10;
        isCarnivore = false;

        //System.out.println("created an animal");
    }

    public Animal (String type){
        this();
        System.out.println(type + " animal is created");
    }

    //Misi mutatta
//    public Animal (String color, String type){
//        this(type);
//    }



}