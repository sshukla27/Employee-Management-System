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
class EmpDetails implements ActionListener {
JFrame ff1;
JButton bAdd,bView,bRemove,bUpdate;
JLabel jEmp;



    EmpDetails(){ //constructor
     
           
     ff1=new JFrame("Employee Detail");
     ff1.setLayout(null);
     
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employee/icons/EmpDetails.jpg"));
     Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     
     JLabel jImg=new JLabel(i3);
     jImg.setBounds(0, 0, 800, 600);
     ff1.add(jImg);
     
     jEmp=new JLabel("Employee Details");
     jEmp.setBounds(430, 40, 600, 40);
     jEmp.setFont(new Font("serif", Font.BOLD,40));
     jEmp.setForeground(Color.black);
     jImg.add(jEmp);
     
     bAdd= new JButton("Add");
     bAdd.setBounds(430, 140, 150, 50);
     bAdd.setFont(new Font("serif", Font.BOLD,20));
     bAdd.addActionListener(this);
     jImg.add(bAdd);
     
        
    bView= new JButton("View");
     bView.setBounds(590, 140, 150, 50);
     bView.setFont(new Font("serif", Font.BOLD,20));
     bView.addActionListener(this);
     jImg.add(bView);
     
     
    bRemove= new JButton("Remove");
     bRemove.setBounds(430, 240, 150, 50);
     bRemove.setFont(new Font("serif", Font.BOLD,20));
     bRemove.addActionListener(this);
     jImg.add(bRemove);
     
     
    bUpdate= new JButton("Update");
     bUpdate.setBounds(590, 240, 150, 50);
     bUpdate.setFont(new Font("serif", Font.BOLD,20));
     bUpdate.addActionListener(this);
     jImg.add(bUpdate);
     
     
     
     ff1.setVisible(true);
     ff1.setSize(850, 600);
     ff1.setLocation(550,230);
        
        
    }
    
    

    public void actionPerformed(ActionEvent ae){
 
        if(ae.getSource()==bAdd){
            ff1.setVisible(false);
            new Add_Employee();
        }
        
        
        if(ae.getSource()==bView){
            ff1.setVisible(false);
           View_Employee viewEmp= new View_Employee();
        }
        
        
        if(ae.getSource()==bRemove){
            ff1.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==bUpdate){
            ff1.setVisible(false);
            new Search_Employee();
        }
    }

    public static void main(String[ ] arg){
       EmpDetails d = new EmpDetails();
    }



    
}
