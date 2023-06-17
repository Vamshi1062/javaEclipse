package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		  String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
	 	   try {  
	 		   Class.forName("org.postgresql.Driver");
	 			  String query="select * from emp where 1=2";
	 		   try(Connection con=DriverManager.getConnection(url,username,password);Statement st=con.createStatement();
	 				   ResultSet rs=st.executeQuery(query)){
	 			   ResultSetMetaData rm=rs.getMetaData();
	 			   int cnt=rm.getColumnCount();
	 			   for(int i=1;i<=cnt;i++) {
	 				   System.out.print(rm.getColumnName(i)+"\t");
 	 				   System.out.print(rm.getColumnType(i)+"\t");
	 				   System.out.print(rm.getColumnTypeName(i)+"\t");
	 				   System.out.println(rm.getColumnClassName(i));
	 			   }
	 		   }
	}catch(SQLException se) {
	 	se.printStackTrace();
	 }
	
	    catch(ClassNotFoundException e) {
	 	   e.printStackTrace();
	    }

}

}