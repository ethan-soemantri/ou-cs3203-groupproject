import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionUrl =
        		/*
                "jdbc:sqlserver://yourserver.database.windows.net:1433;"
                        + "database=AdventureWorks;"
                        + "user=yourusername@yourserver;"
                        + "password=yourpassword;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";
	*/
        "jdbc:sqlserver://bankmainproject.database.windows.net:1433;" 
	+"database=Bank_Main;" 
    + "user=clar0126@bankmainproject;"
	+ "password=Hoverboard1456!;" 
    + "encrypt=true;" 
	+ "trustServerCertificate=false;" 
    + "hostNameInCertificate=*.database.windows.net;" 
	+ "loginTimeout=30;";
        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
        	Statement statement = connection.createStatement(); {
        		
        	}
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
