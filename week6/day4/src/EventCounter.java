import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by mozgaanna on 24/11/16.
 */
public class EventCounter extends JFrame {
    JLabel labelMouse;
    JLabel labelKeyPressed;
    JLabel labelKeyReleased;
    JLabel labelWindow;

    int mouseClick;
    int keyPress;



    public static void main(String[] args) {

        ()
    }



    public EventCounter() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Event Counter");
        this.setVisible(true);
        this.setSize(500, 400);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPosition = (dim.width / 2) - (this.getWidth() / 2);
        int yPosition = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPosition, yPosition);

        JPanel myPanel = new JPanel();
        this.add(myPanel);
        myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.PAGE_AXIS));
        myPanel.setBackground(Color.pink);

        JTextField myTextField = new JTextField("Write something");
        myTextField.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black));
        myTextField.setBackground(Color.lightGray);

        myTextField.setPreferredSize(new Dimension(400, 30));
        myTextField.setMaximumSize(new Dimension(400, 30));

        myPanel.add(myTextField);

        labelMouse = new JLabel();
        myPanel.add(labelMouse);

        labelKeyPressed = new JLabel();
        myPanel.add(labelKeyPressed);

        labelKeyReleased = new JLabel();
        myPanel.add(labelKeyReleased);

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

        }

        @Override
        public void keyPressed(KeyEvent e) {
            keyPress++;
            if (keyPress <= 1){
                labelKeyPressed.setText(keyPress + " key pressed\n");
            } else {
                labelKeyPressed.setText(keyPress + " keys pressed\n");
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {
            keyPress++;
            if (keyPress <= 1){
                labelKeyReleased.setText(keyPress + " key released\n");
            } else {
                labelKeyReleased.setText(keyPress + " keys released\n");
            }
        }
    }


    private class ListenForMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            labelMouse.setText("Mouse panel position: " + e.getX() + "" + e.getY() + "\n"
                    +"\n" + "Mouse on screen position: " + e.getXOnScreen() + "" + e.getYOnScreen());

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
            labelWindow.setText("Window is opened\n");
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