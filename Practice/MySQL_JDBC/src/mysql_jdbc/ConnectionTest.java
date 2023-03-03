package mysql_jdbc;

import java.sql.*;

public class ConnectionTest {

	public static void main(String[] args ) throws Exception {
		
		 // register Oracle thin driver with DriverManager service
		 // it is optional for JDBC4.x version
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 		 
		 // declare variables
		 // place your own values
		 final String url = "jdbc:mysql:///knowprogram";
		 final String user = "root";
		 final String password = "GCSSarmy@2022@";
		 
		 // establish the connection
		 Connection con = DriverManager.getConnection(url, user, password);
		 
		 // display status message
		 if(con == null) {
			 System.out.println("JDBC connection is not established");
			 return;
		 }
		 else
			 System.out.println("Congratulations,"+ " JDBC connection is established successfully.\n");
		 		 
		 // close JDBC connection
		 con.close();
		 } //main
} //class

