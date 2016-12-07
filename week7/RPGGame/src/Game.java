import javax.swing.*;
import java.awt.*;

/**
 * Created by mozgaanna on 07/12/16.
 */
public class Game extends JFrame {
    Board board;

    Game(){
        board = new Board();
        this.add(board);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Manna RPG");
        this.setPreferredSize(new Dimension(572, 720));
        this.setVisible(true);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();


        this.addKeyListener(board);


        this.pack();
        int xPosition = (dim.width / 2) - (this.getWidth() / 2);
        int yPosition = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPosition, yPosition);
    }

}
