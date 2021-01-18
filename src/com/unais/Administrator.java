package com.unais;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Administrator extends javax.swing.JFrame {
    DefaultTableModel branchTable;//declares a new varaible for branchtable as tablemodel
    Connection con;
    public Administrator() {
        initComponents();
        createConnection();//will create connection to the database
        displayBranches();//will run display branches method so all added branches show up when opened.
    }
       private void displayBranches() {//This method will display all of the branches in the table after it gets it from the branch table in database
           branchTable = (DefaultTableModel) jBranchTableAdmin.getModel();//assigns table to the variable

        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM branch");//gets all the details from the branch
            while (result.next()){//puts all the data in a string using a loop
                String branchUsername = result.getString("username");
                String branchName = result.getString("name");
                String branchAddress = result.getString("address");
                String branchPhone = result.getString("phone");
                String branchEmail = result.getString("email");
                String branchWeb = result.getString("web_address");
                branchTable.addRow(new Object[]{branchUsername, branchName, branchAddress, branchPhone, branchEmail, branchWeb});//as the loops goes it will insert all the data in the Table model
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
                           + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", ""+databaseUserName+"", ""+databasePassword+"");
                     
           }
           catch (SQLException | ClassNotFoundException ex) {
               Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, "Mysql not Connected.");//if connection is not available the exception will caught and shows thsi dialoge box.
           }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jUsernameTextAdmin = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPasswordTextAdmin = new javax.swing.JPasswordField();
        jLabel30 = new javax.swing.JLabel();
        jNameTextAdmin = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jAddressTextAdmin = new javax.swing.JTextArea();
        jPhoneNumAdmin = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jEmailTextAdmin = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jWebTextAdmin = new javax.swing.JTextField();
        jAddButtonAdmin = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLogoutButtonAdmin = new javax.swing.JButton();
        jExitButtonAdmin = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jBranchTableAdmin = new javax.swing.JTable();
        jDeleteButtunAdmin = new javax.swing.JButton();
        jModifyButtonAdmin = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(606, 580));

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Add Branch");

        jLabel28.setText("Username");

        jLabel29.setText("Password");

        jLabel30.setText("Name");

        jLabel31.setText("Address");

        jAddressTextAdmin.setColumns(20);
        jAddressTextAdmin.setRows(5);
        jScrollPane5.setViewportView(jAddressTextAdmin);

        jLabel32.setText("Phone number");

        jLabel33.setText("E-mail address");

        jLabel34.setText("Web Address");

        jAddButtonAdmin.setText("ADD");
        jAddButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonAdminActionPerformed(evt);
            }
        });

        jLogoutButtonAdmin.setText("Logout");
        jLogoutButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonAdminActionPerformed(evt);
            }
        });

        jExitButtonAdmin.setText("Exit");
        jExitButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jUsernameTextAdmin)
                    .addComponent(jNameTextAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordTextAdmin)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPhoneNumAdmin)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEmailTextAdmin)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jWebTextAdmin)
                    .addComponent(jAddButtonAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLogoutButtonAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jExitButtonAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUsernameTextAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordTextAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNameTextAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPhoneNumAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEmailTextAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jWebTextAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAddButtonAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLogoutButtonAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExitButtonAdmin)
                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBranchTableAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBranchTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "Address", "Phone no", "E-mail address", "Web address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jBranchTableAdmin);

        jDeleteButtunAdmin.setText("Delete branch");
        jDeleteButtunAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtunAdminActionPerformed(evt);
            }
        });

        jModifyButtonAdmin.setText("Modify branch details");
        jModifyButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModifyButtonAdminActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Branch Details");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jDeleteButtunAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jModifyButtonAdmin)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDeleteButtunAdmin)
                    .addComponent(jModifyButtonAdmin))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jExitButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonAdminActionPerformed
    System.exit(0);//Exists the system if exit button is pressed.
    }//GEN-LAST:event_jExitButtonAdminActionPerformed

    private void jLogoutButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonAdminActionPerformed
    Login loginModel = new Login();//will logout by closing the Administrator page and opening the login page.
    loginModel.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jLogoutButtonAdminActionPerformed

    private void jAddButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonAdminActionPerformed
