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
public class Secretary extends javax.swing.JFrame {
    DefaultTableModel salesTable,soldTable,searchTable;//initialising three tables in Secretary.java
    Connection con;
    public Secretary() {
        initComponents();
    }
    public Secretary(String databaseUsername) {
        initComponents();
        createConnection();
        displayProperties(databaseUsername);
    }
           private void displayProperties(String databaseUsername){//this display all the properties to the secretarty that is logged in
            jStaticUserNameText.setText(databaseUsername);
            salesTable = (DefaultTableModel) jSalesTable.getModel();
             try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM sale WHERE username ='"+databaseUsername+"' AND sold = '0'");//will shoose the data to be shown in sales list table. this will only choose products which are of the users and which are not sold
            while (result.next()){
                String salesId = result.getString("sale_id");
                String salesType = result.getString("type");
                String salesAddress = result.getString("address");
                String salesNumRooms = result.getString("number_of_room");
                String salesPrice = result.getString("price");
                String salesNumFloors = result.getString("number_of_floor");
                String salesGarden = result.getString("garden");
                String salesGarage = result.getString("garage");
                String salesMonthlyCharge = result.getString("monthly_charge");
                salesTable.addRow(new Object[]{salesId,salesType,salesAddress,salesNumRooms,salesPrice,salesNumFloors,salesGarden,salesGarage,salesMonthlyCharge});
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
           soldTable = (DefaultTableModel) jSoldTable.getModel();
             try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM sale WHERE username ='"+databaseUsername+"' AND sold = '1'");//will choose all the properties which are sold and which belongs too the corresponding user and shows it in sold table
            while (result.next()){
                String salesId = result.getString("sale_id");
                String salesType = result.getString("type");
                String salesAddress = result.getString("address");
                String salesNumRooms = result.getString("number_of_room");
                String salesPrice = result.getString("price");
                String salesSoldPrice = result.getString("sold_price");
                String salesNumFloors = result.getString("number_of_floor");
                String salesGarden = result.getString("garden");
                String salesGarage = result.getString("garage");
                String salesMonthlyCharge = result.getString("monthly_charge");
                soldTable.addRow(new Object[]{salesId,salesType,salesAddress,salesNumRooms,salesPrice,salesSoldPrice,salesNumFloors,salesGarden,salesGarage,salesMonthlyCharge});
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
               Logger.getLogger(Secretary.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jSalesTable = new javax.swing.JTable();
        jSoldPriceText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSellPropertyButton = new javax.swing.JButton();
        jModifyButtonText = new javax.swing.JButton();
        jDeleteButtonSec = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jSoldTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jSearchText = new javax.swing.JTextArea();
        jSearchButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jSearchTable = new javax.swing.JTable();
        jStaticUserNameText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAddressText = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jNumberOfRoomsText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSellingPriceText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jNumberOfFloorsText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jGardenYesRB = new javax.swing.JRadioButton();
        jGardenNoRB = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jGarageYesRB = new javax.swing.JRadioButton();
        jGarageNoRB = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jMonthlyChargeText = new javax.swing.JTextField();
        jPropertyAddButton = new javax.swing.JButton();
        jExitButtonSec = new javax.swing.JButton();
        jLogoutButtonSec = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jFlatRB = new javax.swing.JRadioButton();
        jHouseRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(777, 545));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Property");

        jSalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sale ID", "Type", "Address", "Number of rooms", "Selling price", "Number of Floors", "Garden", "Garage", "Monthly charge"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jSalesTable);

        jLabel4.setText("Price:");

        jSellPropertyButton.setText("Mark as Sold");
        jSellPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSellPropertyButtonActionPerformed(evt);
            }
        });

