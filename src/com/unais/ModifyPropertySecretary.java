package com.unais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModifyPropertySecretary extends javax.swing.JFrame {
    Connection con;
    public ModifyPropertySecretary() {
        initComponents();
    }   //Will get all the data of the property from Secretary.java 
        public ModifyPropertySecretary(String likeUserName,String likeSalesId,String likePType,String likeAddress,String likeNumberOfRooms,String likeSellingPrice,String likeNumberOfFloors,String likeGarden,String likeGarage,String likeMonthlyCharge) {
        initComponents();
        createConnection();
        jUserNameModify.setText(likeUserName);
        jSalesIdModify.setText(likeSalesId);
        if(likePType.equals("House")){//If The house is choosen the following code will be used to fill up the text fields
            jGardenNoRBModify.setEnabled(true);
            jGardenYesRBModify.setEnabled(true);
            jGarageYesRBModify.setEnabled(true);
            jGarageNoRBModify.setEnabled(true);
            jNumberOfFloorsModify.setEnabled(true);
            jMonthlyChargeModify.setText("");
            jMonthlyChargeModify.setEnabled(false);
            
            jAddressModify.setText(likeAddress);
            jNumberOfRoomsModify.setText(likeNumberOfRooms);
            jSellingPriceModify.setText(likeSellingPrice);
            jNumberOfFloorsModify.setText(likeNumberOfFloors);
            if (likeGarden.equals("Yes")){
                jGardenYesRBModify.setSelected(true); 
            }else{
                jGardenNoRBModify.setSelected(true);
            }
            if (likeGarage.equals("Yes")){
                jGarageYesRBModify.setSelected(true);
            }else{
                jGarageNoRBModify.setSelected(true);
            }
            jHouseRBModify.setSelected(true);            
                    
        }else{//If The flat is choosen the following code will be used to fill up the text fields
            buttonGroup2.clearSelection();
            buttonGroup1.clearSelection();
            jGardenNoRBModify.setEnabled(false);
            jGardenYesRBModify.setEnabled(false);
            jGarageYesRBModify.setEnabled(false);
            jGarageNoRBModify.setEnabled(false);
            jMonthlyChargeModify.setEnabled(true);
            jNumberOfFloorsModify.setText("");
            jNumberOfFloorsModify.setEnabled(false);
            
            jAddressModify.setText(likeAddress);
            jNumberOfRoomsModify.setText(likeNumberOfRooms);
            jSellingPriceModify.setText(likeSellingPrice);
            jMonthlyChargeModify.setText(likeMonthlyCharge);
            jFlatRBModify.setSelected(true);
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
               Logger.getLogger(Secretary.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAddressModify = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jNumberOfRoomsModify = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSellingPriceModify = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jNumberOfFloorsModify = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jGardenYesRBModify = new javax.swing.JRadioButton();
        jGardenNoRBModify = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jGarageYesRBModify = new javax.swing.JRadioButton();
        jGarageNoRBModify = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jMonthlyChargeModify = new javax.swing.JTextField();
        jPropertyModifyButton = new javax.swing.JButton();
        jCancelButtonModify = new javax.swing.JButton();
        jFlatRBModify = new javax.swing.JRadioButton();
        jHouseRBModify = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSalesIdModify = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jUserNameModify = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edit Property");

        jLabel3.setText("Address");

        jAddressModify.setColumns(20);
        jAddressModify.setRows(5);
        jScrollPane1.setViewportView(jAddressModify);

        jLabel5.setText("Number of Rooms");

        jLabel6.setText("Selling Price");

        jLabel7.setText("Number of floors (Only Houses)");

        jLabel8.setText("Garden (Only Houses)");

        buttonGroup1.add(jGardenYesRBModify);
        jGardenYesRBModify.setText("Yes");

        buttonGroup1.add(jGardenNoRBModify);
        jGardenNoRBModify.setText("No");
        jGardenNoRBModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGardenNoRBModifyActionPerformed(evt);
            }
        });

        jLabel9.setText("Garage (Only Houses)");

        buttonGroup2.add(jGarageYesRBModify);
        jGarageYesRBModify.setText("Yes");

        buttonGroup2.add(jGarageNoRBModify);
        jGarageNoRBModify.setText("No");

        jLabel10.setText("Monthly Charge (Only Flats)");

        jPropertyModifyButton.setText("Modify Properties");
        jPropertyModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPropertyModifyButtonActionPerformed(evt);
            }
        });

        jCancelButtonModify.setText("Cancel ");
        jCancelButtonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelButtonModifyActionPerformed(evt);
            }
        });

        buttonGroup3.add(jFlatRBModify);
        jFlatRBModify.setText("Flat");
        jFlatRBModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFlatRBModifyActionPerformed(evt);
            }
        });

        buttonGroup3.add(jHouseRBModify);
        jHouseRBModify.setText("House");
        jHouseRBModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHouseRBModifyActionPerformed(evt);
            }
        });

        jLabel1.setText("Property Type");

        jLabel4.setText("Property ID");

        jSalesIdModify.setEditable(false);

        jLabel11.setText("Secretary Username");

        jUserNameModify.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCancelButtonModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPropertyModifyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jHouseRBModify)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFlatRBModify))
                            .addComponent(jMonthlyChargeModify, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSellingPriceModify, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jNumberOfRoomsModify, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jNumberOfFloorsModify)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jGardenYesRBModify)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGardenNoRBModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jGarageYesRBModify)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGarageNoRBModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSalesIdModify)
                            .addComponent(jUserNameModify))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jUserNameModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSalesIdModify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jNumberOfRoomsModify)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSellingPriceModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jNumberOfFloorsModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jGardenYesRBModify)
                        .addComponent(jGardenNoRBModify)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGarageYesRBModify)
                    .addComponent(jGarageNoRBModify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jMonthlyChargeModify)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jHouseRBModify)
                        .addComponent(jFlatRBModify)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPropertyModifyButton)
                    .addComponent(jCancelButtonModify))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jPropertyModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPropertyModifyButtonActionPerformed
        try{//Initailisation same as in adding a product.
            String saleId = jSalesIdModify.getText();
            boolean flat;
            flat = jFlatRBModify.isSelected();
            boolean house;
            house = jHouseRBModify.isSelected();
            String pType=null;
            if (flat){
                pType = "Flat";
            }
            if (house){
                pType = "House";
            }
            String pAddress;
            pAddress = jAddressModify.getText();
            String pNumberOfRooms;
            pNumberOfRooms = jNumberOfRoomsModify.getText();
            String pPrice;
            pPrice = jSellingPriceModify.getText();
            String pNumberOfFloors;
            pNumberOfFloors = jNumberOfFloorsModify.getText();
            boolean gardenYes;
            gardenYes = jGardenYesRBModify.isSelected();
            boolean gardenNo;
            gardenNo = jGardenNoRBModify.isSelected();
            String pGarden=null;
            if (gardenNo){
                pGarden = "No";
            }
            if (gardenYes){
                pGarden = "Yes";
            }
            boolean garageYes;
            garageYes = jGarageYesRBModify.isSelected();
            boolean garageNo;
            garageNo = jGarageNoRBModify.isSelected();
            String pGarage=null;
            if (garageNo){
                pGarage = "No";
            }
            if (garageYes){
                pGarage = "Yes";
            }
            String pMonthlyCharge;
            pMonthlyCharge = jMonthlyChargeModify.getText();
            //Initialising end.
            if(pType==null){
                JOptionPane.showMessageDialog(null, "Please select a property type");
            }
            
            if (flat){
                pNumberOfFloors = "Not applicable";
                pGarden = "Not applicable";
                pGarage = "Not applicable";
                if ("".equals(pAddress) || "".equals(pNumberOfRooms) || "".equals(pPrice) || "".equals(pMonthlyCharge)){
                    JOptionPane.showMessageDialog(null, "Please fill all the Forms");
                }
                else{
                    try {//Will update the data with the new one in the GUI.
                        Statement stmt = con.createStatement();
                        String insertOperation = "UPDATE `sale` SET `type` = '"+pType+"', `address` = '"+pAddress+"', `number_of_room` = '"+pNumberOfRooms+"', `price` = '"+pPrice+"',"
                        + " `number_of_floor` = '"+pNumberOfFloors+"', `garden` = '"+pGarden+"', `garage` = '"+pGarage+"', `monthly_charge` = '"+pMonthlyCharge+"' WHERE `sale_id` = "+saleId+";";

                        stmt.execute(insertOperation);
                        stmt.close();
                        JOptionPane.showMessageDialog(null, "Property Modified");
                        Secretary secretaryModel = new Secretary(jUserNameModify.getText());
                        secretaryModel.setVisible(true);
                        this.setVisible(false);
                    } catch (SQLException ex) {
                        Logger.getLogger(Secretary.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "Problem inserting Data");
                    }
                }
            }
            if (house){
                pMonthlyCharge = "Not applicable";
                if ("".equals(pAddress) || "".equals(pNumberOfRooms) || "".equals(pPrice) || "".equals(pNumberOfFloors) || pGarden==null  || pGarage==null ){
                    JOptionPane.showMessageDialog(null, "Please fill all the Forms");
                }
                else{
                    try {
                        Statement stmt = con.createStatement();
                        String insertOperation = "UPDATE `sale` SET `type` = '"+pType+"', `address` = '"+pAddress+"', `number_of_room` = '"+pNumberOfRooms+"', `price` = '"+pPrice+"',"
                        + " `number_of_floor` = '"+pNumberOfFloors+"', `garden` = '"+pGarden+"', `garage` = '"+pGarage+"', `monthly_charge` = '"+pMonthlyCharge+"' WHERE `sale_id` = "+saleId+";";

                        stmt.execute(insertOperation);
                        stmt.close();
                        JOptionPane.showMessageDialog(null, "Property Modified");
                        Secretary secretaryModel = new Secretary(jUserNameModify.getText());
                        secretaryModel.setVisible(true);
                        this.setVisible(false);
                    } catch (SQLException ex) {
                        Logger.getLogger(Secretary.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "Problem inserting Data");
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");//This will show up if any encounter with errors.
        }
    }//GEN-LAST:event_jPropertyModifyButtonActionPerformed
    private void jCancelButtonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelButtonModifyActionPerformed
        Secretary secretaryModel = new Secretary(jUserNameModify.getText());
        secretaryModel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jCancelButtonModifyActionPerformed
    private void jFlatRBModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFlatRBModifyActionPerformed
        //Same behaviour as the flat radiobutton in one in Secretary.java to add properties
        buttonGroup2.clearSelection();
        buttonGroup1.clearSelection();
        jGardenNoRBModify.setEnabled(false);
        jGardenYesRBModify.setEnabled(false);
        jGarageYesRBModify.setEnabled(false);
        jGarageNoRBModify.setEnabled(false);
        jMonthlyChargeModify.setEnabled(true);
        jNumberOfFloorsModify.setText("");
        jNumberOfFloorsModify.setEnabled(false);
    }//GEN-LAST:event_jFlatRBModifyActionPerformed
    private void jHouseRBModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHouseRBModifyActionPerformed
        //Same behaviour as the House radiobutton in one in Secretary.java to add properties
        jGardenNoRBModify.setEnabled(true);
        jGardenYesRBModify.setEnabled(true);
        jGarageYesRBModify.setEnabled(true);
        jGarageNoRBModify.setEnabled(true);
        jNumberOfFloorsModify.setEnabled(true);
        jMonthlyChargeModify.setText("");
        jMonthlyChargeModify.setEnabled(false);
    }//GEN-LAST:event_jHouseRBModifyActionPerformed
    private void jGardenNoRBModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGardenNoRBModifyActionPerformed
    }//GEN-LAST:event_jGardenNoRBModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextArea jAddressModify;
    private javax.swing.JButton jCancelButtonModify;
    private javax.swing.JRadioButton jFlatRBModify;
    private javax.swing.JRadioButton jGarageNoRBModify;
    private javax.swing.JRadioButton jGarageYesRBModify;
    private javax.swing.JRadioButton jGardenNoRBModify;
    private javax.swing.JRadioButton jGardenYesRBModify;
    private javax.swing.JRadioButton jHouseRBModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMonthlyChargeModify;
    private javax.swing.JTextField jNumberOfFloorsModify;
    private javax.swing.JTextField jNumberOfRoomsModify;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jPropertyModifyButton;
    private javax.swing.JTextField jSalesIdModify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSellingPriceModify;
    private javax.swing.JTextField jUserNameModify;
    // End of variables declaration//GEN-END:variables
}
