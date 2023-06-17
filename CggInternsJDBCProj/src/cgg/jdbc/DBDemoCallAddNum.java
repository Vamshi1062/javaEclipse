package cgg.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DBDemoCallAddNum {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
		   
	 	   try { 
	 		  Class.forName("org.postgresql.Driver");
	 		  String sql="call apAddNum(?,?,?)";
	 		 try (Connection con=DriverManager.getConnection(url, username, password);
	 				 CallableStatement cs=con.prepareCall(sql)){
	 			 cs.setInt(1, Integer.parseInt( args[0]));
	 			 cs.setInt(2, Integer.parseInt( args[1]));
	 			 
	 			 cs.registerOutParameter(3, Types.INTEGER);
	 			 
	 			 cs.execute();
	 			 
	 			 int res=cs.getInt(3);
	 			 System.out.println("sum = "+res);
	 		 }catch(SQLException se) {
	 			 System.out.println(se);
	 		 }
	 		  
	}catch(ClassNotFoundException e) {
		System.out.println(e);
	}
}
}
