/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package elearning.ui.professor;

import elearning.models.UserModel;
import elearning.models.UserSignUpModel;
import elearning.ui.Login;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aayuka Nirawade
 */
public class ProfessorProfileResetPanel extends javax.swing.JPanel {

    JPanel adminDashContentPanel;
    JPanel appContainerPanel;
    UserModel userObj;
    UserSignUpModel userSignUpObj;

    /**
     * Creates new form AdminProfileResetPanel
     *
     * @param appContainerPanel
     * @param adminDashContentPanel
     * @param userObj
     * @param userSignUpObj
     */
    public ProfessorProfileResetPanel(JPanel appContainerPanel,
            JPanel adminDashContentPanel, UserModel userObj,
            UserSignUpModel userSignUpObj) {
        initComponents();
        this.appContainerPanel = appContainerPanel;
        this.adminDashContentPanel = adminDashContentPanel;
        this.userObj = userObj;
        this.userSignUpObj = userSignUpObj;

        if (userObj != null) {
            this.emailTextBox.setText(userObj.getEmail());
            this.fullNameTextBox.setText(userObj.getFullName());
            this.mobileTextBox.setText(userObj.getMobile());
            this.passwordTextBox.setText(userObj.getPassword());
            this.userNameTextBox.setText(userObj.getUsername());
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNameTextBox = new javax.swing.JTextField();
        passwordTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fullNameTextBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mobileTextBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Profile");

        jLabel2.setText("Username  :");

        jLabel3.setText("Password  :");

        jLabel4.setText("email  :");

        jLabel5.setText("Full Name  :");

        jLabel6.setText("Mobile  :");

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(userNameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(emailTextBox)
                                            .addComponent(mobileTextBox))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(passwordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fullNameTextBox)))))))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(userNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fullNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mobileTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Username :" + userObj.getUsername());
        List<UserModel> pUserSignUpLi = new ArrayList<>();
        if (!this.userSignUpObj.getUserLi().isEmpty()) {
            for (UserModel pUserObj : this.userSignUpObj.getUserLi()) {
                if (pUserObj.getUsername().equalsIgnoreCase(userObj.getUsername())) {
                    pUserObj.setUsername(this.userNameTextBox.getText());
                    pUserObj.setPassword(this.passwordTextBox.getText());
                    pUserObj.setFullName(this.fullNameTextBox.getText());
                    pUserObj.setEmail(this.emailTextBox.getText());
                    pUserObj.setMobile(this.mobileTextBox.getText());
                }
                pUserSignUpLi.add(pUserObj);
            }
        }
        this.userSignUpObj.getUserLi().clear();
        this.userSignUpObj.getUserLi().addAll(pUserSignUpLi);

        JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");

        Login loginPanel = new Login(appContainerPanel, userSignUpObj);
        appContainerPanel.add("Login", loginPanel);
        CardLayout layout = (CardLayout) appContainerPanel.getLayout();
        layout.next(appContainerPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextBox;
    private javax.swing.JTextField fullNameTextBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mobileTextBox;
    private javax.swing.JTextField passwordTextBox;
    private javax.swing.JTextField userNameTextBox;
    // End of variables declaration//GEN-END:variables
}
