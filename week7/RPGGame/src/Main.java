import javax.swing.*;
import java.awt.*;

/**
 * Created by mozgaanna on 05/12/16.
 */
public class Main extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });

    }

    Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Manna RPG");
        this.setPreferredSize(new Dimension(720, 720));
        this.setVisible(true);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();



        this.add(new Board());



//        this.setSize(720, 720);
        this.pack();
        int xPosition = (dim.width / 2) - (this.getWidth() / 2);
        int yPosition = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPosition, yPosition);
    }

}
