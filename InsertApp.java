package net.sqlitetutorial;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
/**
 *
 * original @author sqlitetutorial.net
 * revised by @Ziwei Gong
 */
public class InsertApp {
 
    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db/test.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
 
    /**
     * Insert a new row into the warehouses table
     *
     * @param name
     * @param dish
     */
    public void insertSections(String name, String dish) {
        String sql = "INSERT INTO warehouses(name,dish) VALUES(?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, dish);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        InsertApp app = new InsertApp();
        // insert three new rows
        app.insertSections("Lunch Special", "Chicken Over Rice");
        app.insertSections("Dinner Specials", "Salad");
        app.insertSections("Specials of the day", "Lamb With Salad");
        //revise base on the number of dishes
    }
 
}
