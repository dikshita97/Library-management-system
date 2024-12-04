/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author HP
 */


import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            // Database parameters
            String url = "jdbc:mysql://localhost:3306/library_db"; // Change library_db to your database name
            String username = "root";
            String password = "";  // Add password if you set one in MySQL

            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create connection
            con = DriverManager.getConnection(url, username, password);
            
            if(con != null) {
                System.out.println("Database connected successfully");
            }
            
        } catch(Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }
}
