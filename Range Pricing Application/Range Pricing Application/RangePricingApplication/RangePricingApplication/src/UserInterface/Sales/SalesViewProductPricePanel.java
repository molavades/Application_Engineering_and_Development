/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Sales;

import UserInterface.Admin.*;
import TheBusiness.Business.Business;
import TheBusiness.ProductManagement.Product;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import TheBusiness.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harsh
 */
public class SalesViewProductPricePanel extends javax.swing.JPanel {

    JPanel ContentPanel;
    Business business;
    UserAccount ua;

    /**
     * Creates new form AdminManagePricePanel
     *
     * @param business
     * @param ua
     * @param ContentPanel
     */
    public SalesViewProductPricePanel(Business business, UserAccount ua,
            JPanel ContentPanel) {
        initComponents();

        this.business = business;
        this.ContentPanel = ContentPanel;
        this.ua = ua;

        loadBusinessDetails();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        heading = new javax.swing.JLabel();
        businessNameLB = new javax.swing.JLabel();
        businessNameCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        suppilerNameCB = new javax.swing.JComboBox<>();
        loadDataButton = new javax.swing.JButton();
        backToDashButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        heading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        heading.setText("Manage Products & Prices");

        businessNameLB.setText("Business :");

        businessNameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessNameCBActionPerformed(evt);
            }
        });

        jLabel1.setText("Supplier :");

        suppilerNameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppilerNameCBActionPerformed(evt);
            }
        });

        loadDataButton.setBackground(new java.awt.Color(51, 153, 255));
        loadDataButton.setText("Load Data");
        loadDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDataButtonActionPerformed(evt);
            }
        });

        backToDashButton.setBackground(new java.awt.Color(51, 153, 255));
        backToDashButton.setText("<< Back");
        backToDashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToDashButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "SNo", "Supplier", "Product", "Floor Price",
                "Ceiling Price","Target Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 220, Short.MAX_VALUE)
                        .addComponent(heading)
                        .addGap(122, 122, 122)
                        .addComponent(backToDashButton))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(businessNameLB)
                        .addGap(18, 18, 18)
                        .addComponent(businessNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadDataButton)
                            .addComponent(suppilerNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heading)
                    .addComponent(backToDashButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(businessNameLB)
                    .addComponent(businessNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(suppilerNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loadDataButton)
                .addGap(9, 9, 9)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backToDashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToDashButtonActionPerformed
        // TODO add your handling code here:
        SalesDashboardPanel saleDashPanel
                = new SalesDashboardPanel(business, ua, ContentPanel);
        ContentPanel.add("SaleDash", saleDashPanel);
        CardLayout layout = (CardLayout) ContentPanel.getLayout();
        layout.next(ContentPanel);
    }//GEN-LAST:event_backToDashButtonActionPerformed

    private void businessNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessNameCBActionPerformed
        // TODO add your handling code here:
        if (this.businessNameCB.getSelectedItem() != null) {
            String bName = this.businessNameCB.getSelectedItem().toString();
            loadSupplierData(bName);
        }
    }//GEN-LAST:event_businessNameCBActionPerformed

    private void suppilerNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppilerNameCBActionPerformed
        // TODO add your handling code here:
        loadTableData();
    }//GEN-LAST:event_suppilerNameCBActionPerformed

    private void loadDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDataButtonActionPerformed
        // TODO add your handling code here:
        loadTableData();
    }//GEN-LAST:event_loadDataButtonActionPerformed

    private void loadBusinessDetails() {
        if (this.business != null) {
            DefaultComboBoxModel subcb = (DefaultComboBoxModel) businessNameCB.getModel();
            subcb.removeAllElements();
            subcb.addElement("Select");
            Set<String> subjSet = new HashSet<>();
            subjSet.add(business.getName());
            if (!subjSet.isEmpty()) {
                subcb.addAll(subjSet);
            }
        }
    }

    private void loadSupplierData(String businessName) {
        if ((this.business.getSupplierDirectory() != null)
                && (!this.business.getSupplierDirectory().getSuplierList().isEmpty())) {
            DefaultComboBoxModel dcb = (DefaultComboBoxModel) suppilerNameCB.getModel();
            dcb.removeAllElements();
            dcb.addElement("Select");
            Set<String> stuSet = new HashSet<>();
            for (Supplier supObj : this.business.getSupplierDirectory().getSuplierList()) {
                stuSet.add(supObj.getName());
            }
            if (!stuSet.isEmpty()) {
                dcb.addAll(stuSet);
            } else {

            }
        }
    }

    private void loadTableData() {
        if (business != null) {
            String businessName = this.businessNameCB.getSelectedItem() != null
                    ? this.businessNameCB.getSelectedItem().toString() : "";
            String supplierName = this.suppilerNameCB.getSelectedItem() != null
                    ? this.suppilerNameCB.getSelectedItem().toString() : "";
            if (business.getName().equalsIgnoreCase(businessName)) {
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                int rowIndex = 1;
                SupplierDirectory supDir = business.getSupplierDirectory();
                if (supDir != null && !supDir.getSuplierList().isEmpty()) {
                    for (Supplier sup : supDir.getSuplierList()) {
                        if (sup.getName().equalsIgnoreCase(supplierName)) {
                            for (Product prod : sup.getProductCatalog().getProductList()) {
                                Object[] row = new Object[6];
                                row[0] = rowIndex;
                                row[1] = sup.getName();
                                row[2] = prod.getName();
                                row[3] = prod.getFloorPrice();
                                row[4] = prod.getCeilingPrice();
                                row[5] = prod.getTargetPrice();
                                dtm.addRow(row);
                                rowIndex++;
                            }
                        }
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToDashButton;
    private javax.swing.JComboBox<String> businessNameCB;
    private javax.swing.JLabel businessNameLB;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton loadDataButton;
    private javax.swing.JComboBox<String> suppilerNameCB;
    // End of variables declaration//GEN-END:variables
}
