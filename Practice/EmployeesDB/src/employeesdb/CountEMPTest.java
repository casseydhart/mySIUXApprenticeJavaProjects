package employeesdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CountEMPTest {

   // values specific to each database
   private static final String URL = 
      "jdbc:mysql:///knowprogram";
   private static final String USERNAME = "root";
   private static final String PASSWORD = "GCSSarmy@2022@"; 

// main method
   public static void main(String[] args ) {

     // declare variables
     Scanner scan = null;
     int n = 0;
     String query = null;
     Connection con = null;
     Statement st = null;
     ResultSet rs = null;

     try {
        // create Scanner class object
        scan = new Scanner(System.in);

        // take input
        if(scan != null) {
           System.out.print("Enter N value: ");
           n = scan.nextInt();
        }

        // prepare SQL query
        query = "SELECT * FROM (SELECT ENAME, SALARY, " + "DENSE_RANK() " + "OVER (ORDER BY SALARY DESC) as R FROM EMPLOYEE) AS EMPLOYEE WHERE R = " + n;

        // establish the connection
        con = DriverManager.getConnection(
                    URL, USERNAME, PASSWORD);

        // create JDBC statement object
        if(con != null) {
           st = con.createStatement();
        }

        // execute the SQL query
        if(st != null) {
           rs = st.executeQuery(query);
        }
        
        // process the resultset
        if(rs != null) {
           while(rs.next()) {
              System.out.println( 
            		  rs.getString("ENAME") + " " +
                      rs.getFloat("SALARY") + " " + 
                      rs.getInt("R") );
           }
        }

     } catch(SQLException se) {
        se.printStackTrace();
     } catch(Exception e) {
        e.printStackTrace();
     } // try-catch block 

     finally {
        // close JDBC objects
        try {
           if(rs != null) rs.close();
        } catch(SQLException se) {
           se.printStackTrace();
        }
        try {
           if(st != null) st.close();
        } catch(SQLException se) {
           se.printStackTrace();
        }
        try {
           if(con != null) con.close();
        } catch(SQLException se) {
           se.printStackTrace();
        }
        try {
           if(scan != null) scan.close();
        } catch(Exception e) {
           e.printStackTrace();
        }
     } // finally
   } //main()
} //class
