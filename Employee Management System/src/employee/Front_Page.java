package employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author SUDHA
 */
class Front_Page implements ActionListener 
{
    JFrame f;
    JLabel l1, id, lid;
    JButton b;
    
    Front_Page(){//constructor
        
         f=new JFrame("Employee Management System"); //creating ob.of JFRame class
        f.setBackground(Color.red); // calling method for backgrount color of JF
        f.setLayout(null);
        
        //creating object of ImageIcon class to load image for b.ground- In brackets it's method with its class to load from our system followed by img url.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/emss.jpg"));
       
        //Creating object of Image class to convert the out photo in image from icon to chage the size.
        Image i2 =i1.getImage().getScaledInstance(1200, 500,Image.SCALE_DEFAULT);
        
        //Again converting our photo which is in image form into ImageIcon because object of Image class cant be loaded into lable object.
        ImageIcon im3= new ImageIcon(i2); 
        
        
        l1 = new JLabel(im3);//crtng obj of JLable which works as container of ImageIcon's obj.
        l1.setBounds(0,80,1360,600); // setting postion of lable with four arguments (left padding, top padding; width of lable and length of lable )
        
        f.add(l1); //Finally adding label in frame after designing.
        
        
        // creating object of JButton
        b = new JButton("CLICK HERE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(430, 550, 300, 70);
        b.addActionListener(this);/*To add action on click we add addActionListener method with this(button b) object 
        and for this we import package java.awt.event.* and then we implement the interface ActionListener. */
        
       

        //This is a colorless(transparent Label)which will be from top to upto little more than image where we will later add our label(EMS)and button.
        id=new JLabel();
        id.setBounds(90,0,1500,800);
        id.setLayout(null);
       
        
        lid=new JLabel("Employee Management System");
        lid.setBounds(120, 15, 1800, 100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.red);
        
        
        id.add(lid); //adding obj of lable(emp man sys)into obj of lable(empty container)
        id.add(b); //adding button into empty container
        f.add(id);//adding empty container into frame....it's layering of container basically.
        
       
        f.getContentPane().setBackground(Color.WHITE);// setting color of frame.
        f.setVisible(true); //making content of frame visible.it's false by default.
        f.setSize(1360,750); //setting size of frame.
        f.setLocation(200,70); //setting location of frame on screen(left padding, top padding)
        
        //Setting on-off effect in font of lid(Employee Management System
        while(true){
            
           lid.setVisible(false);
           
           try{
           Thread.sleep(500); // to make the font invisible for half a second.
           }catch(Exception e){}
           
           lid.setVisible(true);//to make the font visible for half a second.
           
            try{
           Thread.sleep(500);
           }catch(Exception e){}
        }       
    }
    
    
        /*Now to force action on button b we need to override the menthod actionPerformed */
  public void actionPerformed (ActionEvent ae)
    {
        
         if(ae.getSource()==b)
        {
        
            f.setVisible(false);
            new Login();
        }


    }

    public static void main(String []args){
               
        Front_Page fp = new Front_Page();
    
}
}