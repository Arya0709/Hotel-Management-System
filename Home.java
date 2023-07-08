package hotel.managemnet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    JButton customer,admin,back;
    Home(){
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        customer= new JButton("CUSTOMER");
        customer.setBounds(120,50,150,30);
        customer.setFocusable(false);
        customer.addActionListener(this);
        add(customer);

        admin= new JButton("ADMIN");
        admin.setBounds(120,100,150,30);
        admin.setFocusable(false);
        admin.addActionListener(this);
        add(admin);

        back= new JButton("BACK");
        back.setBounds(120,150,150,30);
        back.setFocusable(false);
        back.addActionListener(this);
        add(back);

        setTitle("Home");
        setSize(400,300);
        setLocation(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==customer){
            setVisible(false);
            new Customer();
        }
        else if(ae.getSource()==admin){
            setVisible(false);
            new Admin();
        }
        else{
            setVisible(false);
            new Main();
        }
    }
}
