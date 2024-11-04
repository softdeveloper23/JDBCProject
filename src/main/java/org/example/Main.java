package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/sakila";
        String user = "root";
        String password = "!Debbie1985@";

        Connection conn = DriverManager.getConnection(url, user, password);

        String sqlRead = "Select * from Actor";

        try (PreparedStatement statement = conn.prepareStatement(sqlRead)) {
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                String name = result.getString("first_name");
                System.out.println(name);
            }
        }

    }
}
