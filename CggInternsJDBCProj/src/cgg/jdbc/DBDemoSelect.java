package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoSelect {

	public static void main(String[] args) {
		   String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
	 	   try {  
	 		   Class.forName("org.postgresql.Driver");
	 		   try(Connection con=DriverManager.getConnection(url,username,password);Statement st=con.createStatement()){
	           String query="select * from emp";
	           ResultSet rs=st.executeQuery(query);
	           ResultSetMetaData rm = rs.getMetaData();
	           int cols = rm.getColumnCount();
	           for(int i=1;i<=cols;i++) {
	        	   System.out.print(rm.getColumnName(i)+"\t");
	           }
	           System.out.println();
//	           while(rs.next()) {
//	        	   System.out.print(rs.getInt(1)+"\t");
//	        	   System.out.print(rs.getString("ename")+"\t");
//	        	   System.out.print(rs.getDouble("salary"));
//	        	   System.out.println();
//	           }
	           while(rs.next()) {
	        	   for(int i=1;i<=cols;i++) {
	        		   System.out.print(rs.getString(i)+"\t");
	        	   }
	        	   System.out.println();
	           }
 	 		   }
	 		   catch(SQLException se) {
	 	se.printStackTrace();
	 }
	 }
	    catch(ClassNotFoundException e) {
	 	   e.printStackTrace();
	    }
		}
	}


