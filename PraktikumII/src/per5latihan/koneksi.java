package per5latihan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class koneksi {
    Connection con;
    Statement stn;
    public void config(){
        try{
//            Class.forName("con.mysql.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost/login";
            String Username = "root";
            String Password = "";
            con = DriverManager.getConnection(dbUrl,Username,Password);
            stn= con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal"+e.getMessage());
        }
    }
}
