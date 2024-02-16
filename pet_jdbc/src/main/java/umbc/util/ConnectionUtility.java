package umbc.util;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtility {

  private static String url = "";
  private static String username = "";
  private static String password = "";

  private static Connection connection = null;

  public static Connection getConnection() {
    if(connection == null) {
      try {
        connection = DriverManager.getConnection(url, username, password);
      } catch (SQLException ex) {
        ex.printStackTrace();
      }
    }
    return connection;
  }
  
}
