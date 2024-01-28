package database;
import java.sql.*;
public class DatabaseInfo {
    private final String url="jdbc:mysql://localhost:3306/bankmgt";
    private final String user="root";
    private final String password="";


    public Connection connect() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            return null;
        }
    }

    public void disconnect(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

   
    
}
