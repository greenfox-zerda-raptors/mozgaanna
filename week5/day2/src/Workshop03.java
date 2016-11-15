/**
 * Created by mozgaanna on 15/11/16.
 */
public class Workshop03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Testing Animal");
        animal.speak();
        animal.sleep();
        System.out.println(animal.toString());


        System.out.println("\nTesting Bird");
        bird.speak();
        bird.sleep();
        bird.fly();
        System.out.println(bird.toString());

        System.out.println("\nTesting Dog");
        dog.speak();
        dog.sleep();
        dog.beg();
        System.out.println(dog.toString());


        System.out.println("\nTesting Dog2");
        Animal dog2 = new Dog();
        dog2.speak();
        dog2.sleep();
        System.out.println(dog2.toString());


        System.out.println("\nTesting Dog 'd'");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

    }
}