        jModifyButtonText.setText("Modify Property");
        jModifyButtonText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModifyButtonTextActionPerformed(evt);
            }
        });

        jDeleteButtonSec.setText("Delete property");
        jDeleteButtonSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonSecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDeleteButtonSec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jModifyButtonText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSellPropertyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSoldPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSellPropertyButton)
                    .addComponent(jModifyButtonText)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDeleteButtonSec)
                        .addComponent(jLabel4)
                        .addComponent(jSoldPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sales List", jPanel3);

        jSoldTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sale ID", "Type", "Address", "Number of rooms", "Selling price", "Sold Price", "Number of Floors", "Garden", "Garage", "Monthly charge"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jSoldTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sold Properties", jPanel5);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Query a product by address.");

        jSearchText.setColumns(20);
        jSearchText.setRows(5);
        jSearchText.setName(""); // NOI18N
        jScrollPane4.setViewportView(jSearchText);

        jSearchButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSearchButton.setText("Search");
        jSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButtonActionPerformed(evt);
            }
        });

        jSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sale_ID", "Type", "Address", "Number of rooms", "Selling price", "Sold", "Sold price", "Number of Floors", "Garden", "Garage", "Monthly charge"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jSearchTable);
        if (jSearchTable.getColumnModel().getColumnCount() > 0) {
            jSearchTable.getColumnModel().getColumn(5).setResizable(false);
            jSearchTable.getColumnModel().getColumn(10).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(jSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Query Properties", jPanel4);

        jStaticUserNameText.setEditable(false);
        jStaticUserNameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jStaticUserNameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jStaticUserNameText.setText("Username");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Secretary Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jStaticUserNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jStaticUserNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add property");

        jLabel3.setText("Address");

        jAddressText.setColumns(20);
        jAddressText.setRows(5);
        jScrollPane1.setViewportView(jAddressText);

        jLabel5.setText("Number of Rooms");

        jLabel6.setText("Selling Price");

        jLabel7.setText("Number of floors (Only Houses)");

        jLabel8.setText("Garden (Only Houses)");

        buttonGroup1.add(jGardenYesRB);
        jGardenYesRB.setText("Yes");

        buttonGroup1.add(jGardenNoRB);
        jGardenNoRB.setText("No");

        jLabel9.setText("Garage (Only Houses)");

        buttonGroup2.add(jGarageYesRB);
        jGarageYesRB.setText("Yes");

        buttonGroup2.add(jGarageNoRB);
        jGarageNoRB.setText("No");

        jLabel10.setText("Monthly Charge (Only Flats)");

        jPropertyAddButton.setText("ADD");
        jPropertyAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPropertyAddButtonActionPerformed(evt);
            }
        });

        jExitButtonSec.setText("Exit");
        jExitButtonSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonSecActionPerformed(evt);
            }
        });

        jLogoutButtonSec.setText("Logout");
        jLogoutButtonSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonSecActionPerformed(evt);
            }
        });

        buttonGroup3.add(jFlatRB);
        jFlatRB.setText("Flat");
        jFlatRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFlatRBActionPerformed(evt);
            }
        });

        buttonGroup3.add(jHouseRB);
        jHouseRB.setText("House");
        jHouseRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHouseRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNumberOfRoomsText)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSellingPriceText)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNumberOfFloorsText)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMonthlyChargeText)
                    .addComponent(jPropertyAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jExitButtonSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLogoutButtonSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jHouseRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFlatRB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jGarageYesRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGarageNoRB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jGardenYesRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGardenNoRB)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumberOfRoomsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSellingPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumberOfFloorsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGardenYesRB)
                    .addComponent(jGardenNoRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGarageYesRB)
                    .addComponent(jGarageNoRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMonthlyChargeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jHouseRB)
                    .addComponent(jFlatRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPropertyAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLogoutButtonSec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExitButtonSec)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jExitButtonSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonSecActionPerformed
 System.exit(0);//Exits the system.
    }//GEN-LAST:event_jExitButtonSecActionPerformed

    private void jLogoutButtonSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonSecActionPerformed
        Login loginModel = new Login();//will open the login button
        loginModel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLogoutButtonSecActionPerformed

    private void jDeleteButtonSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonSecActionPerformed
