package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoDelete {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
 	   String username="postgres";
 	   String password="Vamshi@1062";
 	   try {  
 		   Class.forName("org.postgresql.Driver");
 		   try(Connection con=DriverManager.getConnection(url,username,password);Statement st=con.createStatement()){
 //String deletecmd="delete from emp where ename='"+args[0]+"'";
 			   String deleteAllcmd="delete from emp";
 int cnt=st.executeUpdate(deleteAllcmd);
 System.out.println(cnt+" row(s) deleted");
 		   }catch(SQLException se) {
 	se.printStackTrace();
 }
 }
    catch(ClassNotFoundException e) {
 	   e.printStackTrace();
    }
	}

}
