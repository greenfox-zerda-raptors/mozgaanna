import javax.swing.*;
import java.awt.*;

/**
 * Created by mozgaanna on 05/12/16.
 */
public class Main {
    Game game = new Game();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });

    }
}
