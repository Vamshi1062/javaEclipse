package cgg.jdbc;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoBatch {

	public static void main(String[] args) {
		   String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
		   
	 	   try { 
	 		  Class.forName("org.postgresql.Driver");
	 		  
	 		  try(Connection con=DriverManager.getConnection(url, username, password);
	 				  Statement st=con.createStatement()){
	 			  
	 			  st.addBatch("insert into emp values(301,'der',530000)");
	 			  st.addBatch("insert into emp values(302,'the',450000)");
	 			  st.addBatch("insert into emp values(303,'the',650000)");
	 			  
	 			  int [] counts;
	 			  try {
	 				  counts=st.executeBatch();
	 			  }catch(BatchUpdateException e) {
	 				  counts=e.getUpdateCounts();
	 			  }
	 			  for(int i=0;i<counts.length;i++) {
	 				  switch(counts[i]) {
	 				  case Statement.SUCCESS_NO_INFO:
	 					  System.out.println("Success no info");
	 					  break;
	 				  case Statement.EXECUTE_FAILED:
	 					  System.out.println("Execution failed");
	 					  break;
	 				  default:
	 					  System.out.println(counts[i]+" row(s) effected");
	 				  }
	 				  
	 			  }
	 		  }
	}catch(ClassNotFoundException|SQLException e) {
		System.out.println(e); 
	}
	 	   }
}
