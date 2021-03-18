
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class admin {
    
    DbConnection conn = new DbConnection();
    PreparedStatement pst = null;
    ResultSet rst = null;
    private int UserID;
    private String UserName;

    public int getUserID() {
        return UserID;
    }

    public String getUserName() {
        return UserName;
    }
    public admin(){
        
    }
    public admin(int UserID){
        this.UserID = UserID;
    }
    
    public boolean chkAdminPass(int id, String pass){
        boolean flag = false;
        
        try{
            conn.OpenConnection();
            String sql = "Select AID,APassword from AdminT where AID = '" + id + "' and APassword = '" + pass + "'";
            rst= conn.GetData(sql);
            if(rst.next()){
                flag= true;
                              
            }
            else 
                flag=  false;
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please provide valid input ");
        }
       return flag; 
    }
    
          public ResultSet GetAName(int ID){
        ResultSet rst;
        try{
            conn.OpenConnection();
            String sql = "Select  AName FROM AdminT where AID = '" + ID + "'";
           rst = conn.GetData(sql);
           if(rst.next()){
               return rst;
           }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "GETAName Error");
        }
        conn.CloseConnection();
        return null;
    }
    
   
}
