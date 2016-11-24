import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by mozgaanna on 24/11/16.
 */
public class EventCounter extends JFrame {
    JLabel labelMouse;
    JLabel labelKey;
    JLabel labelWindow;

    int mouseClick;
    int keyPress;



    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventCounter();
            }
        });
    }



    public EventCounter() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Event Counter");
        this.setVisible(true);
        this.setSize(400, 400);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPosition = (dim.width / 2) - (this.getWidth() / 2);
        int yPosition = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPosition, yPosition);

        JPanel myPanel = new JPanel();
        this.add(myPanel);

        JTextField myTextField = new JTextField("Write something");
        myTextField.setSize(20, 20);
        this.add(myTextField);

        labelMouse = new JLabel();
        myPanel.add(labelMouse);

        labelKey = new JLabel();
        myPanel.add(labelKey);

        labelWindow = new JLabel();
        myPanel.add(labelWindow);



        ListenForKeys lForKeys = new ListenForKeys();
        myTextField.addKeyListener(lForKeys);

        ListenForMouse lForMouse = new ListenForMouse();
        this.addMouseListener(lForMouse);

        ListenForWindow lForWindow = new ListenForWindow();
        this.addWindowListener(lForWindow);


    }


    private class ListenForKeys implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            keyPress++;
            labelKey.setText(keyPress + "key pressed");
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }


    private class ListenForMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }


    private class ListenForWindow implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }

}