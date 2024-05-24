/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package elearning.ui.professor;

import elearning.models.CourseModel;
import elearning.models.SemisterModel;
import elearning.models.UserDefaultDataModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayuka Nirawade
 */
public class ProfManageSubjectPanel extends javax.swing.JPanel {

    JPanel profContentPanel;
    UserDefaultDataModel userDefaultDataObj;

    /**
     * Creates new form CourseCatalogPanel
     */
    /**
     * Creates new form CourseCatalogPanel
     *
     * @param profContentPanel
     * @param userDefaultDataObj
     */
    public ProfManageSubjectPanel(JPanel profContentPanel,
            UserDefaultDataModel userDefaultDataObj) {
        initComponents();
        this.profContentPanel = profContentPanel;
        this.userDefaultDataObj = userDefaultDataObj;

        this.subjectTB.setVisible(false);
        this.courseTB.setVisible(false);
        this.addButton.setVisible(false);

        loadTermDetails();
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
        subjectCB = new javax.swing.JComboBox<>();
        subjectTB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        courseCB = new javax.swing.JComboBox<>();
        courseTB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        termCB = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Manage Subjects");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNo", "Course Name", "Subject/ Stream",
                "Term","Duration", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Subject  :");

        subjectCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        subjectCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectCBActionPerformed(evt);
            }
        });

        jLabel3.setText("Course  :");

        courseCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        courseCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCBActionPerformed(evt);
            }
        });

        jLabel4.setText("Term  :");

        termCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        termCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termCBActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(51, 153, 255));
        addButton.setText("Add Detail");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(courseCB, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(courseTB, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(subjectCB, 0, 240, Short.MAX_VALUE)
                                                .addComponent(termCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addComponent(subjectTB, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(termCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(subjectCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(courseCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void termCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termCBActionPerformed
        // TODO add your handling code here:
        if (this.termCB.getSelectedItem() != null) {
            String termName = this.termCB.getSelectedItem().toString();
            if (termName.equalsIgnoreCase("Select")) {
                this.termCB.removeAllItems();
            } else {
                loadSubjectDetails(termName);
            }
        }
    }//GEN-LAST:event_termCBActionPerformed

    private void subjectCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectCBActionPerformed
        // TODO add your handling code here:
        if (this.subjectCB.getSelectedItem() != null) {
            String termName = this.termCB.getSelectedItem().toString();
            String subName = this.subjectCB.getSelectedItem().toString();
            if (termName.equalsIgnoreCase("Select")) {
                this.subjectCB.removeAllItems();
                this.subjectTB.setVisible(false);
                this.courseTB.setVisible(false);
                this.addButton.setVisible(false);
            } else if (!(termName.equalsIgnoreCase("Select"))
                    && !(subName.equalsIgnoreCase("Select"))
                    && !(subName.equalsIgnoreCase("other"))) {
                this.subjectTB.setVisible(false);
                this.courseTB.setVisible(false);
                this.addButton.setVisible(false);
                loadCourseDetails(termName, subName);
            } else if (subName.equalsIgnoreCase("other")) {
                this.subjectCB.setVisible(false);
                this.courseCB.setVisible(false);

                this.subjectTB.setVisible(true);
                this.courseTB.setVisible(true);
                this.addButton.setVisible(true);
            }
        }
    }//GEN-LAST:event_subjectCBActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String termName = this.termCB.getSelectedItem().toString();
        String subName = this.subjectCB.getSelectedItem().toString();
        String subjectName = "";
        if (subName.equalsIgnoreCase("other")) {
            subjectName = this.subjectTB.getText();
        } else {
            subjectName = subName;
        }
        String courseName = this.courseTB.getText();

        CourseModel courseObj = new CourseModel(subjectName, courseName, "3");
        this.userDefaultDataObj.getCoursesList().add(courseObj);

        List<CourseModel> semisterSubject = new ArrayList<>();
        semisterSubject.add(courseObj);

        SemisterModel semisterObj = new SemisterModel(termName, semisterSubject);

        this.userDefaultDataObj.getSemisterSubList().add(semisterObj);

        loadTableData();
    }//GEN-LAST:event_addButtonActionPerformed

    private void courseCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCBActionPerformed
        // TODO add your handling code here:
        if (this.courseCB.getSelectedItem() != null) {
            String courseName = this.courseCB.getSelectedItem().toString();
            if (courseName.equalsIgnoreCase("other")) {
                this.courseCB.setVisible(false);
                this.courseTB.setVisible(true);
                this.addButton.setVisible(true);
            } else {
                this.courseCB.setVisible(true);
                this.courseTB.setVisible(false);
                this.addButton.setVisible(false);
            }
        }
    }//GEN-LAST:event_courseCBActionPerformed

    private void loadTermDetails() {
        DefaultComboBoxModel dcb = (DefaultComboBoxModel) termCB.getModel();
        dcb.removeAllElements();
        dcb.addElement("Select");
        Set<String> termSet = new HashSet<>();
        if (this.userDefaultDataObj.getSemisterSubList() != null
                && !this.userDefaultDataObj.getSemisterSubList().isEmpty()) {

            for (SemisterModel semisterObj : this.userDefaultDataObj.getSemisterSubList()) {
                termSet.add(semisterObj.getSemisterName());
            }
            if (!termSet.isEmpty()) {
                dcb.addAll(termSet);
            }
        }
    }

    private void loadSubjectDetails(final String termName) {
        if (this.userDefaultDataObj.getSemisterSubList() != null
                && !this.userDefaultDataObj.getSemisterSubList().isEmpty()) {
            DefaultComboBoxModel subcb = (DefaultComboBoxModel) subjectCB.getModel();
            subcb.removeAllElements();
            subcb.addElement("Select");
            Set<String> subjSet = new HashSet<>();
            for (SemisterModel semisterObj : this.userDefaultDataObj.getSemisterSubList()) {
                for (CourseModel courseObj : semisterObj.getSubjects()) {
                    if (semisterObj.getSemisterName().equalsIgnoreCase(termName)) {
                        subjSet.add(courseObj.getSubjectName());
                    }
                }
            }
            if (!subjSet.isEmpty()) {
                subcb.addAll(subjSet);
                subcb.addElement("Other");
            }
        }
    }

    private void loadCourseDetails(final String termName, final String subjName) {
        if (this.userDefaultDataObj.getSemisterSubList() != null
                && !this.userDefaultDataObj.getSemisterSubList().isEmpty()) {
            DefaultComboBoxModel corcb = (DefaultComboBoxModel) courseCB.getModel();
            corcb.removeAllElements();
            corcb.addElement("Select");
            Set<String> subjSet = new HashSet<>();
            for (SemisterModel semisterObj : this.userDefaultDataObj.getSemisterSubList()) {
                for (CourseModel courseObj : semisterObj.getSubjects()) {
                    if (semisterObj.getSemisterName().equalsIgnoreCase(termName)
                            && courseObj.getSubjectName().equalsIgnoreCase(subjName)) {
                        subjSet.add(courseObj.getCourseName());
                    }
                }
            }
            if (!subjSet.isEmpty()) {
                corcb.addAll(subjSet);
                corcb.addElement("Other");
            }
        }
    }

    private void loadTableData() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        if (this.userDefaultDataObj.getSemisterSubList() != null
                && !this.userDefaultDataObj.getSemisterSubList().isEmpty()) {
            int rowIndex = 1;
            for (SemisterModel semisterObj : this.userDefaultDataObj.getSemisterSubList()) {
                for (CourseModel courseObj : semisterObj.getSubjects()) {
                    Object[] row = new Object[6];
                    row[0] = rowIndex;
                    row[1] = courseObj.getCourseName();
                    row[2] = courseObj.getSubjectName();
                    row[3] = semisterObj.getSemisterName();
                    row[4] = courseObj.getDuration();
                    row[5] = "";

                    dtm.addRow(row);
                    rowIndex++;
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> courseCB;
    private javax.swing.JTextField courseTB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> subjectCB;
    private javax.swing.JTextField subjectTB;
    private javax.swing.JComboBox<String> termCB;
    // End of variables declaration//GEN-END:variables
}
