/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package elearning.ui;

import elearning.models.UserModel;
import elearning.models.UserSignUpModel;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harsh
 */
public class SignUp extends javax.swing.JPanel {

    JPanel appContainerPanel;

    UserSignUpModel userSignUpObj;

    /**
     * Creates new form SignUp
     *
     * @param appContainerPanel
     * @param userSignUpObj
     */
    public SignUp(JPanel appContainerPanel, UserSignUpModel userSignUpObj) {
        initComponents();
        this.appContainerPanel = appContainerPanel;
        this.userSignUpObj = userSignUpObj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        contactNoTextBox = new javax.swing.JTextField();
        emailTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passwordTextBox = new javax.swing.JPasswordField();
        loginTypeCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userNameTextBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fullNameTextBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ValidateLabel = new javax.swing.JLabel();

        setAutoscrolls(true);

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("SIGN UP");

        contactNoTextBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactNoTextBox.setForeground(new java.awt.Color(102, 102, 102));
        contactNoTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNoTextBoxActionPerformed(evt);
            }
        });

        emailTextBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailTextBox.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("User Name");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Password");

        passwordTextBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordTextBox.setForeground(new java.awt.Color(102, 102, 102));

        loginTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STUDENT", "PROFESSOR", "EMPLOYER", "CERTIFICATE ISSUER" }));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("LoginType");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Contact No  ");

        userNameTextBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userNameTextBox.setForeground(new java.awt.Color(102, 102, 102));
        userNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextBoxActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Full name");

        fullNameTextBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fullNameTextBox.setForeground(new java.awt.Color(102, 102, 102));
        fullNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTextBoxActionPerformed(evt);
            }
        });

        StringBuilder sbf = new StringBuilder();
        sbf.append("<html>");
        sbf.append("<u><b>Password Guidelines:</b></u>").append("</br>");
        sbf.append("1. At least 8 characters long but 12 or more is better.").append("</br>");
        sbf.append("2. A combination of uppercase letters, lowercase letters, numbers, and symbols.")
        .append("</br> Do not use these *&/(/^%$ symbols)").append("</br>");
        sbf.append("</html>");
        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("<html> "
            + "Password Guidelines: </br>"
            + "1. At least 8 characters long but 12 or more is better.</br>"
            + "2. A combination of uppercase letters, lowercase letters, numbers, and symbols.</br>"
            + "Do not use these *&/(/^%$ symbols) </br>"
            + "</html>");

        ValidateLabel.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(70, 70, 70)
                                .addComponent(userNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactNoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValidateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 96, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(userNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passwordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(contactNoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ValidateLabel)
                .addGap(4, 4, 4)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (validateForm()) {
            UserModel userObj = new UserModel();
            userObj.setUserType(this.loginTypeCombo.getSelectedItem().toString());
            userObj.setUsername(this.userNameTextBox.getText());
            userObj.setPassword(this.passwordTextBox.getText());
            userObj.setEmail(this.emailTextBox.getText());
            userObj.setFullName(this.fullNameTextBox.getText());
            userObj.setMobile(this.contactNoTextBox.getText());

            switch (this.loginTypeCombo.getSelectedItem().toString()) {
                case "STUDENT" -> {
                    userObj.setEnabled(1);
                }
                case "PROFESSOR" -> {
                    userObj.setEnabled(1);
                }
                case "EMPLOYEER" -> {
                    userObj.setEnabled(0);
                }
                case "CERTIFICATE ISSUER" -> {
                    userObj.setEnabled(0);
                }
            }

            userSignUpObj.getUserLi().add(userObj);

            JOptionPane.showMessageDialog(null, "User SignUp Successfull!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
            Login loginPanel = new Login(appContainerPanel, userSignUpObj);
            appContainerPanel.add("Login", loginPanel);
            CardLayout layout = (CardLayout) appContainerPanel.getLayout();
            layout.next(appContainerPanel);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contactNoTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNoTextBoxActionPerformed

    private void userNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextBoxActionPerformed

    private void fullNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTextBoxActionPerformed

    private boolean validateForm() {
        String regex = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$";

        if (this.fullNameTextBox.getText().trim().isEmpty()) {
            this.ValidateLabel.setText("User Fullname is mandatory..");
            return false;
        } else if (this.fullNameTextBox.getText().trim().length() < 4) {
            this.ValidateLabel.setText("User Fullname must be minimum of four characters..");
            return false;
        }
        if (this.userNameTextBox.getText().trim().isEmpty()) {
            this.ValidateLabel.setText("Username is mandatory..");
            return false;
        } else if (this.userNameTextBox.getText().trim().length() < 8) {
            this.ValidateLabel.setText("Username must be minimum of eight characters..");
            return false;
        } else {
            if (!this.userSignUpObj.getUserLi().isEmpty()) {
                for (UserModel userObj : this.userSignUpObj.getUserLi()) {
                    if (userObj.getUsername().equalsIgnoreCase(this.userNameTextBox.getText().trim())) {
                        this.ValidateLabel.setText("Username already exists..");
                        return false;
                    }
                }
            }
            if (!this.userSignUpObj.getUserLi().isEmpty()) {
                for (UserModel userObj : this.userSignUpObj.getUserLi()) {
                    if (userObj.getFullName().equalsIgnoreCase(this.fullNameTextBox.getText().trim())) {
                        this.ValidateLabel.setText("User Fullname already exists..");
                        return false;
                    }
                }
            }
        }
        if (this.passwordTextBox.getText().trim().isEmpty()) {
            this.ValidateLabel.setText("Password is mandatory..");
            return false;
        } else if (this.passwordTextBox.getText().trim().length() < 8) {
            this.ValidateLabel.setText("Password must be greater than eight characters..");
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(this.passwordTextBox.getText().trim());
            if (!m.matches()) {
                this.ValidateLabel.setText("Invalid password. Please follow password guidelines..");
                return false;
            }
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ValidateLabel;
    private javax.swing.JTextField contactNoTextBox;
    private javax.swing.JTextField emailTextBox;
    private javax.swing.JTextField fullNameTextBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> loginTypeCombo;
    private javax.swing.JPasswordField passwordTextBox;
    private javax.swing.JTextField userNameTextBox;
    // End of variables declaration//GEN-END:variables
}