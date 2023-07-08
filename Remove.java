package hotel.managemnet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class Remove extends JFrame implements ActionListener {
    Choice eid,cid;
    JButton delete, back,delete1,back1;
    Remove(){
        JLabel emp_id=new JLabel("Employee Id");
        emp_id.setBounds(50,50,100,30);
        add(emp_id);

        eid=new Choice();
        eid.setBounds(200,50,150,30);
        add(eid);

        try{

            Conn C= new Conn();
            String query="select * from employee";
            ResultSet rs= C.s.executeQuery(query);
            while(rs.next()){
                eid.add(rs.getString("eid"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel name=new JLabel("Name:");
        name.setBounds(50,100,100,30);
        add(name);

        JLabel emp_name= new JLabel();
        emp_name.setBounds(200,100,300,30);
        add(emp_name);

        JLabel phone=new JLabel("Phone:");
        phone.setBounds(50,150,100,30);
        add(phone);

        JLabel emp_phone= new JLabel();
        emp_phone.setBounds(200,150,100,30);
        add(emp_phone);

        JLabel email=new JLabel("Email");
        email.setBounds(50,200,100,30);
        add(email);

        JLabel emp_email= new JLabel();
        emp_email.setBounds(200,200,300,30);
        add(emp_email);

        try {

            Conn C= new Conn();
            String query="select * from employee where eid='"+eid.getSelectedItem()+"'";
            ResultSet rs = C.s.executeQuery(query);
            while(rs.next()){
                emp_name.setText(rs.getString("Name"));
                emp_phone.setText(rs.getString("Phone"));
                emp_email.setText(rs.getString("Email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        eid.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                try {

                    Conn C= new Conn();
                    String query="select * from employee where eid='"+eid.getSelectedItem()+"'";
                    ResultSet rs = C.s.executeQuery(query);
                    while(rs.next()){
                        emp_name.setText(rs.getString("Name"));
                        emp_phone.setText(rs.getString("Phone"));
                        emp_email.setText(rs.getString("Email"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        delete1 = new JButton("Delete");
        delete1.setBounds(80,300,100,30);
        delete1.setBackground(Color.BLACK);
        delete1.setForeground(Color.WHITE);
        delete1.addActionListener(this);
        add(delete1);

        back1 = new JButton("Back");
        back1.setBounds(300, 300, 100,30);
        back1.setBackground(Color.BLACK);
        back1.setForeground(Color.WHITE);
        back1.addActionListener(this);
        add(back1);

        setTitle("Employee");
        myFrame();

    }
    Remove(int i){

        JLabel cust_id=new JLabel("Customer Id");
        cust_id.setBounds(50,50,100,30);
        add(cust_id);

        cid=new Choice();
        cid.setBounds(200,50,150,30);
        add(cid);

        try{

            Conn C= new Conn();
            String query="select * from customer";
            ResultSet rs= C.s.executeQuery(query);
            while(rs.next()){
                cid.add(rs.getString("cid"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel name=new JLabel("Name:");
        name.setBounds(50,100,100,30);
        add(name);

        JLabel cust_name= new JLabel();
        cust_name.setBounds(200,100,300,30);
        add(cust_name);

        JLabel phone=new JLabel("Phone:");
        phone.setBounds(50,150,100,30);
        add(phone);

        JLabel cust_phone= new JLabel();
        cust_phone.setBounds(200,150,100,30);
        add(cust_phone);

        JLabel people=new JLabel("No. of people");
        people.setBounds(50,200,100,30);
        add(people);

        JLabel cust_people= new JLabel();
        cust_people.setBounds(200,200,100,30);
        add(cust_people);

        try {

            Conn C= new Conn();
            String query="select * from customer where cid='"+cid.getSelectedItem()+"'";
            ResultSet rs = C.s.executeQuery(query);
            while(rs.next()){
                cust_name.setText(rs.getString("Name"));
                cust_phone.setText(rs.getString("Phone"));
                cust_people.setText(rs.getString("No_of_people"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        cid.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                try {

                    Conn C= new Conn();
                    String query="select * from customer where cid='"+cid.getSelectedItem()+"'";
                    ResultSet rs = C.s.executeQuery(query);
                    while(rs.next()){
                        cust_name.setText(rs.getString("Name"));
                        cust_phone.setText(rs.getString("Phone"));
                        cust_people.setText(rs.getString("No_of_people"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        delete = new JButton("Delete");
        delete.setBounds(80,300,100,30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);

        back = new JButton("Back");
        back.setBounds(300, 300, 100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setTitle("Customer");
        myFrame();

    }

    public void myFrame(){
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        setSize(500,400);
        setLocation(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==delete){
            try {
                Conn C = new Conn();
                String query = "delete from customer where cid = '"+cid.getSelectedItem()+"'";
                C.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer Details Deleted Successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(ae.getSource()==delete1){
            try{
                Conn C = new Conn();
                String query = "delete from employee where eid = '"+eid.getSelectedItem()+"'";
                C.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Details Deleted Successfully");
                setVisible(false);
                new Home();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }else if(ae.getSource()==back){
            setVisible(false);
            new Customer();
        }else {
            setVisible(false);
            new Admin();
        }

    }
}
