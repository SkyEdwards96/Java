import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class sqltest {
   public static void main(String args[]) throws Exception {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost/mydatabase";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
      System.out.println("Connection established......");
      //Creating a Statement object
      Statement stmt = con.createStatement();
      //Retrieving the data
      ResultSet rs = stmt.executeQuery("Show tables");
      System.out.println("Tables in the current database: ");
      while(rs.next()) {
         System.out.print(rs.getString(1));
         System.out.println();
      }
   }
}