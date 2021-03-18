import java.sql.ResultSet;
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
public class Bill  {
     Date date = new Date();
    private int PID;
    private String SuggestedMedicines;
    private String DateAndTime = date.toString();
    private int MedicinePrice;
    private int DoctorFee;
    private int Other;
    private int Discount;
    private int Total;
    private int Payment;
    private int Balance;

    DbConnection conn = new DbConnection();
   
    public Bill(){
        
    }
    public int getPID() {
        return PID;
    }
    public String getSuggestedMedicines() {
        return SuggestedMedicines;
    }
    public String getDateAndTime() {
        return DateAndTime;
    }

    public int getMedicinePrice() {
        return MedicinePrice;
    }

    public int getDoctorFee() {
        return DoctorFee;
    }

    public int getOther() {
        return Other;
    }

    public int getDiscount() {
        return Discount;
    }

    public int getTotal() {
        return Total;
    }

    public int getPayment() {
        return Payment;
    }

    

    public int getBalance() {
        return Balance;
    }

    public Bill(int PID, int DoctorFee, int Other, int Discount) {
        this.PID = PID;
        this.DoctorFee = DoctorFee;
        this.Other = Other;
        this.Discount = Discount;
    }

    public Bill(int PID, String SuggestedMedicines,  String DateAndTime,int MedicinePrice, int DoctorFee, int Other, int Discount, int Total, int Payment, int Balance) {
        this.PID = PID;
        this.SuggestedMedicines = SuggestedMedicines;
        this.DateAndTime = DateAndTime;
        this.MedicinePrice = MedicinePrice;
        this.DoctorFee = DoctorFee;
        this.Other = Other;
        this.Discount = Discount;
        this.Total = Total;
        this.Payment = Payment;
        this.Balance = Balance;
    }
    
    public void GenerateBill(int PID){
      
        int flag;
        try{
            conn.OpenConnection();
        String sql = "Insert into BillT (PID, DateAndTime,DoctorFee,Other,Discount,Status) values '"
      
      + getPID()+ "','"
      + DateAndTime + "','"
     + getDoctorFee()+ "','"
      + getOther()+ "','"
      + getDiscount()+ "','"
         +  "Not Paid '";
    
          flag = conn.InsertUpdateDelete(sql);
          if(flag == 1){
              JOptionPane.showMessageDialog(null, "Bill Has Been generated For Patient ID " + PID);

          }
          else{
              JOptionPane.showMessageDialog(null, "Bill Has NOT been generated For Patient ID " + PID);
          }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "GenerateBill Query Failed");
        }
      
    }
    // FOR DOCTOR USE
    public Bill(String SuggestedMedicines, int MedicinePrice) {
        this.SuggestedMedicines = SuggestedMedicines;
        this.MedicinePrice = MedicinePrice;
    }

    public void UpdateBill(String BillNumber){
        DbConnection conn = new DbConnection();
        int flag;
        try{
           conn.OpenConnection();
           String sql = "UPDATE BillT SET MedicinePrice = '"
                   + getMedicinePrice() + "', SuggestedMedicines = '"
                   + getSuggestedMedicines() + "' where BillNumber = '" + BillNumber + "'" ;
           flag = conn.InsertUpdateDelete(sql);
           if(flag == 1){
               JOptionPane.showMessageDialog(null, "Bill Generated For BillNumber " + BillNumber);
           }
           else{
                JOptionPane.showMessageDialog(null, "Bill HAS NOT Generated For BillNumber " + BillNumber);
           }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "UpdateBill Query Failed");
        }
    }
          public int UpdateCheckInOutBill(int id, String status){
          DbConnection conn =  new DbConnection();
         int flag ;
         try{
         conn.OpenConnection();
        String sql = "Update BillT SET CheckInOut = '" + status + "'where PID = '"+ id +"'";
         flag = conn.InsertUpdateDelete(sql);
        if(flag ==1){
            JOptionPane.showMessageDialog(null,  "Bill Updated For " + id);
            return flag;
        }
        
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Bill Status Entry Failed");
         }
         conn.CloseConnection();
         return 0;
      }
       
      public ResultSet GetBillNumber( int PID){
          DbConnection conn = new DbConnection();
          ResultSet rst;
          conn.OpenConnection();
          try{
              String sql = "Select MAX(BillNumber) AS BillNumber FROM BillT where PID = '" + PID + "'";
              rst = conn.GetData(sql);
              if(rst.next()){
                  return rst;
              }  
          }catch(Exception e){
            JOptionPane.showMessageDialog(null, "GetBill Number Querey Failed");
          }
          
          conn.CloseConnection();
          return null;
          
      }
      
      public ResultSet SelectBillNumber(){
          DbConnection conn = new DbConnection();
          ResultSet rst;
          try{
              conn.OpenConnection();
              String sql = "Select BillNumber FROM BillT where Status = 'Not Paid'" ;
              rst = conn.GetData(sql);
              return rst;            
              
          } catch(Exception e){
             JOptionPane.showMessageDialog(null, "SelectBillNumber Query Failed");
          }
          conn.CloseConnection();
          return null;
      }

         public ResultSet SelectTotal(int BillNumber){
          DbConnection conn = new DbConnection();
          ResultSet rst;
          try{
              conn.OpenConnection();
              String sql = "Select Total FROM BillT where BillNumber  =" + BillNumber ;
              rst = conn.GetData(sql);
              if(rst.next()){
                  return rst;            
              }
              } catch(Exception e){
             JOptionPane.showMessageDialog(null, "SelectBillNumber Query Failed");
          }
          conn.CloseConnection();
          return null;
      }
    public Bill(int Payment) {
        this.Payment = Payment;
    }
      
      
      
      public void PayBill(int BillNumber){
        DbConnection conn = new DbConnection();
        int flag ;
        try{
            conn.OpenConnection();
            String sql = "UPDATE BillT SET Payment = " + getPayment() + ", Status = 'Paid' where BillNumber = " + BillNumber ;
            flag = conn.InsertUpdateDelete(sql);
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " Bill Paid For BillNumber " + BillNumber + " \n Thank You ");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "PayBill Query Failed");
        }
      }

    }

