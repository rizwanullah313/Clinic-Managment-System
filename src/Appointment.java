import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizwan
 */
public class Appointment  {
    
    private String PID;
    private String PName;
    private String PDisease;
    private String DID;
    private String Dname;
    private String DMobile;
    private String DField;
    private String AppDate;
    private String AppTime;
    ResultSet rst;
    public Appointment(){
        
    }

    public String getPID() {
        return PID;
    }

    public String getPName() {
        return PName;
    }

    public String getPDisease() {
        return PDisease;
    }

    public String getDID() {
        return DID;
    }

    public String getDname() {
        return Dname;
    }

    public String getDMobile() {
        return DMobile;
    }

    public String getDField() {
        return DField;
    }

    public String getAppDate() {
        return AppDate;
    }

    public String getAppTime() {
        return AppTime;
    }

    public Appointment(String PID, String PName, String PDisease, String DID, String Dname, String DMobile, String DField, String AppDate, String AppTime) {
        this.PID = PID;
        this.PName = PName;
        this.PDisease = PDisease;
        this.DID = DID;
        this.Dname = Dname;
        this.DMobile = DMobile;
        this.DField = DField;
        this.AppDate = AppDate;
        this.AppTime = AppTime;
       
    }
   
    public ResultSet Add_Appointment(String PID){
        DbConnection conn = new DbConnection();
        ResultSet rst;
        int flag;
        try{
            String sql = "Insert into AppointmentT (PID,PName,PDisease,DID,DName,DMobile,DField,AppDate,AppTime) values '"
                    + getPID()+ "','"
                    + getPName()+ "','"
                    + getPDisease()+ "','"
                    + getDID()+ "','"
                    + getDname()+ "','"
                    + getDMobile()+ "','"
                    + getDField()+ "','"
                    + getAppDate()+ "','"
                    + getAppTime()+ "''";
                flag = conn.InsertUpdateDelete(sql);
                if(flag == 1){
                    JOptionPane.showMessageDialog(null, "Appointment Fixed For Patient ID " + PID);
         
                }
                else{
                    JOptionPane.showMessageDialog(null, "Appointment Failed For ID " + PID);
                }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "AddAppointment Query Error");
        }
        conn.CloseConnection();
        return null;
    }
     
    public void GetBillNumber(String PID){
        DbConnection conn = new DbConnection();
       ResultSet rst;
        try{
             conn.OpenConnection();
               String sqlBill = "Select MAX(BillNumber) AS BillNumber FROM BillT where PID = '" + PID + "'"  ;
                   rst =  conn.GetData(sqlBill);
                  if(rst.next()){
                   rst.getString("BillNumber");
                JOptionPane.showMessageDialog(null,  "Your Bill Number is " + rst.getString("BillNumber"));
                   } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "GetBillNumber Query Failed");
        }
    }
     public ResultSet APPTableData(JTable S){
       DbConnection conn = new DbConnection();
        try{
             conn.OpenConnection();
            String select_sql = "Select PNAME,DID,AppDate,AppTime from AppointmentT";
           rst = conn.GetData(select_sql);
           S.setModel(DbUtils.resultSetToTableModel(rst));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, " Query Failed");
        }
         conn.CloseConnection();
        return rst;
    }
}
