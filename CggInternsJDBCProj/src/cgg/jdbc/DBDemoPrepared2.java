package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBDemoPrepared2 {
static ResultSet rs;
static int cnt;
public static void displayColumnHeading()throws SQLException {
	ResultSetMetaData rm=rs.getMetaData();
    cnt=rm.getColumnCount();
    for(int i=1;i<=cnt;i++) {
 	   System.out.println(rm.getColumnName(i)+"\t");
    }
    System.out.println();
    }
	public static void displayData() throws SQLException{
		 while(rs.next()) {
      	   for(int i=1;i<=cnt;i++) {
      		   System.out.print(rs.getString(i)+"\t");
      	   }
      	   System.out.println();
	}
	}
	public static void main(String[] args) {
		  String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
	 	   try {  
	 		   Class.forName("org.postgresql.Driver");
	 		  String query="select * from emp where empid=?";
	 		   try(Connection con=DriverManager.getConnection(url,username,password);PreparedStatement ps=con.prepareStatement(query)){
	           ps.setInt(1, 101);
	           rs=ps.executeQuery();
	           displayColumnHeading();
	           displayData();
	           
	           ps.setInt(1, 102);
	           rs=ps.executeQuery();
	           displayData();
	           rs.close();
	}catch(SQLException e) {
		System.out.println(e);
	}

}
	 	   catch(ClassNotFoundException se) {
	 		   System.out.println(se);
	 	   }
	 	   }}