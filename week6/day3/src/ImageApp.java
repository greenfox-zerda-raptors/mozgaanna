import javafx.scene.layout.BackgroundImage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mozgaanna on 23/11/16.
 */
public class ImageApp extends JFrame {
    JPanel myPanel = new JPanel();

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageApp();
            }
        });
    }

    public ImageApp(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("UI Controls");
        this.setVisible(true);
        this.add(myPanel);

        Toolkit.getDefaultToolkit().createImage("image.jpg");

        //IDK
        


    }



}
