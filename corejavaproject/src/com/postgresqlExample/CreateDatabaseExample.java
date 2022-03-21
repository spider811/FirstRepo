package com.postgresqlExample;

import java.sql.*;
import java.beans.Statement;
import java.sql.DriverManager;


public class CreateDatabaseExample {

	static final String driver="org.postgresql.Driver";
	static final String url="jdbc:postgresql://localhost:5432/";
	static final String user="postgres";
	static final String pass="postgres";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con= null;
		Statement st=null;
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url,user,pass);
			String sql="create database company";
			st.executeUpdate(sql);
			st.close();
			con.close();
			System.out.println("successfully database created");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
