package Project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon()
    {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","meetmysql");
           return con;
       }
       catch(Exception e)
       {
           System.out.println(e);
           return null;
       }
    }

    public static Connection getcon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
