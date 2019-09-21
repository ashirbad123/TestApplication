package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseSetUP {
	
	public Connection con;
	public Statement stmt;
	ResultSet result1=null;
	ResultSet result2=null;
	

	public Statement getStatement() {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String connectionURL="jdbc:mysql://localhost:3306/customer";
		String username="root";
		String password="root";
		try {
		//Registration of the driver with DB.	
		Class.forName(driver);
		
		//Create database connection post registration of the driver.
		con=DriverManager.getConnection(connectionURL, username,password);
		
		//create statement for executing the sql query.
		stmt=con.createStatement();
		
		}
		catch(ClassNotFoundException ex)// The driver class which we are registering is not found.
		{
			ex.printStackTrace();
		}
		catch(SQLException ex) 
		{
			ex.printStackTrace();
		}
			
		return stmt;
	}
	
	public void insertData(String query) {
		
		try {
		getStatement().executeQuery(query);
		}
		catch(SQLException es) {
		es.printStackTrace();
		}
	}
	
	public ResultSet getData(String query) {
		
		try {
		result1=getStatement().executeQuery(query);
		}
		catch(SQLException sql) {   // The sql query which we are supplying is not correct.
		 sql.printStackTrace();
		}
		return result1;
	}
	
	public ResultSet updateData(String query) {
		
		try {
		result2=getStatement().executeQuery(query);
		}
		catch(SQLException e) {
		e.printStackTrace();	
		}
		return result2; 
	}
	
}
