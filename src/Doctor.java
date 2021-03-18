import java.sql.PreparedStatement;
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
public class Doctor extends abstract1{
    DbConnection conn=new DbConnection();
    int p_ID,p_Age;
    String p_Name,p_Mobile,p_Gender;
    
   private int DID;
   private String DName;
   private String DPassword;
   private int DAge;
    private String DGender;
   private String DMobile;
   private String DAddress;
   private String DField;
    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }
  
    
   Date date = new Date();
   private String Date = date.toString();

    PreparedStatement pst ;
    ResultSet rst;
   
    public Doctor(){
        
        
    }


    public Doctor( String DName, String DPassword,  String DGender, int DAge, String DMobile, String DAddress, String DField) {
        
        this.DName = DName;
        this.DPassword=DPassword;
        this.DGender = DGender;
        this.DAge = DAge;
        this.DMobile = DMobile;
        this.DAddress = DAddress;
        this.DField = DField;
    }

    public String getP_Mobile() {
        return p_Mobile;
    }

    public String getDName() {
        return DName;
    }

    public String getDPassword() {
        return DPassword;
    }

    public String getDField() {
        return DField;
    }
     public String getDAddress() {
        return DAddress;
    }

    public String getDMobile() {
        return DMobile;
    }

    public String getDGender() {
        return DGender;
    }
 
    
    public void AddDoctor(){
        try{
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            
            String sql = "Insert into DoctorT (DPassword, DName,DateAndTime, DGender,DField,DPhone, DAddress) values '"
      
                    + getDPassword()+ "','"
                    + getDName()+ "','"
                     + Date+ "','"
                    + getDGender()+ "','"
                    + getDField()+ "','"
                    + getDMobile()+ "','"
                    + getDAddress()+ "'";
                    
                    int flag=conn.InsertUpdateDelete(sql);
                 
           if(flag==1){
               JOptionPane.showMessageDialog(null, "You Are Now Registered As " + DField  );
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
          
    public void New_Doctor_Id(String DName){
          DbConnection conn = new DbConnection();
          ResultSet rst;
          try{
          conn.OpenConnection();
          String sql = "Select DID From DoctorT where DName = '" + DName + "'";
          rst = conn.GetData(sql);
          if(rst.next()){
            JOptionPane.showMessageDialog(null, "Your ID is " + rst.getString("DID"));
          }
          
          }
          catch(Exception e){
              
          }
          conn.CloseConnection();
          //return null;
      }
    
    public void updateDoctor(int id){
        int flag;
        try{
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String upd_sql = "Update DoctorT set DName ='"
                    + getDName() + 
                      "', DMobile ='"
                    + getDMobile() + "', DAddress='"
                    + getDAddress() + "' where ID= '" + id + "'";
             flag = conn.InsertUpdateDelete(upd_sql);
             if(flag==1){
                 JOptionPane.showMessageDialog(null, "Update Successful for Doctor ID " + id);
             }
             else{
                 JOptionPane.showMessageDialog(null, "Update Failed for Doctor ID " + id);
             }
             conn.CloseConnection();
                   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "update Doctor Query Failed");
        }
       
    }
     public void deleteDoctor(int id){
        try{
          int flag;
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String del_sql = "Delete from DoctorT where id = '" + id + "'";
            flag = conn.InsertUpdateDelete(del_sql);
            if(flag==1){
                JOptionPane.showMessageDialog(null, "Record Deleted of Doctor ID " + id);
            }
            else{
                JOptionPane.showMessageDialog(null, "Deletion Failed for Doctor ID " + id);
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Delete Doctor Query Failed");
        }
    }
public ResultSet GetDoctorTableData(){
        try{
            
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String select_sql = "Select * from DoctorT";
            rst=conn.GetData(select_sql);
            while(rst.next()){
                return rst;
            }
        conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "GetDoctorTableData Query Failed");
        }
        return rst;
    }
  
public ResultSet DoctorField(){
    DbConnection conn = new DbConnection();
    ResultSet rst;
    conn.OpenConnection();
    try{
        String sql = "Select DISTINCT DField FROM DoctorT" ;
        rst = conn.GetData(sql);
       if(rst.next()){
           return rst;
       }
   
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "CheckInPatient Query Error");
    }
    conn.CloseConnection();
   return null;
}

public ResultSet ConsultToDoctorName(String DField){
    DbConnection conn = new DbConnection();
    ResultSet rst;
    conn.OpenConnection();
    try{
        String sql = "Select DName FROM DoctorT where DField = '" + DField + "'";
        rst = conn.GetData(sql);
       return rst;
  
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Consult To Query Error");
    }
   return null;
}

public ResultSet UpcomingAppointments(String DName){
    DbConnection conn = new DbConnection();
    ResultSet rst;
    conn.OpenConnection();
    try{
        String sql = "Select PName,DName, AppDate, AppTime, FROM AppointmentT where DName = '" + DName + "'";
        rst = conn.GetData(sql);
       return rst;
  
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Consult To Query Error");
    }
   return null;
}
public boolean chkpass(int id, String pass){
        boolean flag = false;
        
        try{
            conn.OpenConnection();
            String sql = "Select DID,DName,DPassword from DoctorT where DID = '" + id + "' and DPassword = '" + pass + "'";
            rst= conn.GetData(sql);
            if(rst.next()){
                flag= true;
                }
            else 
                flag=  false;
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please provide valid input");
        }
       return flag; 
    }
public ResultSet getname(int ID){
        ResultSet rst;
        try{
            conn.OpenConnection();
            String sql = "Select  DName, DField FROM DoctorT where DID = '" + ID + "'";
           rst = conn.GetData(sql);
           if(rst.next()){
               return rst;
           }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "GETDName Error");
        }
        conn.CloseConnection();
        return null;
    }
    


}