try{//Varaible declaration where all the data from the text field to add the branches are taken.
    branchTable = (DefaultTableModel) jBranchTableAdmin.getModel();
    String branchUsername;
        branchUsername = jUsernameTextAdmin.getText();//gets username
    String branchPassword;
        branchPassword = jPasswordTextAdmin.getText();//gets password
    String branchName;
        branchName = jNameTextAdmin.getText();//gets branch name
    String branchAddress;
        branchAddress = jAddressTextAdmin.getText();//gets address
    String branchPhone;
        branchPhone = jPhoneNumAdmin.getText();//gets phone number
    String branchEmail;
        branchEmail = jEmailTextAdmin.getText();//gets email
    String branchWeb;
        branchWeb = jWebTextAdmin.getText();//gets web address
    String likeUsername = "admin";//stores "admin" as a String in a variable admin cannot add a Secretary with username admin
    if (likeUsername.equals(branchUsername)){//if the username is admin, will show a dialog box saying "Username cannot be admin".
        JOptionPane.showMessageDialog(null, "Username cannot be admin"); 
    }
    else if ("".equals(branchUsername) || "".equals(branchPassword) || "".equals(branchName) || "".equals(branchAddress) || "".equals(branchPhone) || "".equals(branchEmail) || "".equals(branchWeb)){
        JOptionPane.showMessageDialog(null, "Please fill all the Forms");//checks whether all the forms are filled up. if not a dialog box will show up saying to fill up all the forms
    }
    else {//if the username is not admin and all the forms are full the following code which will attempt to get the same username from the database  will be executed.
        Statement equalstmt = con.createStatement();
        ResultSet checkUsername = equalstmt.executeQuery("SELECT username FROM branch WHERE username = '"+branchUsername+"'");
        if(checkUsername.next()){
        likeUsername = checkUsername.getString(1);
        }
        equalstmt.close();
    
        if(likeUsername.equals(branchUsername)){
        JOptionPane.showMessageDialog(null, "Username already exist");//if the username already exist in the database then the secretary cannot be added with the same username
        }
        else {//if username doesnt exist then the below code which will take all teh avalues and will the add it to the database.
                try {
                Statement stmt = con.createStatement();
                String insertOperation = "INSERT INTO `branch` (`branch_id`, `username`, `password`, `name`, `address`, `phone`, `email`, `web_address`) VALUES "
                + "(NULL,'"+branchUsername+"','"+branchPassword+"','"+branchName+"','"+branchAddress+"','"+branchPhone+"','"+branchEmail+"','"+branchWeb+"');";
                stmt.execute(insertOperation);
                stmt.close();
                }
                catch (SQLException e){
                Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Data not saved in database");
                }
                branchTable.insertRow(branchTable.getRowCount(), new Object[]{branchUsername ,branchName ,branchAddress ,branchPhone ,branchEmail ,branchWeb}); // all the data will be inserted into the table in the GUI
                //then all the fields will be cleared.
                jWebTextAdmin.setText("");
                jEmailTextAdmin.setText("");
                jPhoneNumAdmin.setText("");
                jAddressTextAdmin.setText("");
                jNameTextAdmin.setText("");
                jPasswordTextAdmin.setText("");
                jUsernameTextAdmin.setText("");
                JOptionPane.showMessageDialog(null, "Branch added Successfully");//if successfull will show a dialog box with this message.
            }
        }
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, "Data not entered into database");// if any unexpeced eception happens the following error message will show up.
}
    }//GEN-LAST:event_jAddButtonAdminActionPerformed

    private void jDeleteButtunAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtunAdminActionPerformed
        branchTable = (DefaultTableModel) jBranchTableAdmin.getModel();//initailising the table
        try {
        int selectedRowIndex = jBranchTableAdmin.getSelectedRow();
        String selectedRowUsername;
        selectedRowUsername = jBranchTableAdmin.getValueAt(selectedRowIndex, 0).toString();
            try {
                Statement deletestmt = con.createStatement();
                String deleteUser = "DELETE FROM branch WHERE username = '"+selectedRowUsername+"'; DELETE FROM sale WHERE username = '"+selectedRowUsername+"';";// will select the branch to be deleted based on which username was selected. and also removes all the properties associated with the branch .
                deletestmt.execute(deleteUser);
                deletestmt.close();
                branchTable.removeRow(selectedRowIndex);
                JOptionPane.showMessageDialog(null, "Branch and all associated property successfully removed");//will show this dialog box ipon successfull deletion of the product.
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Deleting from database unsuccessfull");//shows error message unable to delete if any problem with the databse occurs.
                }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a branch to delete.");//will show this error if Admin dont select any data in the table to delete before pressing the delete button.
        }
    }//GEN-LAST:event_jDeleteButtunAdminActionPerformed

    private void jModifyButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModifyButtonAdminActionPerformed
        branchTable = (DefaultTableModel) jBranchTableAdmin.getModel();
        try {
        int selectedRowIndex = jBranchTableAdmin.getSelectedRow();
        String selectedRowUsername;
        selectedRowUsername = jBranchTableAdmin.getValueAt(selectedRowIndex, 0).toString();//get the username
        Statement idstmt = con.createStatement();
        ResultSet checkId = idstmt.executeQuery("SELECT branch_id FROM branch WHERE username = '"+selectedRowUsername+"'");// statement to get the branch_id of the selected username
        if(checkId.next()){
        String likeId = checkId.getString(1);
             idstmt.close();
             try{
             new ModifyBranchAdmin(likeId).setVisible(true);//will open the ModifyBranchAdmin.java and will send the data of the admin
             this.setVisible(false);//closes the current Administrator Window.
             }
             catch (Exception e){
               JOptionPane.showMessageDialog(null, "Cannot Open Modify Settings");
             }
         }
        
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a branch to Modify.");// will say to open a branch to modify it if none is choosen
        }
    }//GEN-LAST:event_jModifyButtonAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButtonAdmin;
    private javax.swing.JTextArea jAddressTextAdmin;
    private javax.swing.JTable jBranchTableAdmin;
    private javax.swing.JButton jDeleteButtunAdmin;
    private javax.swing.JTextField jEmailTextAdmin;
    private javax.swing.JButton jExitButtonAdmin;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JButton jLogoutButtonAdmin;
    private javax.swing.JButton jModifyButtonAdmin;
    private javax.swing.JTextField jNameTextAdmin;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPasswordField jPasswordTextAdmin;
    private javax.swing.JTextField jPhoneNumAdmin;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jUsernameTextAdmin;
    private javax.swing.JTextField jWebTextAdmin;
    // End of variables declaration//GEN-END:variables
}
