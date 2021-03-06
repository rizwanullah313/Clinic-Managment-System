
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaaz
 */
public class DoctorsPatientInfoForm extends javax.swing.JFrame {

    /**
     * Creates new form DoctorsPatientInfoForm
     */
    public DoctorsPatientInfoForm() {
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SignOutButton = new javax.swing.JButton();
        UpcomingAppointmentsButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DateTxt = new javax.swing.JLabel();
        Txt = new javax.swing.JLabel();
        UserIDTxt = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JLabel();
        DFieldTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel3.setLayout(null);

        jButton1.setText("Give Medicine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(2, 96, 156, 39);

        jButton2.setText("Patient Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(2, 148, 156, 39);

        SignOutButton.setText("Sign Out");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SignOutButton);
        SignOutButton.setBounds(0, 200, 156, 39);

        UpcomingAppointmentsButton.setText("Upcoming Appointments");
        UpcomingAppointmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpcomingAppointmentsButtonActionPerformed(evt);
            }
        });
        jPanel3.add(UpcomingAppointmentsButton);
        UpcomingAppointmentsButton.setBounds(2, 46, 156, 39);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 90, 160, 440);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(null);

        jTable1.setBackground(new java.awt.Color(102, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Time & Date", "Disease", "Condition", "Check In/Out"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 61, 680, 349);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(160, 90, 680, 440);

        DateTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DateTxt.setForeground(new java.awt.Color(255, 255, 255));
        DateTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.add(DateTxt);
        DateTxt.setBounds(570, 50, 260, 30);

        Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt.setForeground(new java.awt.Color(255, 255, 255));
        Txt.setText("LOGIN AS");
        Txt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.add(Txt);
        Txt.setBounds(10, 10, 80, 30);

        UserIDTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserIDTxt.setForeground(new java.awt.Color(255, 255, 255));
        UserIDTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.add(UserIDTxt);
        UserIDTxt.setBounds(100, 10, 70, 30);

        UserNameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        UserNameTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.add(UserNameTxt);
        UserNameTxt.setBounds(180, 10, 110, 30);

        DFieldTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DFieldTxt.setForeground(new java.awt.Color(255, 255, 255));
        DFieldTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.add(DFieldTxt);
        DFieldTxt.setBounds(10, 50, 280, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginScreenForm login = new LoginScreenForm();
        JOptionPane.showMessageDialog(null, "Looged Out");
        login.setVisible(true);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void UpcomingAppointmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpcomingAppointmentsButtonActionPerformed
        // TODO add your handling code here:
          DoctorUpcomingAppointmentsForm app = new DoctorUpcomingAppointmentsForm();
        this.setVisible(false);
        app.setVisible(true);
    }//GEN-LAST:event_UpcomingAppointmentsButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DoctorGiveMedicineForm give = new DoctorGiveMedicineForm(Integer.parseInt(UserIDTxt.getText()));
        this.setVisible(false);
        give.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorsPatientInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorsPatientInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorsPatientInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorsPatientInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorsPatientInfoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DFieldTxt;
    private javax.swing.JLabel DateTxt;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JLabel Txt;
    private javax.swing.JButton UpcomingAppointmentsButton;
    private javax.swing.JLabel UserIDTxt;
    private javax.swing.JLabel UserNameTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
