/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestdeliveryman;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author woo
 */
public class ViewOrder extends javax.swing.JFrame {

    /**
     * Creates new form ViewOrder
     */
    public ViewOrder() {
        initComponents();
        ShowOrder();
        ShowCustomer();
    }
  
    private ArrayList<Order> getOrderList() {
        ArrayList<Order> allOrder = new ArrayList<Order>();
        allOrder.add(new Order("0001", "Nasi Lemak", 5, "", "Alex"));
        allOrder.add(new Order("0002", "Chicken Rice", 1, "","Alex"));
        allOrder.add(new Order("0003", "TomYam", 2, "","Bob"));
        return allOrder;
    }
    
    private ArrayList<Customer> getCustomerList(){
        ArrayList<Customer> allCustomer = new ArrayList<Customer>();
        allCustomer.add(new Customer("Alex",2));
        allCustomer.add(new Customer("Bob",1));
        return allCustomer;
    }

    public void ShowOrder()
   {
       ArrayList<Order> OrderList = getOrderList();

       DefaultTableModel model = (DefaultTableModel)jTable_ViewOrder.getModel();

       Object[] row = new Object[5];
       
       for(int i = 0; i < OrderList.size(); i++)
       {
           
           row[0] = OrderList.get(i).getId();
           row[1] = OrderList.get(i).getItem();
           row[2] = OrderList.get(i).getQuantity();
           row[3] = OrderList.get(i).getStatus();
           row[4] = OrderList.get(i).getCname();
           
           model.addRow(row);   
       }
    }
    public void ShowCustomer()
   {
       ArrayList<Customer> CustomerList = getCustomerList();

       DefaultTableModel model = (DefaultTableModel)jTable_ViewC.getModel();

       Object[] row = new Object[3];
       
       for(int i = 0; i < CustomerList.size(); i++)
       {
           
           row[0] = CustomerList.get(i).getName();
           row[1] = CustomerList.get(i).getTotal();
           
           model.addRow(row);
           
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Item = new javax.swing.JTextField();
        jTextField_Quantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ViewOrder = new javax.swing.JTable();
        jButton_Pre = new javax.swing.JButton();
        jButton_Finish = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_ViewC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton_Send = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Message = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Items:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Quantity:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Status:");

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jTextField_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ItemActionPerformed(evt);
            }
        });

        jTextField_Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_QuantityActionPerformed(evt);
            }
        });

        jTable_ViewOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Quantity", "Status", "Customer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_ViewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ViewOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_ViewOrder);

        jButton_Pre.setText("Preparing");
        jButton_Pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreActionPerformed(evt);
            }
        });

        jButton_Finish.setText("Finished");
        jButton_Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FinishActionPerformed(evt);
            }
        });

        jTable_ViewC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Total Item"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_ViewC.setColumnSelectionAllowed(true);
        jTable_ViewC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ViewCMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_ViewC);
        jTable_ViewC.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel5.setText("jLabel5");

        jButton_Send.setText("Send");
        jButton_Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SendActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Alert Delivery Man");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Send an email to inform the delivery man that the orders are done.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Item, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton_Finish, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_Pre, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jButton_Send)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Finish, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Send)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ItemActionPerformed

    private void jTextField_QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_QuantityActionPerformed

    private void jTable_ViewOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ViewOrderMouseClicked
        // TODO add your handling code here:
        int i = jTable_ViewOrder.getSelectedRow();
        
        TableModel model = jTable_ViewOrder.getModel();
        
         // Display Slected Row In JTexteFields
        jTextField_ID.setText(model.getValueAt(i,0).toString());

        jTextField_Item.setText(model.getValueAt(i,1).toString());

        jTextField_Quantity.setText(model.getValueAt(i,2).toString());
        
        jLabel5.setText(model.getValueAt(i, 4).toString());

    }//GEN-LAST:event_jTable_ViewOrderMouseClicked

    private void jButton_PreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PreActionPerformed
        // TODO add your handling code here:
        int i = jTable_ViewOrder.getSelectedRow();
        String id = jTextField_ID.getText();
        String item = jTextField_Item.getText();
        String quantity=jTextField_Quantity.getText();
        String name = jLabel5.getText();
        String status = "prepare";
        String[] row4 = {id, item, quantity, status, name};
        
        DefaultTableModel model = (DefaultTableModel)jTable_ViewOrder.getModel();
        
        model.removeRow(i);
        model.addRow(row4);
        
    }//GEN-LAST:event_jButton_PreActionPerformed

    private void jTable_ViewCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ViewCMouseClicked
        // TODO add your handling code here:
        int i = jTable_ViewC.getSelectedRow();
        TableModel model = jTable_ViewC.getModel();

        jLabel5.setText(model.getValueAt(i,0).toString());
         ArrayList<Order> OrderList = getOrderList();

        DefaultTableModel model2 = (DefaultTableModel)jTable_ViewOrder.getModel();

       Object[] row = new Object[5];
       /*int rowCount = model2.getRowCount();
        for (int k = rowCount - 1; k >= 0; i--) {
            model2.removeRow(k);
        }*/
       if(jLabel5.getText()=="Alex"){
           model2.setRowCount(0);
           for(int j = 0; j < 2; j++)
       {
           
           row[0] = OrderList.get(j).getId();
           row[1] = OrderList.get(j).getItem();
           row[2] = OrderList.get(j).getQuantity();
           row[4] = OrderList.get(j).getCname();
           
           model2.addRow(row);
           
       }
       }
       else if(jLabel5.getText()=="Bob"){
         model2.setRowCount(0);
           for(int l=2; l < 3; l++)
       {
           
           row[0] = OrderList.get(l).getId();
           row[1] = OrderList.get(l).getItem();
           row[2] = OrderList.get(l).getQuantity();
           row[4] = OrderList.get(l).getCname();
           
           model2.addRow(row);
           
       }
        }
    }//GEN-LAST:event_jTable_ViewCMouseClicked

    private void jButton_FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FinishActionPerformed
        // TODO add your handling code here:
        int i = jTable_ViewOrder.getSelectedRow();
        String id = jTextField_ID.getText();
        String item = jTextField_Item.getText();
        String quantity=jTextField_Quantity.getText();
        String name = jLabel5.getText();
        String status = "Finish";
        String[] row = {id, item, quantity, status, name};
        
        DefaultTableModel model = (DefaultTableModel)jTable_ViewOrder.getModel();
        
        model.removeRow(i);
        model.addRow(row);
    }//GEN-LAST:event_jButton_FinishActionPerformed

    private void jButton_SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SendActionPerformed
        // TODO add your handling code here:
        try{
            String host ="smtp.gmail.com" ;
            String user = "your email";
            String pass = "your password";
            String to = "receiever email";
            String from = "your email";
            String subject = "FastestDeliveryMan";
            String messageText = "Order done";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText+"\n"+jTextField_Message.getText());
          

           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
           
           JOptionPane.showMessageDialog(null, "send successfully");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null ,ex);
        }
    }//GEN-LAST:event_jButton_SendActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Finish;
    private javax.swing.JButton jButton_Pre;
    private javax.swing.JButton jButton_Send;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_ViewC;
    private javax.swing.JTable jTable_ViewOrder;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Item;
    private javax.swing.JTextField jTextField_Message;
    private javax.swing.JTextField jTextField_Quantity;
    // End of variables declaration//GEN-END:variables
}
