/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Markets;

import TheBusiness.Business.Business;
import TheBusiness.SolutionOrders.MasterSolutionOrderList;
import TheBusiness.SolutionOrders.SolutionOrder;
import TheBusiness.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harsh
 */
public class MarketSolutionsOfferedCatlogPanel extends javax.swing.JPanel {

    JPanel ContentPanel;
    Business business;
    UserAccount ua;

    /**
     * Creates new form MarketSolutionsOfferedPanel
     *
     * @param business
     * @param ua
     * @param ContentPanel
     */
    public MarketSolutionsOfferedCatlogPanel(Business business, UserAccount ua,
            JPanel ContentPanel) {
        initComponents();

        this.business = business;
        this.ContentPanel = ContentPanel;
        this.ua = ua;

        loadTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backToDashButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        backToDashButton.setBackground(new java.awt.Color(51, 153, 255));
        backToDashButton.setText("<< Back");
        backToDashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToDashButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Solutions Offers");
        jLabel1.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setText("New Offer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "SNo", "Product", "Floor", "Ceiling", "Target",
                "Offer Floor", "Offer Ceiling", "Offer Target",
                ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(190, 190, 190)
                                .addComponent(backToDashButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backToDashButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backToDashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToDashButtonActionPerformed
        // TODO add your handling code here:
        MarketDashboardPanel marketDash
                = new MarketDashboardPanel(business, ua, ContentPanel);
        ContentPanel.add("MarketDash", marketDash);
        CardLayout layout = (CardLayout) ContentPanel.getLayout();
        layout.next(ContentPanel);
    }//GEN-LAST:event_backToDashButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MarketSolutionOfferPanel marketSO
                = new MarketSolutionOfferPanel(business, ua, ContentPanel);
        ContentPanel.add("MarketSO", marketSO);
        CardLayout layout = (CardLayout) ContentPanel.getLayout();
        layout.next(ContentPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    /*"SNo", "Product", "Floor", "Ceiling", "Target",
        "Offer Floor", "Offer Ceiling", "Offer Target",
        ""
     */
    private void loadTableData() {
        if (business != null) {
            int rowIndex = 1;
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            MasterSolutionOrderList msol = business.getMasterSolutionOrderList();
            for (SolutionOrder so : msol.getSolutionorderlist()) {
                Object[] row = new Object[9];
                row[0] = rowIndex;
                row[1] = so.getSelectedsolutionoffer().getProduct().getName();
                row[2] = so.getSelectedsolutionoffer().getProduct().getFloorPrice();
                row[3] = so.getSelectedsolutionoffer().getProduct().getCeilingPrice();
                row[4] = so.getSelectedsolutionoffer().getProduct().getTargetPrice();
                row[5] = so.getSelectedsolutionoffer().getSoFP();
                row[6] = so.getSelectedsolutionoffer().getSoCP();
                row[7] = so.getSelectedsolutionoffer().getSoTP();
                row[8] = "";
                dtm.addRow(row);
                rowIndex++;
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToDashButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
