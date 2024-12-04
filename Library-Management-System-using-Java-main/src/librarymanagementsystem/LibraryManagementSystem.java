/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author Name
 */
import java.sql.Connection;
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection con = DatabaseConnection.getConnection();
            if(con != null) {
                System.out.println("Connected to database!");
                // Here you'll later add code to show your login form or main interface
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}


