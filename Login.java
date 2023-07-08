package hotel.managemnet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField text_user, text_pass;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel user=new JLabel("Username:");
        user.setBounds(40,20,100,30);
        user.setFont(new Font("Serif",Font.BOLD,20));
        add(user);

        text_user = new JTextField();
        text_user.setBounds(150,20,150,30);
        add(text_user);

        JLabel pass= new JLabel("Password:");
        pass.setBounds(40,70,100,30);
        pass.setFont(new Font("Serif",Font.BOLD,20));
        add(pass);

        text_pass = new JTextField();
        text_pass.setBounds(150,70,150,30);
        add(text_pass);

        JButton login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setFocusable(false);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        ImageIcon image=new ImageIcon("img.jpg");
        Image image1=image.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon image2=new ImageIcon(image1);
        JLabel img=new JLabel(image2);
        img.setBounds(350,0,200,200);
        add(img);

        setTitle("Login");
        setSize(600,300);
        setLocation(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            String username = text_user.getText();
            String password = text_pass.getText();
            Conn C= new Conn();
            String query="Select * from login where username ='"+username+"' and password ='"+password+"'";
            ResultSet rs=C.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                //nextclass
                //home class
                new Home();
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                setVisible(false);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
