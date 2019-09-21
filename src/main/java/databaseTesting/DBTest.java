package databaseTesting;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class DBTest {

	@Test
	public void selectDBData() {
	
		String query= "select * from registration";
		DatabaseSetUP ref= new DatabaseSetUP();
		ResultSet result=ref.getData(query);
		System.out.println("ID " + "   NAME " + "   PROFESSION " +"\n");
		try {
		while (result.next()) {
			System.out.println(result.getString(1) +"    "+ result.getString(2)+"    "+ result.getString(3));
		 }
		}
		
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
}
