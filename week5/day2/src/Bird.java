/**
 * Created by mozgaanna on 15/11/16.
 */
public class Bird extends Animal {
    void fly(){
        System.out.println("The bird can fly.");
    }

    public Bird(){
  //      super("Bird");//constructort hivtam meg
        super(2, false);
    }

    @Override
    public void speak() {
        System.out.println("chirps");
    }

    void sleep(){
        System.out.println( "The bird is sleeping.");
        super.sleep();       //methodot hivtam meg
    }

     void eat(){
         super.eat();
     }

     void nightyNight(){
         this.eat();
         this.sleep();

     }

}
