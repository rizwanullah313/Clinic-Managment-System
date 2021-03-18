
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rizwan
 */
public class Receptionist extends abstract1{
    DbConnection conn=new DbConnection();
     ResultSet rst;
    private String RName;
    private String RPassword;
    private int RAge;
    private String RPhone;
    private String RGender;
    private String RAddress;

    public Receptionist(){
        
    }
    public String getRName() {
        return RName;
    }

    public void setRName(String RName) {
        this.RName = RName;
    }

    public String getRPassword() {
        return RPassword;
    }

    public void setRPassword(String RPassword) {
        this.RPassword = RPassword;
    }

    public int getRAge() {
        return RAge;
    }

    public void setRAge(int RAge) {
        this.RAge = RAge;
    }

    public String getRPhone() {
        return RPhone;
    }

    public void setRPhone(String RPhone) {
        this.RPhone = RPhone;
    }

    public String getRGender() {
        return RGender;
    }

    public void setRGender(String RGender) {
        this.RGender = RGender;
    }

    public String getRAddress() {
        return RAddress;
    }

    public void setRAddress(String RAddress) {
        this.RAddress = RAddress;
    }

    public Receptionist(String RName, String RPassword, int RAge, String RPhone, String RGender, String RAddress) {
        this.RName = RName;
        this.RPassword = RPassword;
        this.RAge = RAge;
        this.RPhone = RPhone;
        this.RGender = RGender;
        this.RAddress = RAddress;
    }
    
    
      public void AddReceptionist(){
        try{
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            
            String sql = "Insert into ReceptionistT (RPassword, RName, RGender,RAge,RPhone, RAddress) values '"
      
                    + getRPassword()+ "','"
                    + getRName()+ "','"
                    + getRGender()+ "','"
                    + getRAge()+ "','"
                    + getRPhone()+ "','"
                    + getRAddress()+ "'";
                    
                    int flag=conn.InsertUpdateDelete(sql);
                 
           if(flag==1){
               JOptionPane.showMessageDialog(null, "You Are Now Registered As Receptionist");
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
      public ResultSet New_Recep_Id(String RName){
          DbConnection conn = new DbConnection();
          ResultSet rst;
          try{
          conn.OpenConnection();
          String sql = "Select RID From ReceptionistT where RName = '" + RName + "'";
          rst = conn.GetData(sql);
          if(rst.next()){
            JOptionPane.showMessageDialog(null, "Your ID is " + rst.getString("RID"));
          }
          
          }
          catch(Exception e){
              
          }
          conn.CloseConnection();
          return null;
      }
      
      public void updateReceptionist(int id){
            DbConnection conn = new DbConnection();
        int flag;
        try{
         conn.OpenConnection();
            String upd_sql = "Update ReceptionistT set RName ='"
                    + getRName() + 
                      "', RMobile ='"
                    + getRPhone() + "', RAddress='"
                    + getRAddress() + "' where ID= '" + id + "'";
             flag = conn.InsertUpdateDelete(upd_sql);
             if(flag==1){
                 JOptionPane.showMessageDialog(null, "Update Successful for Receptionist ID " + id);
             }
             else{
                 JOptionPane.showMessageDialog(null, "Update Failed for Receptionist ID " + id);
             }
                              
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "update Receptionist Query Failed");
        }
       conn.CloseConnection();
       
    }
     public void deleteReceptionist(int id){
          DbConnection conn = new DbConnection();
        try{
          int flag;
           conn.OpenConnection();
            String del_sql = "Delete from ReceptionistT where id = '" + id + "'";
            flag = conn.InsertUpdateDelete(del_sql);
            if(flag==1){
                JOptionPane.showMessageDialog(null, "Record Deleted of Receptionist ID " + id);
            }
            else{
                JOptionPane.showMessageDialog(null, "Deletion Failed for Receptionist ID " + id);
            }
          
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Delete Receptionist Query Failed");
        }
        conn.CloseConnection();
    }
     
     public ResultSet GetPatientID(){
         DbConnection conn =  new DbConnection();
         
         try{
         conn.OpenConnection();
         String sql = "Select PID from PatientT where CheckInOut = ''";
         rst = conn.GetData(sql);
         return rst;
       
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Receptionist GetPatientID Error");
         }
         conn.CloseConnection();
         return null;
     }
  
      public ResultSet GetPatientName(int ID){
         DbConnection conn =  new DbConnection();
         try{
         conn.OpenConnection();
        String sql = "Select PName from PatientT where PID ='"+ID+"'" ;
        rst = conn.GetData(sql);
        if(rst.next()){
            return rst;
        }
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Receptionist GetPatientName Error");
         }
         conn.CloseConnection();
         return null;
     }
          public ResultSet GetCheckInPatientID(){
         DbConnection conn =  new DbConnection();
         try{
         conn.OpenConnection();
         String sql = "Select PID from PatientT where CheckInOut = 'Check In'";
         rst = conn.GetData(sql);
         return rst;
       
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Receptionist GetCheckInPatientID Error");
         }
         conn.CloseConnection();
         return null;
     }

     
      public int UpdateCheckInOut(int id, String status){
          DbConnection conn =  new DbConnection();
         int flag ;
         try{
         conn.OpenConnection();
        String sql = "Update PatientT SET CheckInOut = '" + status + "'where PID = '"+ id +"'";
         flag = conn.InsertUpdateDelete(sql);
        if(flag ==1){
            JOptionPane.showMessageDialog(null,  status +" For " + id);
            return flag;
        }
        
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Status Entry Failed");
         }
         conn.CloseConnection();
         return 0;
      }
      public ResultSet disease(){
              DbConnection conn =  new DbConnection();
         
         try{
         conn.OpenConnection();
         String sql = "Select PID from PatientT where CheckInOut IS NULL";
         rst = conn.GetData(sql);
         while(rst.next()){
             return rst;
         }
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Receptionist GetPatientID Error");
         }
         conn.CloseConnection();
         return null;
      }
      
      public ResultSet Select_Doctor(String disease){
          DbConnection conn = new DbConnection();
         
          try{
              conn.OpenConnection();
              String sql = "Select DName from DoctorT where Disease = '" + disease + "'";
              rst = conn.GetData(sql);
             return rst;

  }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Fetching Doctor Name Error");
          }
          conn.CloseConnection();
          return null;
      }
      
      public ResultSet Doctor_Detail(String DName){
            DbConnection conn = new DbConnection();
          
          try{
              conn.OpenConnection();
              String sql = "Select DID,DField,DPhone From DoctorT Where DName = '" + DName + "'";
              rst = conn.GetData(sql);
              return rst;
             
            }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Fetching Ward Number Error");
          }
          conn.CloseConnection();
          
          return null;
      }
     public void CheckCollision(int DID, String AppDate, String AppTime){
         DbConnection conn  = new DbConnection();
         ResultSet rst;
         int flag;
         try{
             conn.OpenConnection();
             String sql = "Select COUNT (*) FROM AppointmentT where DID = " + DID + " AND AppDate = ' " + AppDate + "' AND AppTime = ' " + AppTime + "'";
             rst = conn.GetData(sql);
             flag = rst.getRow();
             if(flag>0){
                 JOptionPane.showMessageDialog(null, "Doctor is Not Avilabale at this Time");
                 
             }
             else if(flag == 0){
              JOptionPane.showMessageDialog(null, "Doctor Available .");
             }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "CheckCollision Query Failed");
         }
         conn.CloseConnection();
     }
         public boolean chkpass(int id, String pass){
        boolean flag = false;
        
        try{
            conn.OpenConnection();
            String sql = "Select RID,RPassword from ReceptionistT where RID = '" + id + "' and RPassword = '" + pass + "'";
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
            String sql = "Select  RName FROM ReceptionistT where RID = '" + ID + "'";
           rst = conn.GetData(sql);
           if(rst.next()){
               return rst;
           }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "GETPName Error");
        }
        conn.CloseConnection();
        return null;
    }
    

}   

