
import Controller.Controller;
import static Controller.Controller.addOrderDetail;
import static Controller.Controller.updateStock;
import DBconnection.DBConnection;
import Model.Order;
import Model.OrderDetail;
import View.AddCustomer;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        getDate();
        loadCustomerID();
        loadItemID();
        generateOrderId();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelUnitPrice = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelQTY_on_Hand = new javax.swing.JLabel();
        jButtonPlaceOder = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jLabelOderId = new javax.swing.JLabel();
        jTextFieldQty = new javax.swing.JTextField();
        jComboBoxItemCode = new javax.swing.JComboBox<>();
        jComboBoxCustomerID = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabelCustomerName = new javax.swing.JLabel();
        jTextFieldOderDate = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jLabelTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Place Oder Form");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Oder ID :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Customer ID :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Item Code ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Oder Date :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer Name :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Description");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Unit Price");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Qty. on Hand");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Qty");

        jLabelUnitPrice.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelUnitPrice.setForeground(new java.awt.Color(38, 0, 255));
        jLabelUnitPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUnitPrice.setText("--");
        jLabelUnitPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelDescription.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(0, 0, 255));
        jLabelDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescription.setText("--");
        jLabelDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelQTY_on_Hand.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelQTY_on_Hand.setForeground(new java.awt.Color(38, 0, 255));
        jLabelQTY_on_Hand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQTY_on_Hand.setText("--");
        jLabelQTY_on_Hand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButtonPlaceOder.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonPlaceOder.setText("Place Oder");
        jButtonPlaceOder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlaceOderActionPerformed(evt);
            }
        });

        jButtonRemove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRemove.setText("Remove");

        jLabelOderId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelOderId.setForeground(new java.awt.Color(240, 12, 21));
        jLabelOderId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelOderId.setText("--");

        jTextFieldQty.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQtyActionPerformed(evt);
            }
        });

        jComboBoxItemCode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBoxItemCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBoxItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxItemCodeActionPerformed(evt);
            }
        });

        jComboBoxCustomerID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBoxCustomerID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBoxCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCustomerIDActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("New");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "QTY", "Unit Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 12, 21));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText(" Total :");

        jLabelCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCustomerName.setForeground(new java.awt.Color(240, 12, 21));
        jLabelCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCustomerName.setText("--");

        jTextFieldOderDate.setEditable(false);
        jTextFieldOderDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldOderDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldOderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOderDateActionPerformed(evt);
            }
        });

        jLabelTotal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(240, 12, 21));
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setText("--");

        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabelTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(0, 117, 8));
        jLabelTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTime.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel8)
                                .addGap(77, 77, 77))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabelUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelQTY_on_Hand, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldQty, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxCustomerID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelOderId, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldOderDate, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPlaceOder, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTime)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabelOderId)
                    .addComponent(jTextFieldOderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabelCustomerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDescription)
                        .addComponent(jLabelUnitPrice))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelQTY_on_Hand)
                        .addComponent(jTextFieldQty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPlaceOder)
                    .addComponent(jLabelTotal)
                    .addComponent(jLabel17))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQtyActionPerformed
        jButtonAdd.doClick();
    }//GEN-LAST:event_jTextFieldQtyActionPerformed

    private void jTextFieldOderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOderDateActionPerformed

    }//GEN-LAST:event_jTextFieldOderDateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddCustomer addCustomer = new AddCustomer();
        addCustomer.setVisible(true);
        addCustomer.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCustomerIDActionPerformed
        String selectedCustomerID = (String) jComboBoxCustomerID.getSelectedItem();

        try {
            String query = "SELECT name FROM customer WHERE id = ?";
            java.sql.Connection connection = DBConnection.getInstance().getConnection();

            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, selectedCustomerID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                jLabelCustomerName.setText(rs.getString("name"));
            } else {
                jLabelCustomerName.setText("");
            }

        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxCustomerIDActionPerformed

    private void jComboBoxItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxItemCodeActionPerformed
        String selectedCustomerID = (String) jComboBoxItemCode.getSelectedItem();

        try {
            String query = "SELECT description, unitPrice, qtyOnHand FROM Item WHERE code = ?";
            java.sql.Connection connection = DBConnection.getInstance().getConnection();

            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, selectedCustomerID);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                jLabelDescription.setText(rs.getString("description"));
                jLabelUnitPrice.setText(String.valueOf(rs.getDouble("unitPrice")));
                jLabelQTY_on_Hand.setText(String.valueOf(rs.getInt("qtyOnHand")));
            } else {
                jLabelDescription.setText("");
                jLabelUnitPrice.setText("");
                jLabelQTY_on_Hand.setText("");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBoxItemCodeActionPerformed

    private void jButtonPlaceOderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlaceOderActionPerformed
        String orderId = jLabelOderId.getText();
        String orderDate = jTextFieldOderDate.getText();
        String customerId = jComboBoxCustomerID.getSelectedItem().toString();
        ArrayList<OrderDetail> OrderlList = new ArrayList<>();

        DefaultTableModel dtm = (DefaultTableModel) Table.getModel();

        for (int i = 0; i < dtm.getRowCount(); i++) {
            String itemCode = (String) dtm.getValueAt(i, 0);
            int orderQty = (int) dtm.getValueAt(i, 2);
            double unitPrice = (double) dtm.getValueAt(i, 3);
            OrderDetail orderDetail = new OrderDetail(orderId, itemCode, orderQty, unitPrice);
            OrderlList.add(orderDetail);

        }
        Order order = new Order(orderId, orderDate, customerId, OrderlList);
        try {
            boolean isAdded = Controller.placeOrder(order);
            boolean addOrderDetails = Controller.addOrderDetail(OrderlList);
            boolean updateStock = Controller.updateStock(OrderlList);

            if (updateStock && isAdded && addOrderDetails) {
                JOptionPane.showMessageDialog(this, "Added Success");
                generateOrderId();
            } else {
                JOptionPane.showMessageDialog(this, "Added Fail");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error" + ex.getMessage());

        }
        dtm.setRowCount(0);
    }//GEN-LAST:event_jButtonPlaceOderActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) Table.getModel();

        int qty = Integer.parseInt(jTextFieldQty.getText());
        double unitPrice = Double.parseDouble(jLabelUnitPrice.getText());
        double total = unitPrice * qty;
        int HandOnQty = Integer.parseInt(jLabelQTY_on_Hand.getText());

        int row = isAlreadyExists(jComboBoxItemCode.getSelectedItem().toString());

        if (HandOnQty > qty) {
            if (row == -1) {
                Object[] rowData = {
                    jComboBoxItemCode.getSelectedItem().toString(),
                    jLabelDescription.getText(),
                    qty,
                    unitPrice,
                    total
                };

                dtm.addRow(rowData);

            } else {
                qty += (int) dtm.getValueAt(row, 2);
                total += qty * unitPrice;

                Table.setValueAt(qty, row, 2);
                Table.setValueAt(total, row, 4);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Can not Add Order");

        }
        jTextFieldQty.setText("");

        calculateTotal();
        jComboBoxItemCode.requestFocus();


    }//GEN-LAST:event_jButtonAddActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            dashboard.setLocationRelativeTo(null);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonPlaceOder;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JComboBox<String> jComboBoxCustomerID;
    private javax.swing.JComboBox<String> jComboBoxItemCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCustomerName;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelOderId;
    private javax.swing.JLabel jLabelQTY_on_Hand;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelUnitPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldOderDate;
    private javax.swing.JTextField jTextFieldQty;
    // End of variables declaration//GEN-END:variables
  private void getDate() {
        jTextFieldOderDate.setText(LocalDate.now().toString());

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        jLabelTime.setText(currentTime.format(formatter));
    }

    private String generateOrderId() {
        try {
            String SQL = "SELECT id FROM Orders ORDER BY id DESC LIMIT 1;";
            java.sql.Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement stm = connection.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String lastOrderId = rs.getString("id");

                String prefix = lastOrderId.replaceAll("\\d", "");
                int numericPart = Integer.parseInt(lastOrderId.replaceAll("\\D", ""));
                int newNumericPart = numericPart + 1;

                String newOrderId = String.format("%s%03d", prefix, newNumericPart);
                jLabelOderId.setText(newOrderId);

                return newOrderId;
            } else {

                String firstOrderId = "ORD001";
                jLabelOderId.setText(firstOrderId);
                return firstOrderId;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading Order: " + ex.getMessage());
        }
        return null;
    }

    private void loadCustomerID() {
        try {
            String SQL = "SELECT id FROM Customer";
            java.sql.Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement stm = connection.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                jComboBoxCustomerID.addItem(rs.getString("id"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading customer IDs: ");
        }
    }

    private void loadItemID() {
        try {
            String SQL = "SELECT code FROM item";
            java.sql.Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement stm = connection.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                jComboBoxItemCode.addItem(rs.getString("code"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading Item IDs: " + ex.getMessage());
        }
    }

    private int isAlreadyExists(String code) {
        DefaultTableModel dtm = (DefaultTableModel) Table.getModel();
        for (int i = 0; i < Table.getRowCount(); i++) {
            Object tempCodeObj = dtm.getValueAt(i, 0);
            String tempCode = tempCodeObj == null ? "" : tempCodeObj.toString();
            if (tempCode.equals(code)) {
                return i;
            }
        }
        return -1;
    }

    private void calculateTotal() {
        DefaultTableModel dtm = (DefaultTableModel) Table.getModel();
        double total = 0;

        for (int i = 0; i < dtm.getRowCount(); i++) {
            total += (double) dtm.getValueAt(i, 4);
        }
        jLabelTotal.setText(String.valueOf(total));
    }

}
