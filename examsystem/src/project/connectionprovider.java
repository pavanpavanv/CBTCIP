/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;

/**
 *
 * @author pavan
 */
public class connectionprovider {
    
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/qems","root","VMYp@12345");
            return con;
                    
        }
        catch(ClassNotFoundException | SQLException e)
        {
           return null; 
        }
    }    
    
}
