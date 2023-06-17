package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoCreateSalary {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
	 	   String username="postgres";
	 	   String password="Vamshi@1062";
		   
	 	   try (Connection con=DriverManager.getConnection(url, username, password); 
	 			   Statement st=con.createStatement()){  
	 		 Class.forName("org.postgresql.Driver");
	 		 String dropcmd="drop procedure if exists spGetSalary";
	 		 String createcmd="create procedure spGetSalary(in p_empno int,out p_sal numeric(12,2)) language plpgsql as $$"+
	 		        " begin "+
	 			    " select salary into p_sal from emp where empid=p_empno;"+
	 		        " end ; $$";
	 			 	st.execute(dropcmd);
	 			 	st.execute(createcmd);
	 		 System.out.println("procedure created...");
	}
	 	  catch(SQLException se) {
	 		   System.out.println(se);
	 	   }
	 	  catch(ClassNotFoundException e) {
	 		   System.out.println(e);
	 	   }
	}
}
