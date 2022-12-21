package per9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class koneksi {
    Connection con;
    Statement stn;
    public void config(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
            stn= con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal"+e.getMessage());
        }
    }
}
