package br.edu.campuscalama.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/sistema_votacao";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }
}
