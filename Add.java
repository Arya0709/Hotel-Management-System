package hotel.managemnet;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Add extends JFrame implements ActionListener {
    Random ran = new Random();
    Random r =  new Random();
    int num = ran.nextInt(999999);
    int eid = r.nextInt(1000);
    JTextField cust_name,cust_address,cust_adhaar,cust_phone,cust_room,cust_people;
    JTextField emp_name,emp_adhaar,emp_email,emp_phone;
    JDateChooser emp_dob;
    JComboBox cust_status, emp_design, emp_status;
    JButton add, back, add1, back1;
    JLabel cust_id,emp_id;
    Add(int i){

        JLabel head = new JLabel("Add Customer Details");
        head.setBounds(320,30,500,50);
        head.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(head);

        JLabel name = new JLabel("Name:");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("Serif",Font.PLAIN,20));
        add(name);

        cust_name = new JTextField();
        cust_name.setBounds(200,150,400,30);
        cust_name.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_name);

        JLabel adhaar = new JLabel("Adhaar Number:");
        adhaar.setBounds(50,200,150,30);
        adhaar.setFont(new Font("Serif",Font.PLAIN,20));
        add(adhaar);

        cust_adhaar = new JTextField();
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

        cust_room = new JTextField();
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

        String occ[]={"Select","Checked-in","Checked-out","Arriving"};
        cust_status =  new JComboBox(occ);
        cust_status.setBounds(200, 450,150,30);
        cust_status.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_status);

        JLabel id = new JLabel("Customer ID:");
        id.setBounds(50,500,150,30);
        id.setFont(new Font("Serif",Font.PLAIN,20));
        add(id);

        cust_id = new JLabel(""+num);
        cust_id.setBounds(200,500,150,30);
        cust_id.setFont(new Font("Serif",Font.PLAIN,20));
        add(cust_id);

        add= new JButton("Add Details");
        add.setBounds(250,550,150,40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setFocusable(false);
        add.setForeground(Color.WHITE);
        add(add);

        back= new JButton("Back");
        back.setBounds(450,550,150,40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        add(back);

        setTitle("Customer Details");
        myFrame();

    }

    Add(){
        JLabel head = new JLabel("Add Employee Details");
        head.setBounds(320,30,500,50);
        head.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(head);

        JLabel name = new JLabel("Name:");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("Serif",Font.PLAIN,20));
        add(name);

        emp_name = new JTextField();
        emp_name.setBounds(200,150,400,30);
        emp_name.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_name);

        JLabel adhaar = new JLabel("Adhaar Number:");
        adhaar.setBounds(50,200,150,30);
        adhaar.setFont(new Font("Serif",Font.PLAIN,20));
        add(adhaar);

        emp_adhaar = new JTextField();
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

        String design[]={"Select","Cleaner","Cook","Security","Waiter","Manager","Assistant Manager","Receptionist"};
        emp_design = new JComboBox(design);
        emp_design.setBounds(200,350,150,30);
        emp_design.setFont(new Font("Serif",Font.PLAIN,20));
        emp_design.setBackground(Color.WHITE);
        add(emp_design);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setBounds(50,400,150,30);
        dob.setFont(new Font("Serif",Font.PLAIN,20));
        add(dob);

        emp_dob = new JDateChooser();
        emp_dob.setBounds(200,400,150,30);
        emp_dob.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp_dob);


        JLabel status = new JLabel("Employee Status:");
        status.setBounds(50,450,150,30);
        status.setFont(new Font("Serif",Font.PLAIN,20));
        add(status);

        String avail[]={"Select","Available","Unavailable","On Leave"};
        emp_status =  new JComboBox(avail);
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

        setTitle("Employee Details");
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
            String name=cust_name.getText();
            String address=cust_address.getText();
            String adhaar=cust_adhaar.getText();
            String phone=cust_phone.getText();
            String room= cust_room.getText();
            String people=cust_people.getText();
            String status=(String) cust_status.getSelectedItem();
            String id= cust_id.getText();

            try {
                Conn C =  new Conn();
                String query="insert into customer values('"+name+"','"+address+"','"+adhaar+"','"+phone+"','"+room+"','"+people+"','"+status+"','"+id+"')";
                C.s.execute(query);
                JOptionPane.showMessageDialog(null,"Customer Details added successfully");
                setVisible(false);
                new Customer();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if(ae.getSource()==add1){
            String name=emp_name.getText();
            String adhaar=emp_adhaar.getText();
            String email=emp_email.getText();
            String phone=emp_phone.getText();
            String dob= (((JTextField) emp_dob.getDateEditor().getUiComponent()).getText());
            String design=(String)emp_design.getSelectedItem();
            String status=(String) emp_status.getSelectedItem();
            String id= emp_id.getText();

            try {
                Conn C = new Conn();
                String query="insert into employee values('"+name+"','"+adhaar+"','"+email+"','"+phone+"','"+dob+"','"+design+"','"+status+"','"+id+"')";
                C.s.execute(query);
                JOptionPane.showMessageDialog(null,"Employee Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Admin();
        }
    }
}
