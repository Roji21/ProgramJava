package per8Tugas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class cone {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String Url = "jdbc:mysql://localhost/prakalgo8";
            String Username = "root";
            String Password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(Url,Username,Password);
        } catch (Exception e) {
            System.out.println("Koneksi Gagal"+e.getMessage());
        }
        return mysqlconfig;
    }
    public static void main(String[] args) {
//        configDBc;
    }
}
