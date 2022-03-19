/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author SUDHA
 */
public class Login implements ActionListener{
    
    JFrame f;
    JLabel j1, j2;
    JButton b1, b2;
    JTextField t1;      
    JPasswordField t2;
    
    Login(){ //Constructor
        
        f=new JFrame("Login"); //creating object of JFrame.
        f.setBackground(Color.white); //Evoking method using it's object.
        f.setLayout(null);
        
       
        j1=new JLabel("Username"); //creating object of Jlable.
        j1.setBounds(40, 20,100, 30); //Evoking method using it's object.
        f.add(j1);   //adding(sticking username lable in Jframe.
        
       j2=new JLabel("Password"); //same as above.
       j2.setBounds(40, 70,100, 30);
       f.add(j2);
   
       
        t1=new JTextField();//creating object of JTextFeild(empty writtable area).
        t1.setBounds(150, 20,160 , 30); //Evoking method using it's object.
        f.add(t1); // adding or sticking textfield on Jframe.
   
        t2=new JPasswordField();
        t2.setBounds(150, 70,160 , 30);
        f.add(t2);
        
        b1=new JButton("Login");//Creating object of JButton.
        b1.setBounds(40, 140, 140, 30);//using method of JButton class using it's object.
        b1.setBackground(Color.black);//"
        b1.setForeground(Color.white);//   "  
        f.add(b1);//adding the buttons on jframe.
        b1.addActionListener(this);// Applying action Listener method for functionality which would be envoked by actionperformed(ActionEvent) method
        
        b2=new JButton("Cancel");
        b2.setBounds(180, 140, 140, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        f.add(b2);
        b2.addActionListener(this);
        
        
        
        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("employee/Icons/loginpage.jpg"));
        Image im2=im1.getImage().getScaledInstance(155, 140, Image.SCALE_DEFAULT);
        ImageIcon im3=new ImageIcon(im2);
        
         JLabel j3 = new JLabel(im3);
        j3.setBounds(390, 20, 170, 150);
        f.add(j3);
        
        f.setVisible(true);
        f.setSize(650, 300);
        f.setLocation(550, 350);
   
        f.getContentPane().setBackground(Color.white);
        
   }
        
   public void actionPerformed(ActionEvent ae){
   try{
       Conn c1=new Conn();
       String u = t1.getText(); 
       String p = t2.getText();
    
       String q= "select * from login where username='"+u+"' and password='"+p+"'";
   
       ResultSet rs = c1.s.executeQuery(q);
   
       if(rs.next()){
           
           EmpDetails em=new EmpDetails();
           f.setVisible(false);
           
       } else{
           JOptionPane.showMessageDialog(null, "Invalid Login");
           f.setVisible(true);t1.setText("");
           t2.setText("");
       }
           
           
   }catch(Exception e){e.printStackTrace();}
   
   
   }
    public static void main(String []args)
    {
        Login l=new Login();
    }

    

      
  

}