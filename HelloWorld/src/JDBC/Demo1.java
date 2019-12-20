package JDBC;

//Step1
import java.sql.*;

public class Demo1 {
	public static void main(String[] args) {
		
		//JDBC - Java DataBase Connectivity
		
		//Step1 : Import the package
		//Step2 : Load and Register the driver 
		//Step3 : Create the connection
		//Step4 : Create Statement 
		//Step5 : Execute the query
		//Step6 : Process the result
		//Step7 : Close the connection
		
		
		/*not Always
		 * System Requirements
		MYSQL Databese
		XAMPP
		*/
		
		/*Always
		 * Active Srever
		 * xampp control pane1 -> MySql -> Start Server
		 *Type localhost in browser -> click PhpMyAdmin (top-right) -> Crtate Database -> Create Table -> Insert Record
		 */
		
		//SQL - Structured Query Language
		//Java communicate to the MySql Datebase using the Query(for example ->"Select * from * Table_Name)
		
		
		String url = "jdbc:mysql://localhost:3306/Demo?serverTimezone=UTC";
		String user = "root";
		String password = "";
		//Step5
		//String query = "Select * from Student where department = 'English'";
		//String query = "Select * from Student";
		//String query = "Select * from student where id = 1";
		//String query = "Select * from student where name = 'Toshiki'";
		
		String query = "Select name from student where id = 2";
	
	//Step2
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step3
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//Step4
			Statement stmt = conn.createStatement();
			
		//Step5
			ResultSet rs = stmt.executeQuery(query);
			
			rs.next();
			System.out.println(rs.getString("name"));
			
		//Step6
			/*while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}*/
			
		//Step7 
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
