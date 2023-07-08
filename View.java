package hotel.managemnet;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.ResultSet;

public class View extends JFrame implements ActionListener {

    JTable etable,ctable;
    JButton cust_search,cust_print,cust_update,cust_back;
    JButton emp_search,emp_print,emp_update,emp_back;
    Choice eid,cid;
    View(int i){

        JLabel search = new JLabel("Search Customer by Customer ID:");
        search.setBounds(20,20,150,20);
        search.setFont(new Font("Serif",Font.PLAIN,20));
        add(search);

        cid= new Choice();
        cid.setBounds(180,20,150,30);
        cid.setFont(new Font("Serif",Font.PLAIN,20));
        add(cid);

        try{
            Conn C= new Conn();
            ResultSet rs= C.s.executeQuery("select * from customer");
            while(rs.next()){
                cid.add(rs.getString("cid"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        ctable = new JTable();
        try{
            Conn C= new Conn();
            ResultSet rs= C.s.executeQuery("select * from customer");
            ctable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane jScrollPane=new JScrollPane(ctable);
        jScrollPane.setBounds(0,100,900,600);
        add(jScrollPane);

        cust_search= new JButton("Search");
        cust_search.setBounds(20,70,80,20);
        cust_search.addActionListener(this);
        add(cust_search);

        cust_print= new JButton("Print");
        cust_print.setBounds(120,70,80,20);
        cust_print.addActionListener(this);
        add(cust_print);

        cust_update= new JButton("Update");
        cust_update.setBounds(220,70,80,20);
        cust_update.addActionListener(this);
        add(cust_update);

        cust_back= new JButton("Back");
        cust_back.setBounds(320,70,80,20);
        cust_back.addActionListener(this);
        add(cust_back);

        setTitle("Customer");
        myFrame();

    }
    View(){
        JLabel search = new JLabel("Search Employee by Employee ID:");
        search.setBounds(20,20,150,20);
        search.setFont(new Font("Serif",Font.PLAIN,20));
        add(search);

        eid= new Choice();
        eid.setBounds(180,20,150,30);
        eid.setFont(new Font("Serif",Font.PLAIN,20));
        add(eid);

        try{
            Conn C= new Conn();
            ResultSet rs= C.s.executeQuery("select * from employee");
            while(rs.next()){
                eid.add(rs.getString("eid"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        etable = new JTable();
        try{
            Conn C= new Conn();
            ResultSet rs= C.s.executeQuery("select * from employee");
            etable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }


        JScrollPane jScrollPane=new JScrollPane(etable);
        jScrollPane.setBounds(0,100,900,600);
        add(jScrollPane);

        emp_search= new JButton("Search");
        emp_search.setBounds(20,70,80,20);
        emp_search.addActionListener(this);
        add(emp_search);

        emp_print= new JButton("Print");
        emp_print.setBounds(120,70,80,20);
        emp_print.addActionListener(this);
        add(emp_print);

        emp_update= new JButton("Update");
        emp_update.setBounds(220,70,80,20);
        emp_update.addActionListener(this);
        add(emp_update);

        emp_back= new JButton("Back");
        emp_back.setBounds(320,70,80,20);
        emp_back.addActionListener(this);
        add(emp_back);

        setTitle("Employee");
        myFrame();

    }

    public void myFrame(){
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        setSize(900,700);
        setLocation(300,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==cust_search){
            String query="select * from customer where cid = '"+cid.getSelectedItem()+"'";
            try {
                Conn C = new Conn();
                ResultSet rs=C.s.executeQuery(query);
                ctable.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(ae.getSource()==cust_print){
            try{
                ctable.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }else if(ae.getSource()==cust_update){
            setVisible(false);
            new Update(1,cid.getSelectedItem());
        }else if(ae.getSource()==emp_search){
            String query="select * from employee where eid = '"+eid.getSelectedItem()+"'";
            try {
                Conn C = new Conn();
                ResultSet rs=C.s.executeQuery(query);
                etable.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(ae.getSource()==cust_print){
            try{
                etable.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }else if(ae.getSource()==emp_update){
            setVisible(false);
            new Update(eid.getSelectedItem());
        }else if(ae.getSource()==emp_back){
            setVisible(false);
            new Admin();
        }else{
            setVisible(false);
            new Customer();
        }

    }
}
