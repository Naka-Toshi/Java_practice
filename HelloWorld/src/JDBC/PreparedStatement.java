package JDBC;


import java.sql.*;
import java.util.Scanner;

public class PreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/Demo?serverTimezone=UTC";
		String user = "root";
		String password = "";
		
		String query = "Select * from student where id = ?";
		// if there is a '?', It requires something from user
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID value to fetch data: ");
			int id = sc.nextInt();
			
			java.sql.PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
		
		
			/*rs.next();
			System.out.println(rs.getString("name"));
			*/
			
			while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			stmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
