/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.sql.*;
/**
 *
 * @author SUDHA
 */
public class Conn {// Conn class created 2 connct our project with mysql d.base.
    
    public Connection c;// this interface will connect the project with mysql.
    public Statement s;// this interface is to execute all the queries of mysql.

    public Conn(){
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  //for.name is a method. 
                                                 //This is 2 regtr mysql driver.
                                                    
        
            /*This is to setup connection with mysql driver.there is of the
             url("dbName:///our db Name","userName","password"
             database inside the brackets.I didnt gv any pwd hence empty.*/
            c=DriverManager.getConnection("jdbc:mysql:///project1","root","");
        
            s=c.createStatement();//this to create statement to exeute mysql 
                             // queries.we use connection(c) to create statement
        }catch(Exception e){  
            e.printStackTrace();
            
         /*After this a compulsury step to connect the project is -> expand the
            project in sidebar-> fo to libraries-> right click-> go to 
            "add libraries"-> mysql driver-press enter*/
        }    
    }

}
