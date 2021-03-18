
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizwan
 */
public class AdminMainForm extends javax.swing.JFrame {

    /**
     * Creates new form PatientRegForm
     */
    Date date = new Date();
    public AdminMainForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        }
     public AdminMainForm(int ID){
           
           initComponents();
        this.setLocationRelativeTo(null);
        
            DateTxt.setText(date.toString());
           UserIDTxt.setText(String.valueOf(ID));
           admin log = new admin();
          try {
           ResultSet rst;
          rst = log.GetAName(Integer.parseInt(UserIDTxt.getText()));
         String Name = rst.getString("AName");
         UserNameTxt.setText(Name);
         
      } catch (SQLException ex) {
          
          
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PatientInformationButton = new javax.swing.JButton();
        PatientCheckOutButton = new javax.swing.JButton();
        SignOutButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Txt = new javax.swing.JLabel();
        UserIDTxt = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JLabel();
        DateTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel3.setLayout(null);

        PatientInformationButton.setText("Patient Information");
        PatientInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientInformationButtonActionPerformed(evt);
            }
        });
        jPanel3.add(PatientInformationButton);
        PatientInformationButton.setBounds(0, 30, 156, 39);

        PatientCheckOutButton.setText("Patient Checkout");
        PatientCheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientCheckOutButtonActionPerformed(evt);
            }
        });
        jPanel3.add(PatientCheckOutButton);
        PatientCheckOutButton.setBounds(0, 90, 156, 39);

        SignOutButton.setText("Sign Out");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SignOutButton);
        SignOutButton.setBounds(0, 280, 160, 39);

        jButton1.setText("ADD Medicine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(0, 210, 160, 40);

        jButton3.setText("ADD Doctor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(0, 150, 160, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 90, 160, 440);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminMain.v1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 90, 710, 440);

        Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt.setForeground(new java.awt.Color(255, 255, 255));
        Txt.setText("LOGIN AS");
        Txt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.add(Txt);
        Txt.setBounds(10, 50, 80, 30);

        UserIDTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserIDTxt.setForeground(new java.awt.Color(255, 255, 255));
        UserIDTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.add(UserIDTxt);
        UserIDTxt.setBounds(100, 50, 70, 30);

        UserNameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        UserNameTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.add(UserNameTxt);
        UserNameTxt.setBounds(180, 50, 110, 30);

        DateTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DateTxt.setForeground(new java.awt.Color(255, 255, 255));
        DateTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.add(DateTxt);
        DateTxt.setBounds(530, 50, 260, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Patient ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 120, 120, 17);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 170, 110, 20);

        jButton2.setText("Delete Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 230, 160, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        LoginScreenForm login = new LoginScreenForm();
        JOptionPane.showMessageDialog(null, "Logged Out");
        login.setVisible(true);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void PatientInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientInformationButtonActionPerformed
        // TODO add your handling code here:
        PatientVisitHistory p_info = new PatientVisitHistory(Integer.parseInt(UserIDTxt.getText()));
        p_info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PatientInformationButtonActionPerformed

    private void PatientCheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientCheckOutButtonActionPerformed
        // TODO add your handling code here:
        PatientCheckoutTable chk = new PatientCheckoutTable();
        chk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PatientCheckOutButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddMedicine op = new AddMedicine();
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int u = Integer.parseInt(jTextField1.getText());
        Patient d = new Patient();
        d.deletePatient(u);
        JOptionPane.showMessageDialog(Txt, "PAtient Delete Suuccessfull");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        RegisterDoctor b = new RegisterDoctor();
        b.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateTxt;
    private javax.swing.JButton PatientCheckOutButton;
    private javax.swing.JButton PatientInformationButton;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JLabel Txt;
    private javax.swing.JLabel UserIDTxt;
    private javax.swing.JLabel UserNameTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}