
package com.unais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModifyBranchAdmin extends javax.swing.JFrame {
    Connection con;
    public ModifyBranchAdmin() {
        initComponents();
    }
    public ModifyBranchAdmin(String likeId) {//gets all the data from the database of the selected username and displays it on the GUI
        initComponents();
        createConnection();
        jIdTextModify.setText(likeId);
         try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM branch where branch_id="+likeId+"");
            if (result.next()){
                String branchUsername = result.getString("username");
                String branchPassword = result.getString("password");
                String branchName = result.getString("name");
                String branchAddress = result.getString("address");
                String branchPhone = result.getString("phone");
                String branchEmail = result.getString("email");
                String branchWeb = result.getString("web_address");
                jUsernameTextModify.setText(branchUsername);
                jPasswordTextModify.setText(branchPassword);
                jNameTextModify.setText(branchName);
                jAddressTextModify.setText(branchAddress);
                jPhoneNumModify.setText(branchPhone);
                jEmailTextModify.setText(branchEmail);
                jWebTextModify.setText(branchWeb);
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
  
    private void createConnection() {
            try {//creates the connection to server
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
           }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jUsernameTextModify = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPasswordTextModify = new javax.swing.JPasswordField();
        jLabel30 = new javax.swing.JLabel();
        jNameTextModify = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jAddressTextModify = new javax.swing.JTextArea();
        jPhoneNumModify = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jEmailTextModify = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jWebTextModify = new javax.swing.JTextField();
        jUpdateButtonModify = new javax.swing.JButton();
        jCancelButtonModify = new javax.swing.JButton();
        jIdTextModify = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Modify Branch");

        jLabel28.setText("Username");

        jLabel29.setText("Password");

        jLabel30.setText("Name");

        jLabel31.setText("Address");

        jAddressTextModify.setColumns(20);
        jAddressTextModify.setRows(5);
        jScrollPane5.setViewportView(jAddressTextModify);

        jLabel32.setText("Phone number");

        jLabel33.setText("E-mail address");

        jLabel34.setText("Web Address");

        jUpdateButtonModify.setText("Modify");
        jUpdateButtonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateButtonModifyActionPerformed(evt);
            }
        });

        jCancelButtonModify.setText("Cancel");
        jCancelButtonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelButtonModifyActionPerformed(evt);
            }
        });

        jIdTextModify.setEditable(false);

        jLabel1.setText("branch_id");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPhoneNumModify, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jNameTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jWebTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEmailTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jUpdateButtonModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCancelButtonModify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jUsernameTextModify)
                            .addComponent(jIdTextModify, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIdTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPhoneNumModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jWebTextModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addComponent(jUpdateButtonModify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCancelButtonModify)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCancelButtonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelButtonModifyActionPerformed
        Administrator AdministratorModel = new Administrator();//will close the ModifyBranchAdmin.java and opens administrator back up
        AdministratorModel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jCancelButtonModifyActionPerformed

    private void jUpdateButtonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateButtonModifyActionPerformed
    String branchId;// intialises variable which will take all the data from the text box 
    branchId = jIdTextModify.getText();
    String branchUsername;
    branchUsername = jUsernameTextModify.getText();
    String branchPassword;
    branchPassword = jPasswordTextModify.getText();
    String branchName;
    branchName = jNameTextModify.getText();
    String branchAddress;
    branchAddress = jAddressTextModify.getText();
    String branchPhone;
    branchPhone = jPhoneNumModify.getText();
    String branchEmail;
    branchEmail = jEmailTextModify.getText();
    String branchWeb;
    branchWeb = jWebTextModify.getText();
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM branch where branch_id="+branchId+" ");//gets the username of the branch
            if (result.next()){
                String compareBranchUsername = result.getString("username");
                stmt.close();
                String likeUsername = "admin";
                if (likeUsername.equals(branchUsername)){
                    JOptionPane.showMessageDialog(null, "Username cannot be admin"); 
                }else{
                        Statement equalstmt = con.createStatement();
                        ResultSet checkUsername = equalstmt.executeQuery("SELECT username FROM branch WHERE username = '"+branchUsername+"'");// Gets username from other branches with similar username which will in turn allow the admin to check whether the username is used by the user or some other users. 
                        if(checkUsername.next()){
                        likeUsername = checkUsername.getString(1);
                        }
                        equalstmt.close();
                        
                        if(compareBranchUsername.equals(branchUsername) || !likeUsername.equals(branchUsername)){//if the username is not changed it will still execute the code even though similar username exist in the database since its the its own username.
                                                    try {
                                Statement updatestmt = con.createStatement();
                                String updateOperation = "UPDATE `branch` SET `username` = '"+branchUsername+"', `password` = '"+branchPassword+"', `name` = '"+branchName+"', `address` = '"+branchAddress+"', `phone` = '"+branchPhone+"', `email` = '"+branchEmail+"', `web_address` = '"+branchWeb+"' WHERE `branch`.`branch_id` = "+branchId+"";
                                updatestmt.execute(updateOperation);
                                updatestmt.close();
                                }
                                catch (SQLException e){
                                Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, e);
                                JOptionPane.showMessageDialog(null, "Data not modified in database");
                                }
                                JOptionPane.showMessageDialog(null, "Data modified.");//will show a data modified message.
                                Administrator administratorModel = new Administrator();
                                administratorModel.setVisible(true);//it will also open the Administrator page after the modification is done.
                                this.setVisible(false);//closes the curront ModifyBranchAdmin window.
                            
                        }else{//If the username already exist except the user whose data is being changed the below message will show up.
                                JOptionPane.showMessageDialog(null, "Username already exist");
                            }
                }
                            
            }
        } catch (Exception ex) {//will show the below error if some Exception happens
            JOptionPane.showMessageDialog(null, "Data cannot be modified");
        }
        
    }//GEN-LAST:event_jUpdateButtonModifyActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAddressTextModify;
    private javax.swing.JButton jCancelButtonModify;
    private javax.swing.JTextField jEmailTextModify;
    private javax.swing.JTextField jIdTextModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JTextField jNameTextModify;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPasswordField jPasswordTextModify;
    private javax.swing.JTextField jPhoneNumModify;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jUpdateButtonModify;
    private javax.swing.JTextField jUsernameTextModify;
    private javax.swing.JTextField jWebTextModify;
    // End of variables declaration//GEN-END:variables
}
