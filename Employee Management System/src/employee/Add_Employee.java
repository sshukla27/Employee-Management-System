/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author SUDHA
 */
class Add_Employee implements ActionListener{
    
    //declare object of classes of swing and awt classes.
    JFrame f1;
    JLabel lName,lAge,lAddress,lEmail,lJpost,lEmpID,lFName,lDob,lPhNo,lEdu,lAdhar,lFormTitle;
    JTextField tN,tA, tAdd,tEmail, tJpost,tempId,tFName,tDob,tPhNo,tEdu,tAdhar;
    JButton b1,b2;
    
    
Add_Employee(){ //Constructor
    
    f1=new JFrame("Add Employee");
    f1.setBackground(Color.white);
    f1.setLayout(null);
    
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employee/icons/addEmp.jpg"));
    Image i2=i1.getImage().getScaledInstance(1150, 830, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    
    JLabel jImg=new JLabel(i3);
    jImg.setBounds(0, 0, 1150, 830);
   f1.add(jImg);
   
  
   
  lFormTitle=new JLabel("New Employee Details");
   lFormTitle.setBounds(320, 30, 500, 50);
   lFormTitle.setFont(new Font("serif", Font.BOLD, 25));
   lFormTitle.setForeground(Color.black);
   jImg.add(lFormTitle);
 

    lName = new JLabel("Name");
        lName.setBounds(50,150,100,30);
        lName.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lName);
   
   tN=new JTextField();
        tN.setBounds(200,150,150,30);
        jImg.add(tN);
        
         lFName = new JLabel("Father's Name");
        lFName.setBounds(400,150,200,30);
        lFName.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lFName);

        tFName=new JTextField();
        tFName.setBounds(600,150,150,30);
        jImg.add(tFName);

        lAge= new JLabel("Age");
        lAge.setBounds(50,200,100,30);
        lAge.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lAge);

        tA=new JTextField();
        tA.setBounds(200,200,150,30);
        jImg.add(tA);

        lDob= new JLabel("Date Of Birth");  
        lDob.setBounds(400,200,200,30);
        lDob.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lDob);

        tDob=new JTextField();
        tDob.setBounds(600,200,150,30);
        jImg.add(tDob);

        lAddress= new JLabel("Address");
        lAddress.setBounds(50,250,100,30);
        lAddress.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lAddress);

        tAdd=new JTextField();
        tAdd.setBounds(200,250,150,30);
        jImg.add(tAdd);

        lPhNo= new JLabel("Phone");
        lPhNo.setBounds(400,250,100,30);
        lPhNo.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lPhNo);

        tPhNo=new JTextField();
        tPhNo.setBounds(600,250,150,30);
        jImg.add(tPhNo);

        lEmail= new JLabel("Email Id");
        lEmail.setBounds(50,300,100,30);
        lEmail.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lEmail);

        tEmail=new JTextField();
        tEmail.setBounds(200,300,150,30);
        jImg.add(tEmail);

        lEdu= new JLabel("Education");
        lEdu.setBounds(400,300,100,30);
        lEdu.setFont(new Font("serif",Font.BOLD,20));    
        jImg.add(lEdu);

        tEdu=new JTextField();
        tEdu.setBounds(600,300,150,30);
        jImg.add(tEdu);

        lJpost= new JLabel("Job Post");
        lJpost.setBounds(50,350,100,30);
        lJpost.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lJpost);

        tJpost=new JTextField();
        tJpost.setBounds(200,350,150,30);
        jImg.add(tJpost);


        lAdhar= new JLabel("Aadhar No");
        lAdhar.setBounds(400,350,100,30);
        lAdhar.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lAdhar);

        tAdhar=new JTextField();
        tAdhar.setBounds(600,350,150,30);
        jImg.add(tAdhar);

        lEmpID= new JLabel("Employee Id");
        lEmpID.setBounds(50,400,150,30);
        lEmpID.setFont(new Font("serif",Font.BOLD,20));
        jImg.add(lEmpID);

        tempId=new JTextField();   
        tempId.setBounds(200,400,150,30);
        jImg.add(tempId);

        
        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250,550,150,40);
        
        jImg.add(b1);

        b2=new JButton("Cancel");   
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(450,550,150,40);
        
        jImg.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
       
   
     f1.setVisible(true);
     f1.setSize(900, 700);
     f1.setLocation(400,150);
         
 
     


}    

    @Override
    public void actionPerformed(ActionEvent ae) {
        

        String a = tN.getText();
        String b = tFName.getText();
        String c = tA.getText();
        String d = tDob.getText();
        String e = tAdd.getText();       
        String f = tPhNo.getText();
        String g = tEmail.getText();
        String h = tEdu.getText();
        String i = tJpost.getText();
        String j = tAdhar.getText();
        String k = tempId.getText();

        if(ae.getSource()==b1)
        {
     try{
         
         Conn c1=new Conn();
         String q="insert into employee values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"',"
                 + "'"+h+"','"+i+"','"+j+"','"+k+"' )";
       c1.s.executeUpdate(q);
       JOptionPane.showMessageDialog(null, "Details Successfully inserted.");
       f1.setVisible(false);
       new EmpDetails();
     
     }catch(Exception ee){
            System.out.println("The error is :"+ee);
     }    
        }
     else if (ae.getSource()==b2)
             {
             f1.setVisible(false);
             new EmpDetails();
             
             }
          }

    
   public static void main(String []args){
    
    Add_Employee addEmp=new Add_Employee();
}    
    
    
}
