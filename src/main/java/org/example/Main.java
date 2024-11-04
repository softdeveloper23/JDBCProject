package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sakila";
        String user = "root";
        String password = "!Debbie1985@";

        Connection conn = DriverManager.getConnection(url, user, password);

    }
}
