package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemoPrepared {

	public static void main(String[] args) {
		   String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
	 	   try {  
	 		   Class.forName("org.postgresql.Driver");
	 		   try(Connection con=DriverManager.getConnection(url,username,password);
	 		   PreparedStatement stm=con.prepareStatement("insert into emp values(?,?,?)")){
	 		   stm.setInt(1,120);
	 		   stm.setString(2,"abc");
	 		   stm.setDouble(3,900000);
	 		   int cnt = stm.executeUpdate();
	 		   System.out.println(cnt+" row(s) inserted..");
	 		   stm.setInt(1,121);
	 		   stm.setString(2,"efg");
	 		   stm.setDouble(3,700000);
	 		   cnt = stm.executeUpdate();
	 		   System.out.println(cnt+" row(s) inserted..");
	 		   }
	 		   catch(SQLException e) {
	 			   e.printStackTrace();
	 		   }
	}
	 	   catch(ClassNotFoundException se) {
	 		   se.printStackTrace();
	 	   }

}
}
