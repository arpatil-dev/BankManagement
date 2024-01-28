package bankmgt;

import database.DatabaseInfo;
import java.sql.*;

public class Auth {

    public int auth(String userName, String passWord, int tableId) {
        try {
            DatabaseInfo mgt = new DatabaseInfo();
            String query = null;
            switch (tableId) {
                case 3 ->
                    query = "SELECT * FROM customer_table WHERE username = '" + userName + "' && password = '" + passWord + "'";
                case 2 ->
                    query = "SELECT * FROM employee_info WHERE username = '" + userName + "' && password = '" + passWord + "'";
                case 1 ->
                    query = "SELECT * FROM admin_info WHERE username = '" + userName + "' && password = '" + passWord + "'";
            }

            Connection connection = mgt.connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String user = resultSet.getString("username");
                String pass = resultSet.getString("password");
                if (userName.equals(user) && passWord.equals(pass)) {
                    mgt.disconnect(connection);
                    
                    return 1;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
