import java.sql.ResultSet;
public abstract class abstract1 {
    
    private int id;
    private String Pwd;

    public int getid() {
        return id;
    }

    public void setUsername(int id) {
        this.id = id;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }
    public abstract boolean chkpass(int id, String pwd);
    public abstract ResultSet getname(int id);
    
}

