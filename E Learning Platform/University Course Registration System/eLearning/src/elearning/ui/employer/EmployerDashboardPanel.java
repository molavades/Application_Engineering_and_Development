/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package elearning.ui.employer;

import elearning.models.StudentDataModel;
import elearning.models.UserDefaultDataModel;
import elearning.models.UserModel;
import elearning.models.UserSignUpModel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author harsh
 */
public class EmployerDashboardPanel extends javax.swing.JPanel {

    JPanel appContainerPanel;
    UserSignUpModel userSignUpObj;
    UserModel userObj;
    UserDefaultDataModel userDefaultDataObj;
    StudentDataModel studentDataObj;

    /**
     * Creates new form EmployerDashboardPanel
     *
     * @param appContainerPanel
     * @param userSignUpObj
     * @param userObj
     * @param userDefaultDataObj
     * @param studentDataObj
     */
    public EmployerDashboardPanel(JPanel appContainerPanel,
            UserSignUpModel userSignUpObj, UserModel userObj,
            UserDefaultDataModel userDefaultDataObj,
            StudentDataModel studentDataObj) {
        initComponents();

        this.appContainerPanel = appContainerPanel;
        this.userSignUpObj = userSignUpObj;
        this.userObj = userObj;
        this.userDefaultDataObj = userDefaultDataObj;
        this.studentDataObj = studentDataObj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        EmpMenuPanel = new javax.swing.JPanel();
        ProfileButton = new javax.swing.JButton();
        CourseCatalogButton = new javax.swing.JButton();
        StudentsButton = new javax.swing.JButton();
        ProfessorsButton = new javax.swing.JButton();
        StudentTranscriptButton = new javax.swing.JButton();
        EmpContentPanel = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        EmpMenuPanel.setBackground(new java.awt.Color(255, 255, 255));
        EmpMenuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ProfileButton.setBackground(new java.awt.Color(51, 153, 255));
        ProfileButton.setText("Profile");
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });

        CourseCatalogButton.setBackground(new java.awt.Color(51, 153, 255));
        CourseCatalogButton.setText("Course Catalog");
        CourseCatalogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseCatalogButtonActionPerformed(evt);
            }
        });

        StudentsButton.setBackground(new java.awt.Color(51, 153, 255));
        StudentsButton.setText("Students List");
        StudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentsButtonActionPerformed(evt);
            }
        });

        ProfessorsButton.setBackground(new java.awt.Color(51, 153, 255));
        ProfessorsButton.setText("Professors List");
        ProfessorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfessorsButtonActionPerformed(evt);
            }
        });

        StudentTranscriptButton.setBackground(new java.awt.Color(51, 153, 255));
        StudentTranscriptButton.setText("Student Transcript");
        StudentTranscriptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentTranscriptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmpMenuPanelLayout = new javax.swing.GroupLayout(EmpMenuPanel);
        EmpMenuPanel.setLayout(EmpMenuPanelLayout);
        EmpMenuPanelLayout.setHorizontalGroup(
            EmpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpMenuPanelLayout.createSequentialGroup()
                .addContainerGap(577, Short.MAX_VALUE)
                .addComponent(ProfileButton)
                .addContainerGap())
            .addGroup(EmpMenuPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(CourseCatalogButton)
                .addGap(34, 34, 34)
                .addComponent(StudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(ProfessorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StudentTranscriptButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmpMenuPanelLayout.setVerticalGroup(
            EmpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProfileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(EmpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseCatalogButton)
                    .addComponent(StudentsButton)
                    .addComponent(ProfessorsButton)
                    .addComponent(StudentTranscriptButton))
                .addContainerGap())
        );

        jSplitPane1.setTopComponent(EmpMenuPanel);

        EmpContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        EmpContentPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(EmpContentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CourseCatalogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseCatalogButtonActionPerformed
        // TODO add your handling code here:
        EmployerCourseCatalogPanel courseCatalog = new EmployerCourseCatalogPanel(
                EmpContentPanel, userDefaultDataObj);
        EmpContentPanel.add("EmpCourseCatalog", courseCatalog);
        CardLayout layout = (CardLayout) EmpContentPanel.getLayout();
        layout.next(EmpContentPanel);
    }//GEN-LAST:event_CourseCatalogButtonActionPerformed

    private void StudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentsButtonActionPerformed
        // TODO add your handling code here:
        EmployerRegisteredStudentsPanel stuPanel = new EmployerRegisteredStudentsPanel(
                EmpContentPanel, userSignUpObj);
        EmpContentPanel.add("EmpStudentList", stuPanel);
        CardLayout layout = (CardLayout) EmpContentPanel.getLayout();
        layout.next(EmpContentPanel);
    }//GEN-LAST:event_StudentsButtonActionPerformed

    private void ProfessorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfessorsButtonActionPerformed
        // TODO add your handling code here:
        EmployerRegisteredProfessorsPanel profPanel = new EmployerRegisteredProfessorsPanel(
                EmpContentPanel, userSignUpObj);
        EmpContentPanel.add("EmpProfList", profPanel);
        CardLayout layout = (CardLayout) EmpContentPanel.getLayout();
        layout.next(EmpContentPanel);
    }//GEN-LAST:event_ProfessorsButtonActionPerformed

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
        // TODO add your handling code here:
        EmployerProfileResetPanel profileReset = new EmployerProfileResetPanel(
                appContainerPanel, EmpContentPanel, userObj, userSignUpObj);
        EmpContentPanel.add("EmpProfile", profileReset);
        CardLayout layout = (CardLayout) EmpContentPanel.getLayout();
        layout.next(EmpContentPanel);
    }//GEN-LAST:event_ProfileButtonActionPerformed

    private void StudentTranscriptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentTranscriptButtonActionPerformed
        // TODO add your handling code here:
        EmployerStudentTarnscriptPanel stuTranscript = new EmployerStudentTarnscriptPanel(
                EmpContentPanel, studentDataObj);
        EmpContentPanel.add("EmpStuTransit", stuTranscript);
        CardLayout layout = (CardLayout) EmpContentPanel.getLayout();
        layout.next(EmpContentPanel);
    }//GEN-LAST:event_StudentTranscriptButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CourseCatalogButton;
    private javax.swing.JPanel EmpContentPanel;
    private javax.swing.JPanel EmpMenuPanel;
    private javax.swing.JButton ProfessorsButton;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JButton StudentTranscriptButton;
    private javax.swing.JButton StudentsButton;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}