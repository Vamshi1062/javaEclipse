package cgg.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBDemoInsertResultSet1 {

	public static void main(String[] args) {
		   String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
		   
	 	   try { 
	 		  Class.forName("org.postgresql.Driver");
	 		  String query="select * from emp";
	 		  
	 		  try(Connection con=DriverManager.getConnection(url, username, password);
	 				  PreparedStatement st=
	 		  con.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)){
	 			   ResultSet rs=st.executeQuery();
	 			   ResultSetMetaData rm=rs.getMetaData();
	 			   DatabaseMetaData dm=con.getMetaData();
	 			   boolean b=dm.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE);
	 			   System.out.println(b);
	 			   int cnt=rm.getColumnCount();
	 			   int noofRows=1;
	 				  while(rs.next()) {
	 					  for(int i=1;i<=cnt;i++) {
	 						  System.out.print(rs.getString(i)+"\t");
	 					  }
	 					  System.out.println();
	 					  noofRows++;
	 					  if(noofRows==2) {
	 						  try {
	 							  Thread.sleep(30000);
	 						  }
	 						  finally {}
	 					  }
	 				  }
	 		  
	}
	 	   }
	 	   catch(ClassNotFoundException |SQLException |InterruptedException e) {
	 		   e.printStackTrace();
	 	   }
	}

}
