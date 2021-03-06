/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.routineguard.gui;

import com.routineguard.core.*;
import java.awt.Color;


/**
 *
 * @author p1607054
 */
public class AddVisite extends javax.swing.JDialog {
    
    String eventType;
    EventType type;
    Boolean isRadioEnable;
    /**
     * Creates new form AddVisite
     */
    public AddVisite(java.awt.Frame parent, boolean modal, EventType type) {
        super(parent, modal);
        isRadioEnable = true;
        this.type = type;
        if (type == EventType.OUTING){
            eventType = "Sortie";
        }
        else
            eventType = "Visite";

        System.out.println(eventType);
        initComponents();
        alerteEmptyField.setVisible(false);
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
        descripTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        validButton = new javax.swing.JButton();
        startHour = new javax.swing.JTextField();
        endHour = new javax.swing.JTextField();
        eventLabel = new javax.swing.JLabel();
        startMinute = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        endMinute = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        todayRadioButton = new javax.swing.JRadioButton();
        alerteEmptyField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Heure de début :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Heure de fin :");

        descripTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Description (optionnelle)");

        validButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validButton.setText("Valider");
        validButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validButtonActionPerformed(evt);
            }
        });

        startHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHourActionPerformed(evt);
            }
        });

        endHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endHourActionPerformed(evt);
            }
        });

        eventLabel.setText("Ajouter une " + eventType);
        eventLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setText("H");

        jLabel5.setText("H");

        jLabel6.setText("min");

        jLabel7.setText("min");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Le : (ex: 27/08/2001)");

        todayRadioButton.setText("Aujourd'hui");
        todayRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayRadioButtonActionPerformed(evt);
            }
        });

        alerteEmptyField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alerteEmptyField.setForeground(new java.awt.Color(255, 0, 51));
        alerteEmptyField.setText("Champ obligatoire vide /!\\");
            alerteEmptyField.addComponentListener(new java.awt.event.ComponentAdapter() {
                public void componentShown(java.awt.event.ComponentEvent evt) {
                    alerteEmptyFieldComponentShown(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(eventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(descripTextField)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(startHour, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(endHour, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(startMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(endMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(dateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(38, 38, 38))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(todayRadioButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addComponent(validButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(alerteEmptyField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(eventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addComponent(todayRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(endHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(endMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(descripTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alerteEmptyField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(validButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void validButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("valide");
        if (startHour.getText().length()!= 0 && startHour.getText().length() != 0 
         && endHour.getText().length() != 0 && endMinute.getText().length() != 0){
            System.out.println("first test");
            if(dateTextField.getText().length() != 0 || isRadioEnable == false){
                System.out.println("seconde test");
                int beginHour = Integer.parseInt(startHour.getText()) * 60 + Integer.parseInt(startMinute.getText());
                int duration = (Integer.parseInt(endHour.getText()) - Integer.parseInt(startHour.getText())) * 60 +
                        (Integer.parseInt(endMinute.getText()) - Integer.parseInt(startMinute.getText()));

                if (descripTextField.getText().length()!=0){
                    String description = descripTextField.getText();

                    Event newEvent = new Event(beginHour, duration, 0, type, 0, descripTextField.getText());
                }
                else {
                    Event newEvent2 = new Event(beginHour, duration, 0, type, 0);
                }
                this.setVisible(false);
            }
            else 
                ;
        }
        alerteEmptyField.setVisible(true);
    }//GEN-LAST:event_validButtonActionPerformed

    private void startHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startHourActionPerformed

    private void descripTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripTextFieldActionPerformed

    private void endHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endHourActionPerformed

    private void todayRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayRadioButtonActionPerformed
        // TODO add your handling code here:
        dateTextField.setText("");
        dateTextField.setEnabled(!isRadioEnable);
        isRadioEnable = !isRadioEnable;
        this.repaint();
    }//GEN-LAST:event_todayRadioButtonActionPerformed

    private void alerteEmptyFieldComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_alerteEmptyFieldComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_alerteEmptyFieldComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerteEmptyField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTextField descripTextField;
    private javax.swing.JTextField endHour;
    private javax.swing.JTextField endMinute;
    private javax.swing.JLabel eventLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField startHour;
    private javax.swing.JTextField startMinute;
    private javax.swing.JRadioButton todayRadioButton;
    private javax.swing.JButton validButton;
    // End of variables declaration//GEN-END:variables
}
