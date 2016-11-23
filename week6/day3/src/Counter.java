import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by mozgaanna on 23/11/16.
 */
public class Counter extends JFrame{
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter();
            }
        });
    }

    public int clicks;


    public Counter(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Basic Example Application");

        this.setVisible(true);

        this.setSize(350, 60);

        JPanel buttonPanel = new JPanel();
        this.add(buttonPanel);

        JLabel buttonLabel = new JLabel();
        buttonPanel.add(buttonLabel);

        JButton theButton = new JButton();

        theButton.setText("Press me!");
        buttonPanel.add(theButton);
        buttonLabel.setText("Clicked " + clicks + " times");

        theButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicks++;
                        buttonLabel.setText("Clicked " + clicks + " times");

                    }
                }
        );


        JButton resetButton = new JButton();
        resetButton.setText("Reset");
        buttonPanel.add(resetButton);

        resetButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicks = 0;
                        buttonLabel.setText("Clicked " + clicks + " times");
                    }
                }
        );







    }


}
