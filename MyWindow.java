package Rishabh;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JFrame;

public class MyWindow extends JFrame
 {
    private JLabel heading;
    private JLabel clockLabel;


    private Font font = new Font("", Font.BOLD, 35);
    MyWindow()
    {
        super.setTitle("Digital Clock");
        super.setSize(500, 200);
        super.setLocation(300, 50);
        this.createGUI();
        this.startClock();

        super.setVisible(true);


    }
    public void createGUI()
    {
        // GUI
        heading = new JLabel("Here is Your Good Time!");
        clockLabel = new JLabel("Clock");
        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);

    }
    public void startClock()
    {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String dateTime = new Date().toString();
              String dateTime = new Date().toLocaleString();
//                Date d = new Date();
//                SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss a");
//                String dateTime = sfd.format(d);

                clockLabel.setText(dateTime);

            }
        });
        timer.start();
    }

    
}
