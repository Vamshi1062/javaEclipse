package cgg.jdbc;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DBDemoCallGetSalary {

	public static void main(String[] args) {
		   String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
		   
	 	   try { 
	 		  Class.forName("org.postgresql.Driver");
	 		  String sql="call spGetSalary(?,?)";
	 		 try (Connection con=DriverManager.getConnection(url, username, password);
	 			 CallableStatement cs=con.prepareCall(sql)){
	 			 cs.setInt(1, Integer.parseInt( args[0]));
	 			  
	 			 
	 			 cs.registerOutParameter(2, Types.NUMERIC);
	 			 
	 			 cs.execute();
	 			 
	 			 BigDecimal res=cs.getBigDecimal(2);
	 			 System.out.println("salary = "+res);
	 		 }catch(SQLException se) {
	 			 System.out.println(se);
	 		 }
	 		  
	}catch(ClassNotFoundException e) {
		System.out.println(e);
	}

	}

}
