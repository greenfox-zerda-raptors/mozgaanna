import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JLabel label1;
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

        upperImageLabel = new JLabel();
        upperImageLabel.setPreferredSize(new Dimension(780, 380));
        upperImageLabel.setMaximumSize(new Dimension(780, 380));
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

        myLabels = new ArrayList<>();
        for (int i = 1; i <= 6; i++){
            image1 = new ImageIcon("image" + i + ".jpg");
            label1 = new JLabel(image1);
            label1.setPreferredSize(new Dimension(100, 100));
            downPanel.add(label1);
            myLabels.add(label1);
        }

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





