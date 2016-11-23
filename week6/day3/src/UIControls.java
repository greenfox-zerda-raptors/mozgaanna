import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mozgaanna on 23/11/16.
 */
public class UIControls extends JFrame implements ActionListener{
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UIControls();
            }
        });
    }

    JPanel myPanel = new JPanel();
    JTextField myField = new JTextField();
    JLabel label1 = new JLabel("Input text");
    JLabel label2 = new JLabel("Memory");

    public UIControls(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("UI Controls");
        this.setVisible(true);
        this.add(myPanel);

        myPanel.add(myField);
        myPanel.add(label1);
        myPanel.add(label2);
        myPanel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.darkGray));
        myPanel.setBackground(Color.pink);

        myField.addActionListener(this);
        myField.setColumns(20);
        myField.setLayout(new FlowLayout());
        myField.setText("Please type something");


        JButton clearButton = new JButton("Clear memory");
        myPanel.add(clearButton);

        myField.setAlignmentX(Component.TOP_ALIGNMENT);
        clearButton.setAlignmentX(Component.BOTTOM_ALIGNMENT);

        this.pack();

        clearButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label1.setText("Input text");
                        label2.setText("Memory");
                        myField.setText("Please type something");
                        myField.requestFocus();
                    }

                }
        );

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label2.setText(label1.getText());
        label1.setText(myField.getText());
        myField.setText("");

    }

}
