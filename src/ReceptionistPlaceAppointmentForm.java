
import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaaz
 */
public class ReceptionistPlaceAppointmentForm extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionistPatientAppointmentForm
     */
    Date date = new Date();
    public ReceptionistPlaceAppointmentForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        SetPIDCombo();
        SetConsultToCombo();
        SetWardFloorCombo();
        PlaceAppointmentButton.setEnabled(false);
        //ChkBill.setEnabled(false);
       //CurrentDateTxt.setText(date.toString());
       }
           public ReceptionistPlaceAppointmentForm(int ID){
           
           initComponents();
        this.setLocationRelativeTo(null);
        AppDateTxt.getJCalendar().setMinSelectableDate(new Date());
        
        
        
                SetPIDCombo();
        SetConsultToCombo();
        SetWardFloorCombo();
        PlaceAppointmentButton.setEnabled(false);
            DateTxt.setText(date.toString());
           UserIDTxt.setText(String.valueOf(ID));
             Receptionist re =new Receptionist();
          try {
           ResultSet rst;
          rst = re.getname(Integer.parseInt(UserIDTxt.getText()));
         String Name = rst.getString("RName");
        UserNameTxt.setText(Name);
          
      } catch (SQLException ex) {
          
      }
           
       }


    public void SetPIDCombo(){
        ResultSet rst;
       
        try {
             Receptionist rec = new Receptionist();
            rst = rec.GetPatientID();
            if(!rst.next()){
                JOptionPane.showMessageDialog(null, "No More Patients Found");
               
            }
            else{
                   do{
                PIDComboBox.addItem(rst.getString("PID"));
            }  while(rst.next());
            }
         
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PIDCombo Error");
        }
    }
    public void SetConsultToCombo(){
          ResultSet rst;
        
          Doctor doc = new Doctor();
          rst = doc.DoctorField();
        try {
            do{
                ConsultToCombo.addItem(rst.getString("DField"));
            } while(rst.next());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SetConsultToCombo Error");

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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        SignOutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DIDTxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DMobile = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PName = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ChkInBox = new javax.swing.JCheckBox();
        PlaceAppointmentButton = new javax.swing.JButton();
        AppTimeTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        DField = new javax.swing.JLabel();
        PIDComboBox = new javax.swing.JComboBox<>();
        DoctorNameCombo = new javax.swing.JComboBox<>();
        ConsultToCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        DFee = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        OtherTxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        DiscountTxt = new javax.swing.JTextField();
        AppDateTxt = new com.toedter.calendar.JDateChooser();
        Date = new javax.swing.JButton();
        DateTxt = new javax.swing.JLabel();
        Txt = new javax.swing.JLabel();
        UserIDTxt = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel3.setLayout(null);

        SignOutButton.setText("Sign Out");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SignOutButton);
        SignOutButton.setBounds(0, 50, 156, 39);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 90, 160, 440);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 160, 60, 30);

        DIDTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DIDTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(DIDTxt);
        DIDTxt.setBounds(120, 160, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DName");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 210, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("D Mobile");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 260, 60, 30);

        DMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DMobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(DMobile);
        DMobile.setBounds(120, 260, 140, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("P ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 30, 60, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("P Name");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 60, 60, 30);

        PName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(PName);
        PName.setBounds(120, 60, 140, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Consult To");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 110, 80, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("App Date");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(370, 20, 60, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("App Time");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(370, 60, 60, 30);

        ChkInBox.setBackground(new java.awt.Color(102, 255, 255));
        ChkInBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChkInBox.setText("Check In");
        ChkInBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkInBoxActionPerformed(evt);
            }
        });
        jPanel2.add(ChkInBox);
        ChkInBox.setBounds(370, 240, 100, 25);

        PlaceAppointmentButton.setText("Place Appointment");
        PlaceAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceAppointmentButtonActionPerformed(evt);
            }
        });
        jPanel2.add(PlaceAppointmentButton);
        PlaceAppointmentButton.setBounds(410, 310, 210, 40);

        AppTimeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppTimeTxtActionPerformed(evt);
            }
        });
        jPanel2.add(AppTimeTxt);
        AppTimeTxt.setBounds(480, 60, 160, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("D Field");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 310, 60, 30);

        DField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(DField);
        DField.setBounds(120, 310, 140, 30);

        PIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        PIDComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIDComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(PIDComboBox);
        PIDComboBox.setBounds(120, 20, 140, 30);

        DoctorNameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Doctor" }));
        DoctorNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorNameComboActionPerformed(evt);
            }
        });
        jPanel2.add(DoctorNameCombo);
        DoctorNameCombo.setBounds(120, 210, 140, 30);

        ConsultToCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Doctor Field" }));
        ConsultToCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultToComboActionPerformed(evt);
            }
        });
        jPanel2.add(ConsultToCombo);
        ConsultToCombo.setBounds(120, 110, 140, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("D Fee");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 360, 60, 30);

        DFee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DFeeKeyTyped(evt);
            }
        });
        jPanel2.add(DFee);
        DFee.setBounds(120, 360, 140, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Others");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(370, 110, 80, 30);

        OtherTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OtherTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                OtherTxtKeyTyped(evt);
            }
        });
        jPanel2.add(OtherTxt);
        OtherTxt.setBounds(480, 110, 160, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Discount");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(370, 170, 80, 30);

        DiscountTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DiscountTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiscountTxtKeyTyped(evt);
            }
        });
        jPanel2.add(DiscountTxt);
        DiscountTxt.setBounds(480, 170, 160, 30);

        AppDateTxt.setDateFormatString("yyyy-MM-dd");
        AppDateTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppDateTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AppDateTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AppDateTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AppDateTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AppDateTxtMouseReleased(evt);
            }
        });
        jPanel2.add(AppDateTxt);
        AppDateTxt.setBounds(480, 20, 120, 30);

        Date.setText("Check");
        Date.setEnabled(false);
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        jPanel2.add(Date);
        Date.setBounds(600, 20, 70, 30);

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
        JOptionPane.showMessageDialog(null, "Logged Out");
        login.setVisible(true);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void AppTimeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppTimeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppTimeTxtActionPerformed

    private void PIDComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIDComboBoxActionPerformed
        // TODO add your handling code here:
        ResultSet rst;
        if(!PIDComboBox.getSelectedItem().equals("Select ID")){
        Receptionist rec = new Receptionist();
        int ID = Integer.parseInt(String.valueOf(PIDComboBox.getSelectedItem()));
        try {
            rst = rec.GetPatientName(ID);
            String name = rst.getString("PName");
           PName.setText(name);
        }
          catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PNameCombo Error");
        } 
        }
        else {
                PName.setText("");
        }
    }//GEN-LAST:event_PIDComboBoxActionPerformed
   
    private void ChkInBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkInBoxActionPerformed
        // TODO add your handling code here:    
        
    
     
        if(ChkInBox.isSelected()){
            PlaceAppointmentButton.setEnabled(true);
        if(((JTextField) AppDateTxt.getDateEditor().getUiComponent()).getText().equals("")  || AppTimeTxt.getText().equals("") || PName.getText().equals("")|| DIDTxt.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Make Sure all Fields are Filled");
             ChkInBox.setSelected(false);
             PlaceAppointmentButton.setEnabled(false);
            // ChkBill.setSelected(false);
            }
        else{
          Receptionist rec = new Receptionist();
        int did = Integer.parseInt(DIDTxt.getText());
        //String appdate = AppDateTxt.getDate;
       String appdate = AppDateTxt.getDate().toString();
         String apptime = AppTimeTxt.getText();
        rec.CheckCollision(did, appdate, apptime);
        int ID = Integer.parseInt(String.valueOf(PIDComboBox.getSelectedItem()));
        String status = ChkInBox.getText();
        rec.UpdateCheckInOut(ID,status); 
        
         int pid = Integer.parseInt(String.valueOf(PIDComboBox.getSelectedItem()));
        int d_fee = Integer.parseInt(String.valueOf(DFee.getText()));
        int other = Integer.parseInt(String.valueOf(OtherTxt.getText()));
        int discount = Integer.parseInt(String.valueOf(DiscountTxt.getText()));
        Bill bill = new Bill(pid, d_fee,other, discount);
        bill.GenerateBill(pid); 
//        Appointment app = new Appointment();
//        app.GetBillNumber(pid);
        }
        }
        
    }//GEN-LAST:event_ChkInBoxActionPerformed

    private void SetWardFloorCombo(){
      
    }
    private void ConsultToComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultToComboActionPerformed
       // TODO add your handling code here:
       
            DoctorNameCombo.removeAllItems();
           DIDTxt.setText("");
            DMobile.setText("");
            DField.setText("");
            ResultSet rst;
            
            String consult_to = String.valueOf(ConsultToCombo.getSelectedItem());
            try {
            Doctor doc = new Doctor();
            rst = doc.ConsultToDoctorName(consult_to);
            if(ConsultToCombo.getSelectedItem().equals("Select Doctor Field")){
             rst = null;
            }
            if(rst==null){
             
            }
            else{
               if (!rst.next() ) 
            {
                 JOptionPane.showMessageDialog(null, "No " + consult_to + " available");
            } 
                else {    
                do{
                    
                    DoctorNameCombo.addItem(rst.getString("DName"));
                    } while(rst.next());
                   }
                }     
              } 
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
    }
        
    }//GEN-LAST:event_ConsultToComboActionPerformed

    private void DoctorNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorNameComboActionPerformed
        // TODO add your handling code here:
        
        ResultSet rst;
        Receptionist rec = new Receptionist();
        //DoctorNameCombo.removeItem("Select Doctor");
        if(DoctorNameCombo.getItemCount()<1){
       DoctorNameCombo.addItem("Select Doctor");
        }
        String Dname = String.valueOf(DoctorNameCombo.getSelectedItem());
        if(!Dname.equals("Select Doctor")){
            
           // rst = rec.Doctor_Detail(Dname);
            try {
            rst = rec.Doctor_Detail(Dname);
           if (!rst.next() ) {
                 JOptionPane.showMessageDialog(null, "No Record Found ");
} 
           else{
            DIDTxt.setText(rst.getString("DID"));
            DField.setText(rst.getString("DField"));
            DMobile.setText(rst.getString("DPhone"));
            
           }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error");
        }
        }
        else{
            DIDTxt.setText("");
            DMobile.setText("");
            DField.setText("");
        }
     
    }//GEN-LAST:event_DoctorNameComboActionPerformed

    private void PlaceAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceAppointmentButtonActionPerformed
        // TODO add your handling code here:
        if(DoctorNameCombo.getSelectedItem().equals("Select Doctor Field") || PIDComboBox.getSelectedItem().equals("Select ID") || ConsultToCombo.getSelectedItem().equals("Select Disease")){
            JOptionPane.showMessageDialog(null, "No Record to Set Appointment For");
        }
        else{
        String pid = String.valueOf(PIDComboBox.getSelectedItem());
        String pname = String.valueOf(PName.getText());
        String pdisease = String.valueOf(ConsultToCombo.getSelectedItem());
         String did = String.valueOf(DIDTxt.getText());
         String dname = String.valueOf(DoctorNameCombo.getSelectedItem());
         String dmobile = String.valueOf(DMobile.getText());
         String dfield = String.valueOf(DField.getText());
         String appDate = ((JTextField) AppDateTxt.getDateEditor().getUiComponent()).getText();
         String appTime = String.valueOf(AppTimeTxt.getText());
        
        Appointment app = new Appointment(pid, pname, pdisease, did, dname, dmobile, dfield, appDate, appTime);
        app.Add_Appointment(pid);
        app.GetBillNumber(pid);
        
       
        
        ChkInBox.setSelected(false);
        PName.setText("");
        DIDTxt.setText("");
        DMobile.setText("");
        DField.setText("");
        DFee.setText("");
        OtherTxt.setText("");
        DiscountTxt.setText("");
        ((JTextField) AppDateTxt.getDateEditor().getUiComponent()).setText("");
        AppTimeTxt.setText("");
        PIDComboBox.setSelectedItem("Select ID");
        ConsultToCombo.setSelectedItem("Select Doctor Field");
        DoctorNameCombo.setSelectedItem("Select Doctor");
    }
        
    }//GEN-LAST:event_PlaceAppointmentButtonActionPerformed

    private void DFeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DFeeKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (!( Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || (c== KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_DFeeKeyTyped

    private void OtherTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OtherTxtKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (!( Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || (c== KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_OtherTxtKeyTyped

    private void DiscountTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiscountTxtKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (!( Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || (c== KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_DiscountTxtKeyTyped

    private void AppDateTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppDateTxtMousePressed
        // TODO add your handling code here:
          String date = ((JTextField) AppDateTxt.getDateEditor().getUiComponent()).getText();
       JOptionPane.showMessageDialog(null, date);
    }//GEN-LAST:event_AppDateTxtMousePressed

    private void AppDateTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppDateTxtMouseEntered
        // TODO add your handling code here:
          String date = ((JTextField) AppDateTxt.getDateEditor().getUiComponent()).getText();
       JOptionPane.showMessageDialog(null, date);
    }//GEN-LAST:event_AppDateTxtMouseEntered

    private void AppDateTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppDateTxtMouseReleased
        // TODO add your handling code here:
          String date = ((JTextField) AppDateTxt.getDateEditor().getUiComponent()).getText();
       JOptionPane.showMessageDialog(null, date);
    }//GEN-LAST:event_AppDateTxtMouseReleased

    private void AppDateTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppDateTxtMouseClicked
        // TODO add your handling code here:
          String date = ((JTextField) AppDateTxt.getDateEditor().getUiComponent()).getText();
       JOptionPane.showMessageDialog(null, date);
    }//GEN-LAST:event_AppDateTxtMouseClicked

    private void AppDateTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppDateTxtMouseExited
        // TODO add your handling code here:
          String date = ((JTextField) AppDateTxt.getDateEditor().getUiComponent()).getText();
       JOptionPane.showMessageDialog(null, date);
    }//GEN-LAST:event_AppDateTxtMouseExited

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date todaysDate = sdf.parse(sdf.format(new Date()));
            java.util.Date d = AppDateTxt.getDate();
            Date todayDate = sdf.parse(sdf.format(d));
            if(todayDate.compareTo(todaysDate) < 0 ){
                JOptionPane.showMessageDialog(null, "Invalid Date");
            }
        else{
            JOptionPane.showMessageDialog(null, AppDateTxt.getDate().toString());
        }
            
        } catch (ParseException ex) {
            Logger.getLogger(ReceptionistPlaceAppointmentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_DateActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptionistPlaceAppointmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPlaceAppointmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPlaceAppointmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPlaceAppointmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistPlaceAppointmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AppDateTxt;
    private javax.swing.JTextField AppTimeTxt;
    private javax.swing.JCheckBox ChkInBox;
    private javax.swing.JComboBox<String> ConsultToCombo;
    private javax.swing.JTextField DFee;
    private javax.swing.JLabel DField;
    private javax.swing.JLabel DIDTxt;
    private javax.swing.JLabel DMobile;
    private javax.swing.JButton Date;
    private javax.swing.JLabel DateTxt;
    private javax.swing.JTextField DiscountTxt;
    private javax.swing.JComboBox<String> DoctorNameCombo;
    private javax.swing.JTextField OtherTxt;
    private javax.swing.JComboBox<String> PIDComboBox;
    private javax.swing.JLabel PName;
    private javax.swing.JButton PlaceAppointmentButton;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JLabel Txt;
    private javax.swing.JLabel UserIDTxt;
    private javax.swing.JLabel UserNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
