
import java.sql.PreparedStatement;
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
public class Medicine extends Doctor {
    DbConnection conn = new DbConnection();
    PreparedStatement pst;
    ResultSet rst;
    
    
    private String MName;
    private String MDiseaseType;
    private int MPrice;

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getMDiseaseType() {
        return MDiseaseType;
    }

    public void setMDiseaseType(String MDiseaseType) {
        this.MDiseaseType = MDiseaseType;
    }

    public int getMPrice() {
        return MPrice;
    }

    public void setMPrice(int MPrice) {
        this.MPrice = MPrice;
    }
    public Medicine(){
        super.getDName();
        super.getDField();
    }
    
 public ResultSet ADDMe(String MName,String MDiseaseType,int MPrice,int q){
        
        try{
            conn.OpenConnection();
            String sql = "insert into MedicineT (MName,DiseaseType,MPrice,Quantity ) values  '"
      
                    + MName+ "','"
                    + MDiseaseType+ "','"
                    + MPrice+ "','"
                    + q + "'";
            int flag=conn.InsertUpdateDelete(sql);
                 
           if(flag==1){
               JOptionPane.showMessageDialog(null, " You Are Now inserted medicine successful ");
           }
           else{
               JOptionPane.showMessageDialog(null, " Insertion Failed ");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                return rst;
    }
 public ResultSet delete(int id){
        
        try{
            conn.OpenConnection();
            String sql = "delete from MedicineT where MedicineID = '" + id + "'";
            int flag=conn.InsertUpdateDelete(sql);
                 
           if(flag==1){
               JOptionPane.showMessageDialog(null, "delete medicine successful ");
           }
           else{
               JOptionPane.showMessageDialog(null, " deletion Failed ");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                return rst;}
    public ResultSet select_Medicine_Name(String Type){
        
        try{
            conn.OpenConnection();
            String sql = "Select MName from MedicineT where DiseaseType = '" + Type + "'";
            rst=conn.GetData(sql);
            
                return rst;
            
            
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select Allergy Medicine Failed");
        }
        //conn.CloseConnection();
         return rst;
    }
    
    public ResultSet select_Disease_Type(){
        
        try{
            conn.OpenConnection();
            String sql = "SELECT DISTINCT DiseaseType FROM MedicineT ";
            rst=conn.GetData(sql);
            return rst;
           
        }
       catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select Disease Type Failed");
        }
        conn.CloseConnection();
         return null;
    }
    
    
    public ResultSet M_Quantity(String MName){
        try{
            conn.OpenConnection();
            String sql = "Select Quantity From MedicineT where MName = '" + MName + "'";
            rst = conn.GetData(sql);
            return rst;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "MQuantity Error");
        }
        conn.CloseConnection();
        return null;
    }
    
    public void Update_M_Quantity1(int MedicineID, int Quantity){
        int flag; 
        try{
            conn.OpenConnection();
            String sql = "Update MedicineT set Quantity = '"+Quantity+"' where MedicineID = '" + MedicineID + "'";
           flag =  conn.InsertUpdateDelete(sql);
          if(flag==1){
            
              JOptionPane.showMessageDialog(null, Quantity + MedicineID + "In Stock");
          }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "MQuantity Update Error");
        }
        conn.CloseConnection();
        
    }
     public void Update_M_Quantity(String MName, int Quantity){
        int flag; 
        try{
            conn.OpenConnection();
            String sql = "Update MedicineT set Quantity = '"+Quantity+"' where MedicineID = '" + MName + "'";
           flag =  conn.InsertUpdateDelete(sql);
          if(flag==1){
            
              JOptionPane.showMessageDialog(null, Quantity + MName + "In Stock");
          }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "MQuantity Update Error");
        }
        conn.CloseConnection();
        
    }
    public ResultSet M_Price(String MName){
        try{
            conn.OpenConnection();
            String sql = "Select MPrice From MedicineT where MName = '" + MName + "'";
            rst = conn.GetData(sql);
            return rst;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Medicine Price Error");
        }
        conn.CloseConnection();
        return null;
    }
     public ResultSet addmin(JTable M){
        
        try{
            conn.OpenConnection();
            String sql = "Select * from MedicineT ";
            rst=conn.GetData(sql); 
            M.setModel(DbUtils.resultSetToTableModel(rst));
                return rst;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select Allergy Medicine Failed");
        }
        //conn.CloseConnection();
         return rst;
    
}}
