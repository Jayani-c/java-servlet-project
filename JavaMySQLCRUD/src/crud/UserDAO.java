package crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	 private static Connection conn = DBConnection.getConnection();

	    public static void addUser(String name, String email, String country) {
	        String sql = "INSERT INTO users (name, email, country) VALUES (?, ?, ?)";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, name);
	            stmt.setString(2, email);
	            stmt.setString(3, country);
	            stmt.executeUpdate();
	            System.out.println("User added successfully.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public static List<User> getAllUsers() {
	        List<User> users = new ArrayList<>();
	        String sql = "SELECT * FROM users";
	        try (Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
	            while (rs.next()) {
	                users.add(new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("country")));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return users;
	    }

}
