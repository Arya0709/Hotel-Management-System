package hotel.managemnet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Update extends JFrame implements ActionListener {
    String cid,eid;
    JTextField cust_address,cust_phone,cust_people,cust_status;
    JTextField emp_email,emp_phone,emp_design, emp_status;
    JLabel cust_id,emp_id;

    JButton add,back,add1,back1;

    Update(int i,String cid){
        this.cid=cid;
        JLabel head = new JLabel("Update Customer Details");
        head.setBounds(280,30,500,50);
        head.setFont(new Font("SAN_SERIF",Font.BOLD,30));
        add(head);

        JLabel name = new JLabel("Name:");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("Serif",Font.PLAIN,20));
        add(name);

        JLabel cust_name = new JLabel();
        cust_name.setBounds(200,150,400,30);
        cust_name.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_name);

        JLabel adhaar = new JLabel("Adhaar Number:");
        adhaar.setBounds(50,200,150,30);
        adhaar.setFont(new Font("Serif",Font.PLAIN,20));
        add(adhaar);

        JLabel cust_adhaar = new JLabel();
        cust_adhaar.setBounds(200,200,300,30);
        cust_adhaar.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_adhaar);

        JLabel address = new JLabel("Address:");
        address.setBounds(50,250,150,30);
        address.setFont(new Font("Serif",Font.PLAIN,20));
        add(address);

        cust_address = new JTextField();
        cust_address.setBounds(200,250,600,30);
        cust_address.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_address);

        JLabel phone = new JLabel("Phone Number:");
        phone.setBounds(50,300,150,30);
        phone.setFont(new Font("Serif",Font.PLAIN,20));
        add(phone);

        cust_phone = new JTextField();
        cust_phone.setBounds(200,300,150,30);
        cust_phone.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_phone);

        JLabel room = new JLabel("Room Number:");
        room.setBounds(50,350,150,30);
        room.setFont(new Font("Serif",Font.PLAIN,20));
        add(room);

        JLabel cust_room = new JLabel();
        cust_room.setBounds(200,350,150,30);
        cust_room.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_room);

        JLabel people = new JLabel("Number of People:");
        people.setBounds(50,400,200,30);
        people.setFont(new Font("Serif",Font.PLAIN,20));
        add(people);

        cust_people = new JTextField();
        cust_people.setBounds(250,400,100,30);
        cust_people.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_people);


        JLabel status = new JLabel("Customer Status:");
        status.setBounds(50,450,150,30);
        status.setFont(new Font("Serif",Font.PLAIN,20));
        add(status);

        cust_status =  new JTextField();
        cust_status.setBounds(200, 450,150,30);
        cust_status.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_status);

        JLabel id = new JLabel("Customer ID:");
        id.setBounds(50,500,150,30);
        id.setFont(new Font("Serif",Font.PLAIN,20));
        add(id);

        cust_id = new JLabel();
        cust_id.setBounds(200,500,150,30);
        cust_id.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_id);

        try {
            Conn C= new Conn();
            String query="select * from customer where cid='"+cid+"'";
            ResultSet rs= C.s.executeQuery(query);
            while(rs.next()){
                cust_name.setText(rs.getString("Name"));
                cust_address.setText(rs.getString("Address"));
                cust_adhaar.setText(rs.getString("Adhaar"));
                cust_phone.setText(rs.getString("Phone"));
                cust_room.setText(rs.getString("Room_no"));
                cust_people.setText(rs.getString("No_of_people"));
                cust_status.setText(rs.getString("Status"));
                cust_id.setText(rs.getString("cid"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        add = new JButton("Update Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);

        setTitle("Customer");
        myFrame();
    }
    Update(String eid){
        this.eid=eid;
        JLabel head = new JLabel("Update Employee Details");
        head.setBounds(280,30,500,50);
        head.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(head);

        JLabel name = new JLabel("Name:");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("Serif",Font.PLAIN,20));
        add(name);

        JLabel emp_name = new JLabel();
        emp_name.setBounds(200,150,400,30);
        emp_name.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_name);

        JLabel adhaar = new JLabel("Adhaar Number:");
        adhaar.setBounds(50,200,150,30);
        adhaar.setFont(new Font("Serif",Font.PLAIN,20));
        add(adhaar);

        JLabel emp_adhaar = new JLabel();
        emp_adhaar.setBounds(200,200,300,30);
        emp_adhaar.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_adhaar);

        JLabel email = new JLabel("E-mail:");
        email.setBounds(50,250,150,30);
        email.setFont(new Font("Serif",Font.PLAIN,20));
        add(email);

        emp_email = new JTextField();
        emp_email.setBounds(200,250,600,30);
        emp_email.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_email);

        JLabel phone = new JLabel("Phone Number:");
        phone.setBounds(50,300,150,30);
        phone.setFont(new Font("Serif",Font.PLAIN,20));
        add(phone);

        emp_phone = new JTextField();
        emp_phone.setBounds(200,300,150,30);
        emp_phone.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_phone);

        JLabel designation = new JLabel("Designation:");
        designation.setBounds(50,350,150,30);
        designation.setFont(new Font("Serif",Font.PLAIN,20));
        add(designation);

        emp_design = new JTextField();
        emp_design.setBounds(200,350,150,30);
        emp_design.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_design);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setBounds(50,400,150,30);
        dob.setFont(new Font("Serif",Font.PLAIN,20));
        add(dob);

        JLabel emp_dob = new JLabel();
        emp_dob.setBounds(200,400,150,30);
        emp_dob.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_dob);


        JLabel status = new JLabel("Employee Status:");
        status.setBounds(50,450,150,30);
        status.setFont(new Font("Serif",Font.PLAIN,20));
        add(status);

        emp_status =  new JTextField();
        emp_status.setBounds(200, 450,150,30);
        emp_status.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_status);

        JLabel id = new JLabel("Employee ID:");
        id.setBounds(50,500,150,30);
        id.setFont(new Font("Serif",Font.PLAIN,20));
        add(id);

        emp_id = new JLabel(""+eid);
        emp_id.setBounds(200,500,150,30);
        emp_id.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_id);

        try {
            Conn C= new Conn();
            String query="select * from employee where eid='"+eid+"'";
            ResultSet rs= C.s.executeQuery(query);
            while(rs.next()){
                emp_name.setText(rs.getString("Name"));
                emp_adhaar.setText(rs.getString("Adhaar"));
                emp_email.setText(rs.getString("Email"));
                emp_phone.setText(rs.getString("Phone"));
                emp_dob.setText(rs.getString("DoB"));
                emp_design.setText(rs.getString("Designation"));
                emp_status.setText(rs.getString("Status"));
                emp_id.setText(rs.getString("eid"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        add1= new JButton("Add Details");
        add1.setBounds(250,550,150,40);
        add1.addActionListener(this);
        add1.setBackground(Color.BLACK);
        add1.setFocusable(false);
        add1.setForeground(Color.WHITE);
        add(add1);

        back1= new JButton("Back");
        back1.setBounds(450,550,150,40);
        back1.addActionListener(this);
        back1.setBackground(Color.BLACK);
        back1.setForeground(Color.WHITE);
        back1.setFocusable(false);
        add(back1);

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
        if(ae.getSource()==add){
            String address=cust_address.getText();
            String phone=cust_phone.getText();
            String people= cust_people.getText();
            String status=cust_status.getText();

            try{
                Conn C= new Conn();
                String query="update customer set Address='"+address+"',Phone='"+phone+"',No_of_people='"+people+"', Status='"+status+"' where cid='"+cid+"'";
                C.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details Updated Successfully");
                setVisible(false);
                new Customer();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if(ae.getSource()==add1){
            String email=emp_email.getText();
            String phone=emp_phone.getText();
            String designation= emp_design.getText();
            String status=emp_status.getText();

            try{
                Conn C= new Conn();
                String query="update employee set Email='"+email+"',Phone='"+phone+"',Designation='"+designation+"', Status='"+status+"' where eid='"+eid+"'";
                C.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details Updated Successfully");
                setVisible(false);
                new Admin();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if(ae.getSource()==back){
            setVisible(false);
            new Customer();
        }else{
            setVisible(false);
            new Admin();
        }
    }

}
