/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Create;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Person;
import model.PersonHistory;

/**
 *
 * @author libby
 */
public class CreatePanel4 extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel4
     */
    
    PersonHistory history;
    JPanel userProcessContainer;
    Person person;
    
    public CreatePanel4(PersonHistory history, JPanel userProcessContainer, Person person) {
        initComponents();
        this.history = history;
        this.userProcessContainer = userProcessContainer;
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblDeviceType = new javax.swing.JLabel();
        lblDeviceModel = new javax.swing.JLabel();
        txtDeviceModel = new javax.swing.JTextField();
        lblIMEI = new javax.swing.JLabel();
        txtIMEI = new javax.swing.JTextField();
        lblVehicleType = new javax.swing.JLabel();
        lblTitle3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblHealthPlanNumber = new javax.swing.JLabel();
        lblMedicalRecordNumber = new javax.swing.JLabel();
        txtHealthPlanNumber = new javax.swing.JTextField();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        txtDeviceType = new javax.swing.JTextField();
        txtVehicleType = new javax.swing.JTextField();
        lblVehicleModel = new javax.swing.JLabel();
        txtVehicleModel = new javax.swing.JTextField();
        lblPlate = new javax.swing.JLabel();
        txtPlate = new javax.swing.JTextField();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblTitle.setText("Create Personal Profile: Step 4 of 6");

        lblTitle2.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblTitle2.setText("Device & Vehicle Information");

        lblDeviceType.setText("Device Type:");

        lblDeviceModel.setText("Model:");

        lblIMEI.setText("IMEI:");

        lblVehicleType.setText("Vehicle Type:");

        lblTitle3.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblTitle3.setText("Health Information");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblHealthPlanNumber.setText("Health Plan Beneficiary Number:");

        lblMedicalRecordNumber.setText("Medical Record Number:");

        lblVehicleModel.setText("Model:");

        lblPlate.setText("Plate:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedicalRecordNumber)
                            .addComponent(lblHealthPlanNumber))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMedicalRecordNumber)
                            .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)))
                    .addComponent(lblTitle3)
                    .addComponent(lblTitle2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeviceType)
                            .addComponent(lblVehicleType))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDeviceType, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDeviceModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDeviceModel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVehicleModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVehicleModel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlate)
                            .addComponent(lblIMEI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIMEI, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitle))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtIMEI, txtPlate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceType)
                    .addComponent(lblDeviceModel)
                    .addComponent(txtDeviceModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIMEI)
                    .addComponent(txtIMEI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeviceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleType)
                    .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVehicleModel)
                    .addComponent(txtVehicleModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlate)
                    .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTitle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedicalRecordNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealthPlanNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        person.setHealthPlanNum(txtHealthPlanNumber.getText());
        person.setMedicalRecordNum(txtMedicalRecordNumber.getText());
        person.addDevice(txtDeviceType.getText(), txtDeviceModel.getText(), txtIMEI.getText());
        person.addVehicle(txtVehicleType.getText(), txtVehicleModel.getText(), txtPlate.getText());

        CreatePanel5 cp = new CreatePanel5(history, userProcessContainer,person);
        userProcessContainer.add("CreatePanel5",cp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblDeviceModel;
    private javax.swing.JLabel lblDeviceType;
    private javax.swing.JLabel lblHealthPlanNumber;
    private javax.swing.JLabel lblIMEI;
    private javax.swing.JLabel lblMedicalRecordNumber;
    private javax.swing.JLabel lblPlate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblVehicleModel;
    private javax.swing.JLabel lblVehicleType;
    private javax.swing.JTextField txtDeviceModel;
    private javax.swing.JTextField txtDeviceType;
    private javax.swing.JTextField txtHealthPlanNumber;
    private javax.swing.JTextField txtIMEI;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtPlate;
    private javax.swing.JTextField txtVehicleModel;
    private javax.swing.JTextField txtVehicleType;
    // End of variables declaration//GEN-END:variables
}
