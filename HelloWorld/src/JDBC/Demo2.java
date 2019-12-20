package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
	public static void main (String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306/Demo?serverTimezone=UTC";
		String user = "root";
		String password = "";
		
		String query = "insert into student values(?,?,?)";
		String q1 = "Select * from student";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID :" );
			int id = sc.nextInt();
			System.out.println("Enter Name :" );
			String name = sc.next();
			System.out.println("Enter the department :");
			String department = sc.next();
			
			java.sql.PreparedStatement stmt = conn.prepareCall(query);
			stmt.setInt(1,id);
			stmt.setString(2,name);
			stmt.setString(3, department);
			
			int count = stmt.executeUpdate();
			if (count == 1) {
				System.out.println("Data Inserted successfully");
			}
			
			//System.out.println("Count: " + count);
			ResultSet rs = stmt.executeQuery(q1);
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " +rs.getString(2) + " " + rs.getString(3));
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

