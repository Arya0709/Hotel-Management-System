package hotel.managemnet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    Main(){
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        JLabel head=new JLabel("Family Delight");
        head.setBounds(80,20,1200,100);
        head.setFont(new Font("Serif",Font.BOLD,60));
        head.setLocation(280,0);
        head.setForeground(Color.BLUE);
        add(head);

        ImageIcon image=new ImageIcon("Page.jpg");
        Image image1=image.getImage().getScaledInstance(1000,700, Image.SCALE_DEFAULT);
        ImageIcon image2=new ImageIcon(image1);
        JLabel img=new JLabel(image2);
        img.setBounds(50,100,900,500);
        add(img);

        JButton button=new JButton("LOGIN");
        button.setBounds(0,0,100,50);
        button.setFocusable(false);
        button.setFont(new Font("Cosmic Sans ", Font.BOLD,20));
        button.setBackground(Color.blue);
        button.setForeground(Color.red);
        button.addActionListener(this);
        img.add(button);

        setTitle("Main");
        setSize(1000,700);
        setLocation(250,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new Login();

    }

    public static void main(String[] args) {
        new Main();
    }
}