try {
        salesTable = (DefaultTableModel) jSalesTable.getModel();
        int selectedRowIndex = jSalesTable.getSelectedRow();
        String selectedRowSaleId;
        selectedRowSaleId = jSalesTable.getValueAt(selectedRowIndex, 0).toString();
            try {
                Statement deletestmt = con.createStatement();
                String deleteUser = "DELETE FROM sale WHERE sale_id = '"+selectedRowSaleId+"'";//deletes the id from the selected User
                deletestmt.execute(deleteUser);
                deletestmt.close();
                salesTable.removeRow(selectedRowIndex);
                JOptionPane.showMessageDialog(null, "Property successfully removed");//will show this message if property is successfully removed
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Deleting from database unsuccessfull");//will show this message if any problem is encountered
                }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a property to delete.");//will show up if no propertyt is selected
        }
    }//GEN-LAST:event_jDeleteButtonSecActionPerformed

    private void jPropertyAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPropertyAddButtonActionPerformed
try{
    String userName = jStaticUserNameText.getText();    
    boolean flat;
    flat = jFlatRB.isSelected();
    boolean house;
    house = jHouseRB.isSelected();
    String pType=null;//will first initialise Ptype as string
    if (flat){//the corresponding value is added dippending on what radio button is pressed
        pType = "Flat";
    }
    if (house){
        pType = "House";
    }
    String pAddress;
    pAddress = jAddressText.getText();
    String pNumberOfRooms;
    pNumberOfRooms = jNumberOfRoomsText.getText();
    String pPrice;
    pPrice = jSellingPriceText.getText();
    String pNumberOfFloors;
    pNumberOfFloors = jNumberOfFloorsText.getText();
    boolean gardenYes;
    gardenYes = jGardenYesRB.isSelected();
    boolean gardenNo;
    gardenNo = jGardenNoRB.isSelected();
    String pGarden=null;
    if (gardenNo){//just like flat data garage and garden also received its data on the basis of which radio button is pressed.
        pGarden = "No";
    }
    if (gardenYes){
        pGarden = "Yes";
    }
    boolean garageYes;
    garageYes = jGarageYesRB.isSelected();
    boolean garageNo;
    garageNo = jGarageNoRB.isSelected();
    String pGarage=null;
    if (garageNo){
        pGarage = "No";
    }
    if (garageYes){
        pGarage = "Yes";
    }
    String pMonthlyCharge;
    pMonthlyCharge = jMonthlyChargeText.getText();
    //initialising is over.
    if(pType==null){
        JOptionPane.showMessageDialog(null, "Please select a property type");//if no property type is selected a prompt select one will be given.
    }
    if (flat){//If the lat is selected the following code will be executed
        //The data for the Houses as Not applicable is given here as the Secretary has choosen Flat
        pNumberOfFloors = "Not applicable";
        pGarden = "Not applicable";
        pGarage = "Not applicable";
            if ("".equals(pAddress) || "".equals(pNumberOfRooms) || "".equals(pPrice) || "".equals(pMonthlyCharge)){//Checks whether anything is empty.
                JOptionPane.showMessageDialog(null, "Please fill all the Forms");
            }
            else{//if nothing is blank the code to add the product is executed
                try {
                Statement stmt = con.createStatement();
                String insertOperation = "INSERT INTO `sale` (`sale_id`, `username`, `type`, `address`, `number_of_room`, `price`, `number_of_floor`, `garden`, `garage`, `monthly_charge`, `sold_price`) VALUES "
                + "(NULL,'"+userName+"','"+pType+"','"+pAddress+"','"+pNumberOfRooms+"','"+pPrice+"','"+pNumberOfFloors+"','"+pGarden+"','"+pGarage+"','"+pMonthlyCharge+"',NULL);";
                stmt.execute(insertOperation);
                stmt.close();
                JOptionPane.showMessageDialog(null, "Property Added");
                //The below code will turn all the textfield and radio button back to normal.
                jAddressText.setText("");
                jNumberOfRoomsText.setText("");
                jSellingPriceText.setText("");
                jNumberOfFloorsText.setText("");
                jMonthlyChargeText.setText("");
                jNumberOfFloorsText.setEnabled(true);
                jGardenNoRB.setEnabled(true);
                jGardenYesRB.setEnabled(true);
                jGarageYesRB.setEnabled(true);
                jGarageNoRB.setEnabled(true);
                buttonGroup3.clearSelection();
                reloadSalesTable();//will clear the sale table and reload it
                } catch (SQLException ex) {
                Logger.getLogger(Secretary.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Problem inserting Data");//Will show up if any problem is encountered when adding Data
                }
            }
    }
    if (house){//If the house is selected the below code is executed.
        //Flat properties given the String value of not applicable.
        pMonthlyCharge = "Not applicable";
            if ("".equals(pAddress) || "".equals(pNumberOfRooms) || "".equals(pPrice) || "".equals(pNumberOfFloors) || pGarden==null  || pGarage==null ){////checks if all forms are filled.
                JOptionPane.showMessageDialog(null, "Please fill all the Forms");
            }
            else{//if nothing is blank the code to add the product is executed
                try {
                Statement stmt = con.createStatement();
                String insertOperation = "INSERT INTO `sale` (`sale_id`, `username`, `type`, `address`, `number_of_room`, `price`, `number_of_floor`, `garden`, `garage`, `monthly_charge`) VALUES "
                + "(NULL,'"+userName+"','"+pType+"','"+pAddress+"','"+pNumberOfRooms+"','"+pPrice+"','"+pNumberOfFloors+"','"+pGarden+"','"+pGarage+"','"+pMonthlyCharge+"');";
                stmt.execute(insertOperation);
                stmt.close();
                JOptionPane.showMessageDialog(null, "Property Added");//Prompt to say the product was added
                //The below code will turn all the textfield and radio button back to normal.
                jAddressText.setText("");
                jNumberOfRoomsText.setText("");
                jSellingPriceText.setText("");
                jNumberOfFloorsText.setText("");
                jMonthlyChargeText.setEnabled(true);
                buttonGroup1.clearSelection();
                buttonGroup2.clearSelection();
                buttonGroup3.clearSelection();
                reloadSalesTable();//will clear the sale table and reload it
                } catch (SQLException ex) {
                Logger.getLogger(Secretary.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Problem inserting Data");//Will show up if any problem is encountered when adding Data
                }
            }
    }
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, "Error");//Shows error if ant problem is encountered
}
    }//GEN-LAST:event_jPropertyAddButtonActionPerformed

    private void jFlatRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFlatRBActionPerformed
    //When the Flat radio button is pressed the text field and radio buttons for the house will be first cleared and then will be disabled.
    buttonGroup2.clearSelection();
    buttonGroup1.clearSelection();
    jGardenNoRB.setEnabled(false);
    jGardenYesRB.setEnabled(false);
    jGarageYesRB.setEnabled(false);
    jGarageNoRB.setEnabled(false);
    jNumberOfFloorsText.setText("");
    jNumberOfFloorsText.setEnabled(false);
    //Also the flat properties option button if it was disabled by house radio button will be re enabled. 
    jMonthlyChargeText.setEnabled(true);
    }//GEN-LAST:event_jFlatRBActionPerformed

    private void jHouseRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHouseRBActionPerformed
    //When the House radio button is pressed the text field for flat will be cleared and then will be disabled.
    jMonthlyChargeText.setText("");
    jMonthlyChargeText.setEnabled(false);
    //The radio button and the text field for house will be re-enabled if it was disabled.  
    jGardenNoRB.setEnabled(true);
    jGardenYesRB.setEnabled(true);
    jGarageYesRB.setEnabled(true);
    jGarageNoRB.setEnabled(true);
    jNumberOfFloorsText.setEnabled(true);
    }//GEN-LAST:event_jHouseRBActionPerformed

    private void jModifyButtonTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModifyButtonTextActionPerformed
        salesTable = (DefaultTableModel) jSalesTable.getModel();
    try {
        int selectedRowIndex = jSalesTable.getSelectedRow();
        //When the mofy button is selected all the data from the selected row in the tabled will be added to a variable and then will be sent to the ModifyBranchAdmin.java to be modified.
        String likeUserName;
        String likeSalesId;
        String likePType;
        String likeAddress;
        String likeNumberOfRooms;
        String likeSellingPrice;
        String likeNumberOfFloors;
        String likeGarden;
        String likeGarage;
        String likeMonthlyCharge;
        
        likeUserName = jStaticUserNameText.getText();
        likeSalesId = jSalesTable.getValueAt(selectedRowIndex, 0).toString();
        likePType = jSalesTable.getValueAt(selectedRowIndex, 1).toString();
        likeAddress = jSalesTable.getValueAt(selectedRowIndex, 2).toString();
        likeNumberOfRooms = jSalesTable.getValueAt(selectedRowIndex, 3).toString();
        likeSellingPrice = jSalesTable.getValueAt(selectedRowIndex, 4).toString();
        likeNumberOfFloors = jSalesTable.getValueAt(selectedRowIndex, 5).toString();
        likeGarden = jSalesTable.getValueAt(selectedRowIndex, 6).toString();
        likeGarage = jSalesTable.getValueAt(selectedRowIndex, 7).toString();
        likeMonthlyCharge = jSalesTable.getValueAt(selectedRowIndex, 8).toString();
        //The ModifyBranchAdmin.java is being opened with all the property details addded to it.
        new ModifyPropertySecretary(likeUserName,likeSalesId,likePType,likeAddress,likeNumberOfRooms,likeSellingPrice,likeNumberOfFloors,likeGarden,likeGarage,likeMonthlyCharge).setVisible(true);
        this.setVisible(false);//will set the Secretaty GUI hidden.

    }
    catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a branch to Modify.");//Will Showup if secretary didnt select a product to make change to.
    }
    }//GEN-LAST:event_jModifyButtonTextActionPerformed

    private void jSellPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSellPropertyButtonActionPerformed
