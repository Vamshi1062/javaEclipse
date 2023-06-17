package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoInsertResultSet {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
		   
	 	   try { 
	 		  Class.forName("org.postgresql.Driver");
	 		  String query="select * from emp";
	 		  
	 		  try(Connection con=DriverManager.getConnection(url, username, password);
	 				  Statement st=
	 		  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE)){
	 				  ResultSet rs=st.executeQuery(query);
	 				  rs.moveToInsertRow();
	 				  rs.updateInt(1,500);
	 				  rs.updateString(2,"gui");
	 				  rs.updateDouble(3, 9000000);
	 				  
	 				  rs.insertRow();
	 				  rs.moveToCurrentRow();
	 		  
	}
	 	   }
	 	   catch(ClassNotFoundException |SQLException e) {
	 		   e.printStackTrace();
	 	   }
}
}