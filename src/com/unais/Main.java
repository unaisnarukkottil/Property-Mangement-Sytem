package com.unais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author: Narukkottil Hameed Mohammed Unais
 * Student ID: 18400985
 * Module Title: Systems Design & Development
 * Module Code: CSY2030 
 * Assignment Objective: Design, implement and test a stand-alone Property Sales system using object-oriented principles in Java.
 * Weighting: 50%
 * Deadline: 3rd May 2020
 */
public class Main {
    Connection con;
    
    public static void main(String[] args){
            createConnection();//will run the createConnection method;
        }
    public static void createConnection() {
           try {//The following code connects the Java application to the mysql server
               String serverName;
               serverName = "localhost:3306";//The server name
               String database;
               database = "pms";//The database name
               String databaseUserName;
               databaseUserName = "root";//username
               String databasePassword;
               databasePassword = "";//password
               
               Class.forName("com.mysql.cj.jdbc.Driver");
               try {//username and password will be replace using the variable
                   Connection con = DriverManager.getConnection("jdbc:mysql://"+serverName+"/"+database+""
                           + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", ""+databaseUserName+"", ""+databasePassword+"");
                   loginifconnected();//Will run the login if connected method and will open the login page if localhost connection is active and mysql server acan be accessed
               } catch (SQLException ex) {
                   Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                   JOptionPane.showMessageDialog(null, "Mysql not Connected.");//if connection is not available the exception will caught and shows thsi dialoge box.
    
               }
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, "Mysql not Connected.");//if connection is not available the exception will caught and shows thsi dialoge box.
           }
    }
    public static void loginifconnected(){//will open the Login page if database is conected and the mysql database exist.
            Login loginModel = new Login();
            loginModel.setVisible(true);
    }

}

