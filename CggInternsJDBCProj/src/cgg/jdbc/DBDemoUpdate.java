package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoUpdate {

	public static void main(String[] args) {
       
    	   String url="jdbc:postgresql://localhost:5432/cgg_interns";
    	   String username="postgres";
    	   String password="Vamshi@1062";
    	   try {  
    		   Class.forName("org.postgresql.Driver");
    		   try(Connection con=DriverManager.getConnection(url,username,password);Statement st=con.createStatement()){
    String updatecmd="update emp set ename='Pop',salary=600000  where empid=102";	
    int cnt=st.executeUpdate(updatecmd);
    System.out.println(cnt+" row(s) updated");
    		   }catch(SQLException se) {
    	se.printStackTrace();
    }
    }
       catch(ClassNotFoundException e) {
    	   e.printStackTrace();
       }
	}

}
