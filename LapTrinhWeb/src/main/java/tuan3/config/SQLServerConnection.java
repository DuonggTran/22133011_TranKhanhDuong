package tuan3.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection 
{
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=LAPTRINHWEB";
    private static final String USER = "sa";
    private static final String PASSWORD = "Duong094";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
