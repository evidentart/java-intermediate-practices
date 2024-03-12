package umbc.util;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtility {

  private static String url = "jdbc:postgresql://localhost/postgres";
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

// better and more secure way of establishing this connection
/*
 * public static String url;
 * public static String username;
 * public static String password;
 * 
 * static {
 * 
 *  //read from properties file
 *  InputStream input = ConnectionUtility.class.getResourceAsStream("/config.properties");
 *  Properties properties = new Properties();
 *  try {
 *    properties.load(input);
 *  }catch (IOException e) {
 *    e.printStackTrace();
 *  }  
 * 
 *  // take values from properties file
 *  String urlSystemEnvName = properties.getProperty("CONNECTION_URL");
 *  String usernameSystemEnvName = properties.getProperty("CONNECTION_USERNAME");]
 *  String passwordSystemEnvName = properties.getProperty("CONNECTION_PASSWORD");
 * 
 *  // assign variables with those values
 *  url = System.getenv(urlSystemEnvName);
 *  username = System.getenv(usernameSystemEnvName);
 *  password = System.getenv(passwordSystemEnvName);
 * }
 * 
 * // method that creates and returns a connection
 * public static Connection getConnection() throws SQLException {
 *    return DriverManager.getConnection(url, username, password);
 }
 
*/
