/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nguyen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class Nguyen {

    /**
     * @param args the command line arguments
     */
    public static Connection JDBCConnection() {
        final String Url = "jdbc:sqlserver://LAPTOP-92FGE7G6\\SQLEXPRESS:1433;databaseName=Test";
        final String user = "sa";
        final String pass = "1234";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(Url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }
    
   
  }
    

