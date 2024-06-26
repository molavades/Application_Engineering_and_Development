/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package elearning.ui.admin;

import elearning.models.UserModel;
import elearning.models.UserSignUpModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harsh
 */
public class AdminApproveUsersPanel extends javax.swing.JPanel {

    JPanel adminDashContentPanel;
    UserSignUpModel userSignUpObj;

    /**
     * Creates new form AdminApproveUsersPanel
     *
     * @param adminDashContentPanel
     * @param userSignUpObj
     */
    public AdminApproveUsersPanel(JPanel adminDashContentPanel,
            UserSignUpModel userSignUpObj) {
        initComponents();

        this.adminDashContentPanel = adminDashContentPanel;
        this.userSignUpObj = userSignUpObj;

        this.UserStatusLB.setText("");
        this.UserFullNameLB.setText("");

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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        UserTypeCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        UserNameCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        UserFullNameLB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UserStatusLB = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Enable / Disable External Users");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Sno", "Username", "Email", "User Type","Status","Action"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("User Type  :");

        UserTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","EMPLOYER","CERTIFICATE ISSUER" }));
        UserTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTypeCBActionPerformed(evt);
            }
        });

        jLabel3.setText("Username  :");

        UserNameCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        UserNameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameCBActionPerformed(evt);
            }
        });

        jLabel4.setText("Full Name  :");

        UserFullNameLB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UserFullNameLB.setText("jLabel5");

        jLabel5.setText("Login Status  :");

        UserStatusLB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UserStatusLB.setForeground(new java.awt.Color(255, 0, 102));
        UserStatusLB.setText("jLabel6");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Enable");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserFullNameLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(UserNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(UserStatusLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UserTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(UserNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(UserFullNameLB)
                    .addComponent(jLabel5)
                    .addComponent(UserStatusLB))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getAccessibleContext().setAccessibleParent(jTable1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userType = this.UserTypeCB.getSelectedItem().toString();
        String userName = this.UserNameCB.getSelectedItem().toString();
        if ((!userName.equalsIgnoreCase("select"))
                && ((!userType.equalsIgnoreCase("select")))) {
            if (!this.userSignUpObj.getUserLi().isEmpty()) {
                for (UserModel userObj : this.userSignUpObj.getUserLi()) {
                    if ((userObj.getUserType().equalsIgnoreCase(userType))
                            && (userObj.getUsername().equalsIgnoreCase(userName))) {
                        if (userObj.getEnabled() == 0) {
                            userObj.setEnabled(1);
                            break;
                        } else if (userObj.getEnabled() == 1) {
                            userObj.setEnabled(0);
                            break;
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "User Status Updated..");
        loadTableData();
        this.UserStatusLB.setText("");
        this.UserFullNameLB.setText("");
        this.UserNameCB.removeAllItems();
        this.UserNameCB.addItem("Select");
        this.UserNameCB.setSelectedIndex(0);
        this.UserTypeCB.setSelectedIndex(0);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void UserTypeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTypeCBActionPerformed
        // TODO add your handling code here:
        if (this.UserTypeCB.getSelectedItem() != null) {
            DefaultComboBoxModel usernameCB = (DefaultComboBoxModel) this.UserNameCB.getModel();
            String userType = this.UserTypeCB.getSelectedItem().toString();
            if (!userType.equalsIgnoreCase("select")) {
                if (!this.userSignUpObj.getUserLi().isEmpty()) {
                    for (UserModel userObj : this.userSignUpObj.getUserLi()) {
                        if (userObj.getUserType().equalsIgnoreCase(userType)) {
                            usernameCB.addElement(userObj.getUsername());
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_UserTypeCBActionPerformed

    private void UserNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameCBActionPerformed
        // TODO add your handling code here:
        if (this.UserNameCB.getSelectedItem() != null) {
            String userType = this.UserTypeCB.getSelectedItem().toString();
            String userName = this.UserNameCB.getSelectedItem().toString();
            if ((!userName.equalsIgnoreCase("select"))
                    && ((!userType.equalsIgnoreCase("select")))) {
                if (!this.userSignUpObj.getUserLi().isEmpty()) {
                    for (UserModel userObj : this.userSignUpObj.getUserLi()) {
                        if ((userObj.getUserType().equalsIgnoreCase(userType))
                                && (userObj.getUsername().equalsIgnoreCase(userName))) {
                            UserFullNameLB.setText(userObj.getFullName());
                            if (userObj.getEnabled() == 0) {
                                UserStatusLB.setText("Disabled");
                                this.jButton1.setText("Enable");
                            }
                            if (userObj.getEnabled() == 1) {
                                UserStatusLB.setText("Enabled");
                                this.jButton1.setText("Disable");
                            }
                        }
                    }
                }
            }
            loadTableData();
        }
    }//GEN-LAST:event_UserNameCBActionPerformed

    private void loadTableData() {
        if (!this.userSignUpObj.getUserLi().isEmpty()) {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            int rowIndex = 1;
            // "Sno", "Username", "Email", "User Type","Contact"
            for (UserModel userObj : this.userSignUpObj.getUserLi()) {
                if ((userObj.getUserType().equalsIgnoreCase("EMPLOYER"))
                        || (userObj.getUserType().equalsIgnoreCase("CERTIFICATE ISSUER"))) {
                    Object[] row = new Object[6];
                    row[0] = rowIndex;
                    row[1] = userObj.getUsername();
                    row[2] = userObj.getEmail();
                    row[3] = userObj.getUserType();
                    if (userObj.getEnabled() == 0) {
                        row[4] = "Disabled";
                    } else {
                        row[4] = "Enabled";
                    }
                    row[5] = "";
//                    TableCellRenderer buttonRenderer = new TableButtonRenderer();
//                    TableButtonEditor buttonEditor = new  TableButtonEditor(
//                            userObj.getFullName(), this.userSignUpObj, jTable1, rowIndex,4);
//                    jTable1.getColumn("Action").setCellRenderer(buttonRenderer);
//                    jTable1.getColumn("Action").setCellEditor(buttonEditor);
//                    
//                    jTable1.setRowHeight(30);
                    dtm.addRow(row);
                    dtm.fireTableDataChanged();
                    rowIndex++;
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserFullNameLB;
    private javax.swing.JComboBox<String> UserNameCB;
    private javax.swing.JLabel UserStatusLB;
    private javax.swing.JComboBox<String> UserTypeCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

//    private static class JTableButtonRenderer implements TableCellRenderer {
//
//        @Override
//        public Component getTableCellRendererComponent(JTable table, Object value,
//                boolean isSelected, boolean hasFocus, int row, int column) {
//            JButton button = (JButton) value;
//            return button;
//        }
//    }
}
