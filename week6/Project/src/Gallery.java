import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by mozgaanna on 25/11/16.
 */
public class Gallery extends JFrame {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gallery();
            }
        });
    }

    JPanel mainPanel;
    JPanel upPanel;
    JPanel downPanel;


    JLabel upperImageLabel;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;

    ImageIcon image1;
    ImageIcon image2;
    ImageIcon image3;
    ImageIcon image4;
    ImageIcon image5;
    ImageIcon image6;

    JButton upLeftButton;
    JButton upRightButton;

    ArrayList<JLabel> myLabels = new ArrayList<JLabel>();
    int index;


    public Gallery() {
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Manna Gallery");
        this.setVisible(true);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();


//UPPANEL

        upPanel = new JPanel();
        this.add(upPanel);
        upPanel.setLayout(new BoxLayout(upPanel, BoxLayout.X_AXIS));


        JButton upLeftButton = new JButton("<");
        upLeftButton.setBorderPainted(false);
        ListenForLeftButton forLeftButton = new ListenForLeftButton();
        upLeftButton.addActionListener(forLeftButton);

        upLeftButton.setFont(new Font("Serif", Font.BOLD, 42));
        upPanel.add(upLeftButton);


        image1 = new ImageIcon("fox1.jpg");
        upperImageLabel = new JLabel(image1);


        upperImageLabel.setPreferredSize(new Dimension(300, 300));
        upperImageLabel.setMaximumSize(new Dimension(400, 300));
        upPanel.add(upperImageLabel);

        JButton upRightButton = new JButton(">");
        upRightButton.setBorderPainted(false);
        ListenForRightButton forRightButton = new ListenForRightButton();
        upRightButton.addActionListener(forRightButton);
        upRightButton.setFont(new Font("Serif", Font.BOLD, 42));
        upPanel.add(upRightButton);


//DOWNPANEL

        downPanel = new JPanel();
        this.add(downPanel);
        downPanel.setLayout(new BoxLayout(downPanel, BoxLayout.X_AXIS));


        image2 = new ImageIcon("fox2.jpg");
        label2 = new JLabel(image2);
        downPanel.add(label2);

        image3 = new ImageIcon("fox3.jpg");
        label3 = new JLabel(image3);
        downPanel.add(label3);

        image4 = new ImageIcon("fox4.jpg");
        label4 = new JLabel(image4);
        downPanel.add(label4);

        image5 = new ImageIcon("fox5.jpg");
        label5 = new JLabel(image5);
        downPanel.add(label5);

        image6 = new ImageIcon("fox6.jpg");
        label6 = new JLabel(image6);
        downPanel.add(label6);


//MAINPANEL

        mainPanel = new JPanel();
        mainPanel.add(upPanel);
        mainPanel.add(downPanel);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        this.add(mainPanel);


        this.pack();
        int xPosition = (dim.width / 2) - (this.getWidth() / 2);
        int yPosition = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPosition, yPosition);

        myLabels = new ArrayList(Arrays.asList(upperImageLabel, label2, label3, label4, label5, label6));

    }

    private class ListenForLeftButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            index--;
            if(index < 0) {
                index = myLabels.size() -1;}
            upperImageLabel.setIcon(myLabels.get(index).getIcon());
        }
    }

    private class ListenForRightButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            index++;
            if(index == myLabels.size()) {
                index = 0;}
            upperImageLabel.setIcon(myLabels.get(index).getIcon());
        }

    }

}





