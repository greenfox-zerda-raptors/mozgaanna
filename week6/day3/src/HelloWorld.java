/**
 * Created by mozgaanna on 23/11/16.
 */
import javax.swing.*;
import java.awt.*;


public class HelloWorld extends JFrame {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloWorld();
            }
        });

    }


    public HelloWorld(){
        this.setTitle("Anna's First JFrame");

        this.setVisible(true);

        this.setSize(400, 400);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel myPanel = new JPanel();

        this.add(myPanel);

        JLabel label1 = new JLabel("Pamparampampam");

        label1.setText("Hello Anna!");

        myPanel.add(label1);

        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

        //First solution with help
//        for (String hello : hellos) {
//            JLabel labelHello = new JLabel(hello);
//            myPanel.add(labelHello);
//        }

        //Second solution by myself
        for (int i = 0; i < hellos.length; i++){
            JLabel labelHello = new JLabel(hellos[i] + " World");
            myPanel.add(labelHello);
        }

        Toolkit tk = Toolkit.getDefaultToolkit();

        Dimension dim = tk.getScreenSize();

        int xPosition = (dim.width / 2) - (this.getWidth() / 2);

        int yPosition = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPosition, yPosition);





    }

}
