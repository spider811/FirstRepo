import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class CreateDatabase {

	static final String Driver="com.mysql.jdbc.Driver";	//unique hota hai driver
	static final String Url="jdbc:mysql://localhost:3306";
	static final String user="root";
	static final String pass="root";
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//---->register driver
			con=DriverManager.getConnection(Url,user,pass);//get connection from database
			st=(Statement)con.createStatement();	//create a statement
			String sql="create database student";
			((java.sql.Statement) st).executeUpdate(sql);
			System.out.println("Successfully Database Created");
		}
		catch(SQLException se) {
			//System.out.println(se.printStackTrace());//handle error for JDBC
			se.printStackTrace();
		}
		catch(Exception e) {
			//System.out.println(e.printStackTrace());
			e.printStackTrace();
		}
		finally {
			try {
				if(((Connection)st!=null)
					((Connection) st).close();
			}
			catch(SQLException se){
				
			}
			try {
				if(con!=null) {
					con.close();
				}
			}
			catch(SQLException e) {
				
			}
		}
	}

}
