package JDBC;

import java.sql.*;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/Demo?serverTimezone=UTC";
		String user = "root";
		String password = "";
		
String query = "Select * from student";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
			Statement stmt = conn.createStatement();
			
			
			ResultSet rs = stmt.executeQuery(query);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int columCount = rsmd.getColumnCount();
			
			for(int i = 1; i<= columCount; i++) {
				System.out.print(rsmd.getColumnName(i)+ " ");
				System.out.print(rsmd.getColumnDisplaySize(i) +" ");
				System.out.println(rsmd.getColumnTypeName(i));
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
		

