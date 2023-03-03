package mysql_jdbc;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) throws Exception
	{
		// variables
		final String url = "jdbc:mysql:///knowprogram";
		final String user = "root";
		final String password = "GCSSarmy@2022@";
		
		// establish the connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		// create JDBC statement object
		Statement st = con.createStatement();
		
		// prepare SQL query
		String query = "SELECT SNO, SNAME, SADD, AVG FROM STUDENT";
		
		// send and execute SQL query in Database software
		ResultSet rs = st.executeQuery(query);
		
		// process the ResultSet object
		boolean flag = false;
		while (rs.next())
		{
			flag = true;
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getFloat(4));
		}
		if(flag == true) 
		{
			System.out.println("\nRecords retrieved and displayed");
		}
		else
		{
			System.out.println("Record not found");
		}
		// close JDBC objects
		rs.close();
		st.close();
		con.close();
	} // main

} // class