try {//This will sell the product
        int selectedRowIndex = jSalesTable.getSelectedRow();
        String likeSalesId;
        likeSalesId = jSalesTable.getValueAt(selectedRowIndex, 0).toString();
        String soldPrice;
        soldPrice = jSoldPriceText.getText();
        if("".equals(soldPrice)){//if no product price is selected it ask for the user to give data.
            JOptionPane.showMessageDialog(null, "Please set a selling price.");
        }else{
            try {
                Statement stmt = con.createStatement();
                String insertOperation = "UPDATE `sale` SET `sold` = '1', sold_price='"+soldPrice+"' WHERE sale_id='"+likeSalesId+"';";
                //Will make the coloumn in the sale table to change the data to sold and add the sold price to sold_price column.
                stmt.execute(insertOperation);
                stmt.close();
                JOptionPane.showMessageDialog(null, "Property marked as sold");//when the property is sold the dialog box will show up.
                reloadSalesTable();//will clear the sale table and reload it
                reloadSoldTable();//will clear the sold table and reloads it
            } catch (SQLException ex) {
                Logger.getLogger(Secretary.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Problem Selling Property");
            }
        }
    }
    catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a branch to mark as sold.");// Have to select a property to sell or an error to select a product will come up.
    }
    }//GEN-LAST:event_jSellPropertyButtonActionPerformed

    private void jSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchButtonActionPerformed
        searchTable = (DefaultTableModel) jSearchTable.getModel();
        searchTable.setRowCount(0);
        String userName = jStaticUserNameText.getText();
        String searchAddress = jSearchText.getText();
        //<!---Initailising varable end--->
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM sale WHERE username ='"+userName+"' AND address like '%"+searchAddress+"%'");// will select a product if the product is equal to the Secretaries username and the whatever search term is if it is similar to the address
            while (result.next()){
                String salesId = result.getString("sale_id");
                String salesType = result.getString("type");
                String salesAddress = result.getString("address");
                String salesNumRooms = result.getString("number_of_room");
                String salesPrice = result.getString("price");
                String soldCheck = result.getString("sold");
                if (soldCheck.equals("0")){
                    soldCheck="Not sold";//if the product is not sold the sold row will show "Not sold"
                }else{
                    soldCheck="Sold";
                }
                String soldPrice = result.getString("sold_price");
                if (soldPrice == null){
                    soldPrice="No data";//if the product is not sold the sold Price will show "no data"
                }
                String salesNumFloors = result.getString("number_of_floor");
                String salesGarden = result.getString("garden");
                String salesGarage = result.getString("garage");
                String salesMonthlyCharge = result.getString("monthly_charge");
                searchTable.addRow(new Object[]{salesId,salesType,salesAddress,salesNumRooms,salesPrice,soldCheck,soldPrice,salesNumFloors,salesGarden,salesGarage,salesMonthlyCharge});//will show the results
            }
            stmt.close();
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Problem Searching");//will popup if any unexpected problem is encountered.
        }
    }//GEN-LAST:event_jSearchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextArea jAddressText;
    private javax.swing.JButton jDeleteButtonSec;
    private javax.swing.JButton jExitButtonSec;
    private javax.swing.JRadioButton jFlatRB;
    private javax.swing.JRadioButton jGarageNoRB;
    private javax.swing.JRadioButton jGarageYesRB;
    private javax.swing.JRadioButton jGardenNoRB;
    private javax.swing.JRadioButton jGardenYesRB;
    private javax.swing.JRadioButton jHouseRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLogoutButtonSec;
    private javax.swing.JButton jModifyButtonText;
    private javax.swing.JTextField jMonthlyChargeText;
    private javax.swing.JTextField jNumberOfFloorsText;
    private javax.swing.JTextField jNumberOfRoomsText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jPropertyAddButton;
    private javax.swing.JTable jSalesTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jSearchButton;
    private javax.swing.JTable jSearchTable;
    private javax.swing.JTextArea jSearchText;
    private javax.swing.JButton jSellPropertyButton;
    private javax.swing.JTextField jSellingPriceText;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jSoldPriceText;
    private javax.swing.JTable jSoldTable;
    private javax.swing.JTextField jStaticUserNameText;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void reloadSalesTable() {//This Method will clear the sale table and then reload the data in the sale table. Used when adding new items and for searching
        salesTable.setRowCount(0);
        String userName = jStaticUserNameText.getText(); 
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM sale WHERE username ='"+userName+"' AND sold='0' ");
            while (result.next()){
                String salesId = result.getString("sale_id");
                String salesType = result.getString("type");
                String salesAddress = result.getString("address");
                String salesNumRooms = result.getString("number_of_room");
                String salesPrice = result.getString("price");
                String salesNumFloors = result.getString("number_of_floor");
                String salesGarden = result.getString("garden");
                String salesGarage = result.getString("garage");
                String salesMonthlyCharge = result.getString("monthly_charge");
                salesTable.addRow(new Object[]{salesId,salesType,salesAddress,salesNumRooms,salesPrice,salesNumFloors,salesGarden,salesGarage,salesMonthlyCharge});
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        private void reloadSoldTable() {//This Method will clear the sold table and then reload the data in the sold table. Used when selling items.
        soldTable.setRowCount(0);
        String userName = jStaticUserNameText.getText(); 
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM sale WHERE username ='"+userName+"' AND sold='1' ");
            while (result.next()){
                String salesId = result.getString("sale_id");
                String salesType = result.getString("type");
                String salesAddress = result.getString("address");
                String salesNumRooms = result.getString("number_of_room");
                String salesPrice = result.getString("price");
                String soldPrice = result.getString("sold_price");
                String salesNumFloors = result.getString("number_of_floor");
                String salesGarden = result.getString("garden");
                String salesGarage = result.getString("garage");
                String salesMonthlyCharge = result.getString("monthly_charge");
                soldTable.addRow(new Object[]{salesId,salesType,salesAddress,salesNumRooms,salesPrice,soldPrice,salesNumFloors,salesGarden,salesGarage,salesMonthlyCharge});
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
