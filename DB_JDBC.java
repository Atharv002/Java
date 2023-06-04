import java.sql.*;
// import java.awt.*;
// import java.awt.event.*;

public class DB_JDBC{
    private Connection conn;
    public DB_JDBC(){
        // Connect to MySQL database
        try {
            // System.out.println("0");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("1");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "123456789");
            System.out.println("2");
            System.out.println("Connected to the server");
        } catch (Exception ex) {
            System.out.println("Error connecting to the server: "+ex);
        }
    }
    public static void main(String args[]){
        DB_JDBC obj = new DB_JDBC();
    }
}