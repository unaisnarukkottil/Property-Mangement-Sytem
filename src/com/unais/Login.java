package com.unais;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {
    Connection con;
    public Login() {
        initComponents();//initialize GUI components.
        createConnection();//Excecutes the createConnection() Method
        lookandfeel();// Executes The lookandfeel() Method
    }
       private void createConnection() {// This will create a connection to the database.
           try {
               String serverName;
               serverName = "localhost:3306";
               String database;
               database = "pms";
               String databaseUserName;
               databaseUserName = "root";
               String databasePassword;
               databasePassword = "";
               
               Class.forName("com.mysql.cj.jdbc.Driver");
              
               con = DriverManager.getConnection("jdbc:mysql://"+serverName+"/"+database+""
                           + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", ""+databaseUserName+"", ""+databasePassword+"");
                     
           }
           catch (SQLException | ClassNotFoundException ex) {
               Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, "Mysql not Connected.");//if connection is not available the exception will caught and shows thsi dialoge box.
           }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLoginpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jUsernameTextLogin = new javax.swing.JTextField();
        jPasswordTextLogin = new javax.swing.JPasswordField();
        jExitButtonLogin = new javax.swing.JButton();
        jLoginButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Page");

        jLabel2.setText("Usename");

        jLabel3.setText("Password");

        jExitButtonLogin.setText("Exit");
        jExitButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonLoginActionPerformed(evt);
            }
        });

        jLoginButtonLogin.setText("Login");
        jLoginButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLoginpanelLayout = new javax.swing.GroupLayout(jLoginpanel);
        jLoginpanel.setLayout(jLoginpanelLayout);
        jLoginpanelLayout.setHorizontalGroup(
            jLoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(jLoginpanelLayout.createSequentialGroup()
                        .addGroup(jLoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jExitButtonLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUsernameTextLogin)
                            .addComponent(jPasswordTextLogin)
                            .addComponent(jLoginButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jLoginpanelLayout.setVerticalGroup(
            jLoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jUsernameTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jExitButtonLogin)
                    .addComponent(jLoginButtonLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLoginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLoginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonLoginActionPerformed
    try  {  
        String username = jUsernameTextLogin.getText();//gets username from the login page
        String password = jPasswordTextLogin.getText();//gets the password from the login page
        String userDetail = ""+username+password+"";//pusts username and password in one String variable for comparison.
        if("".equals(username) || "".equals(password)){//checks if the field is empty or not 
            JOptionPane.showMessageDialog(null, "Please fill in the forms");//if empty shows this dialog box 
        }else if (username.equals("admin") && password.equals("admin123")) {//Checks if the username and password maches the administrators username and password
            JOptionPane.showMessageDialog(null, "Login as Administrator successful");//if true shows that the administer was successfull inlogginf in
            Administrator administratorModel = new Administrator();
            administratorModel.setVisible(true);//makes the Administrator  jFrame visible 
            this.setVisible(false);//and Login one invisble
        }
        else {//if the username and password not equal to administrators next thing it will do is to check in the database if it belongs to any of the userss.
            try  { 
            Statement stmt = con.createStatement();
            ResultSet checkUser = stmt.executeQuery("SELECT * FROM branch WHERE username = '"+username+"'");//gets data from branch.
            if(checkUser.next()){//Stores username and password in a string
                String likeUsername = checkUser.getString("username");
                String likePassword = checkUser.getString("password");
                stmt.close();
                String getUserDetail = ""+likeUsername+likePassword+"";//pusts username and passwoord from the database together to compare
                if (getUserDetail.equals(userDetail)){//if the username and are corrects logisthe user in
                JOptionPane.showMessageDialog(null, "Logged in as "+username+"");// Shows the user as logged in with the corresponding isername from the username text box.
                Secretary propertyManagementModel = new Secretary(username);//opens the secretary Jframe with the username as a string together.
                propertyManagementModel.setVisible(true);//will open Secretary.java
                this.setVisible(false);//Will close login 
                }else {//This else statement will only be executed when the password is wrong as the username exist.
		JOptionPane.showMessageDialog(null, "Password incorrect.");
                }
            }else {//this is only executed is the sql statement recieves no value which means the user deosn't exist
		JOptionPane.showMessageDialog(null, "Username doesn't exist.");
            }
            }
            catch (SQLException | HeadlessException e){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "connection cannot be established");//shows this error if the database lost its connection.
            }
        }
    }
    catch(NullPointerException e) {
    JOptionPane.showMessageDialog(null, "Error Logging in");//shows error logging in if any other problems are encountered.
    }
    }//GEN-LAST:event_jLoginButtonLoginActionPerformed

    private void jExitButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonLoginActionPerformed
      System.exit(0);//Exits the system if the exit button is pressed.
    }//GEN-LAST:event_jExitButtonLoginActionPerformed
    public void lookandfeel(){
    try {
        // Set System look and feel for the program.
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      JOptionPane.showMessageDialog(null, "Cannot load the system UI");//Shows this error if UI manager fails to load system UI.
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jLoginButtonLogin;
    private javax.swing.JPanel jLoginpanel;
    private javax.swing.JPasswordField jPasswordTextLogin;
    private javax.swing.JTextField jUsernameTextLogin;
    // End of variables declaration//GEN-END:variables
}
