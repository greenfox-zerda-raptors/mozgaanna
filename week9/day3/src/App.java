import com.greenfoxacademy.java.lessons.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Created by mozgaanna on 21/12/16.
 */


public class App {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

        WithFries withFries = new WithFries();
        System.out.println(withFries.toString());
        withFries.toggleFlSalted();
        System.out.printf("Just toggled withFries and now they are '%s'.", withFries.toString());

    }
}