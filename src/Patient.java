
import java.sql.PreparedStatement;
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
public class Patient {
    DbConnection conn = new DbConnection();
    Date date = new Date();
    private int PID;
    private String Date = date.toString();
    private String PName ;
    private String PGender ;
    private int PAge ;
    private String Pmobile ;
    private String PAddress ;
    //private String PDisease ;
    private String PBillStatus ;
    private String checkin;

public Patient(){
    
}
    public int getPID() {
        return PID;
    }

    public String getPName() {
        return PName;
    }


    public String getPGender() {
        return PGender;
    }

    public int getPAge() {
        return PAge;
    }

    public String getPmobile() {
        return Pmobile;
    }

    public String getPAddress() {
        return PAddress;
    }

    public String getCheckin() {
        return checkin;
    }

 
  //constructor for addPatient  
 public Patient( String PName,String PGender, int PAge, String Pmobile, String PAddress,String checkin){
    
     this.PName = PName;
     this.PGender = PGender;
     this.PAge = PAge;
     this.Pmobile = Pmobile;
     this.PAddress = PAddress;
     this.checkin = checkin;
     
 }
    
 public ResultSet getP_ID(String P_Name)   {
     DbConnection conn = new DbConnection();
     String sql = "Select PID Form PatientT where PName = '" + P_Name +"'";
     rst = conn.GetData(sql);
        try {
            if(rst.next()){
                return rst;
            }  
        } catch (SQLException ex) {
            
        }
        conn.CloseConnection();
        return null;
 }
 
 public void addPatient(){
        try{
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            
            String sql = "Insert into PatientT (PName,DateAndTime, PGender, PAge,PMobile, PAddress,CheckInOut) values '"
      
                    + getPName()+ "','"
                     + Date+ "','"
                    + getPGender()+ "','"
                    + getPAge()+ "','"
                    + getPmobile()+ "','"
                    + getPAddress()+ "','"
                    + getCheckin()+"'";
                    
                    int flag=conn.InsertUpdateDelete(sql);
                 
           if(flag==1){
               JOptionPane.showMessageDialog(null, "You Are Now Registered As Patient");
           }
           else{
               JOptionPane.showMessageDialog(null, "Insertion Failed");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
    }
       public ResultSet New_Patient_Id(String PName){
          DbConnection conn = new DbConnection();
          ResultSet rst;
          try{
          conn.OpenConnection();
          String sql = "Select PID From PatientT where PName = '" + PName + "'";
          rst = conn.GetData(sql);
          if(rst.next()){
            JOptionPane.showMessageDialog(null, "Your ID is " + rst.getString("PID"));
          }
          
          }
          catch(Exception e){
              
          }
          conn.CloseConnection();
          return null;
      }
//Constructor for updatePatient
    public Patient(String PName, int PAge, String Pmobile, String PAddress) {
        this.PName = PName;
        this.PAge = PAge;
        this.Pmobile = Pmobile;
        this.PAddress = PAddress;
    }
    
   
    
    public void updatePatient(int id){
        int flag;
        try{
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String upd_sql = "Update PatientT set PName ='"
                    + getPName() + "', PGender ='"
                    + getPmobile()+ "', PAge= '"
                    + getPAge() + "', PMobile ='"
                     + getPAge()  + "', PAddress='"
                    + getPAddress() + "' where PID= '" + id + "'";
             flag = conn.InsertUpdateDelete(upd_sql);
             if(flag==1){
                 JOptionPane.showMessageDialog(null, "Update Successful for Patient ID " + id);
             }
             else{
                 JOptionPane.showMessageDialog(null, "Update Failed for Patient ID " + id);
             }
             conn.CloseConnection();
                   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "update Patient Query Failed");
        }
       
    }
    
    public void deletePatient(int id){
        try{
          int flag;
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String del_sql = "Delete from PatientT where PID = '" + id + "'";
            flag = conn.InsertUpdateDelete(del_sql);
            if(flag==1){
                JOptionPane.showMessageDialog(null, "Record Deleted of ID " + id);
            }
            else{
                JOptionPane.showMessageDialog(null, "Deletion Failed for ID " + id);
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Delete Patient Query Failed");
        }
    }
    PreparedStatement pst = null;
     ResultSet rst = null;
    
    public ResultSet GetPatientTableData(int PID){
        DbConnection conn = new DbConnection();
        try{
            conn.OpenConnection();
            String select_sql = "Select * from BillT where PID = '" + PID + "'";
            rst=conn.GetData(select_sql);
            do{
                return rst;
            } while(rst.next());
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "GetPatientTableData Query Failed");
        }
        conn.CloseConnection();
        return null;
    }
  public ResultSet GetPatientCheckoutTableData(){
       DbConnection conn = new DbConnection();
        try{
             conn.OpenConnection();
            String select_sql = "Select * from BillT";
            rst=conn.GetData(select_sql);
           do{
               return rst;
           } while(rst.next());
            
       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "GetPatientCheckOutTableData Query Failed");
        }
         conn.CloseConnection();
        return null;
    }
    public void p_Info(int id){
        try{
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select PID,PName, PAge,PMobile,PAddress,DateAndTime from PatientT where PID = '" +id + "'" ;
            rst=conn.GetData(sql);
            if(rst.next()){
                
            }
            
            conn.CloseConnection();
            
        }catch(Exception e){
            
        }
    }
    public void ReCheckIn(int PID){
        DbConnection conn = new DbConnection();
        int flag;
        try{
            conn.OpenConnection();
            String sql = "Update PatientT SET CheckInOut = '' where PID = " +PID  ;
            flag = conn.InsertUpdateDelete(sql);
            if(flag == 1){
                JOptionPane.showMessageDialog(null, "Success! \n Go To Receptionist For Fixing An Appointment");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "ReCheckIn Query Failed");
        }
        conn.CloseConnection();
    }
  
        public ResultSet getname(int ID){
        ResultSet rst;
        try{
            conn.OpenConnection();
            String sql = "Select  PName FROM PatientT where PID = '" + ID + "'";
           rst = conn.GetData(sql);
           if(rst.next()){
               return rst;
           }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "GETPName Error");
        }
        conn.CloseConnection();
        return null;    }
}       
       

