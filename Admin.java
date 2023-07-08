package hotel.managemnet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    JButton add, view, update,remove,back;
    Admin(){
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        JLabel head=new JLabel("Add Employee");
        head.setBounds(330,50,400,50);
        head.setFont(new Font("Serif",Font.BOLD,40));
        add(head);

        add = new JButton("Add Employee");
        add.setBounds(400,200,150,40);
        add.setFocusable(false);
        add.addActionListener(this);
        add(add);

        view = new JButton("View Employee");
        view.setBounds(400,300,150,40);
        view.setFocusable(false);
        view.addActionListener(this);
        add(view);

        update = new JButton("Update Employee");
        update.setBounds(400,400,150,40);
        update.setFocusable(false);
        update.addActionListener(this);
        add(update);

        remove = new JButton("Remove Employee");
        remove.setBounds(400,500,150,40);
        remove.setFocusable(false);
        remove.addActionListener(this);
        add(remove);

        back= new JButton("BACK");
        back.setBounds(700,500,150,40);
        back.setFocusable(false);
        back.addActionListener(this);
        add(back);

        setSize(1000,700);
        setTitle("Admin");
        setLocation(250,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==add){
            setVisible(false);
            new Add();

        }else if(ae.getSource()==view){
            setVisible(false);
            new View();

        }else if(ae.getSource()==update) {
            setVisible(false);
            new View();

        } else if (ae.getSource()==remove) {
            setVisible(false);
            new Remove();

        }else{
            setVisible(false);
            new Home();

        }
    }
}
