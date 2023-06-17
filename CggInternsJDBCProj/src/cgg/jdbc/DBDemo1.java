package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBDemo1 {

	public static void main(String[] args) {
     String url="jdbc:postgresql://localhost:5432/cgg_interns";
     Properties properties=new Properties();
     properties.put("user","postgres");
     properties.put("password","Vamshi@1062");
     try {
    	 Class.forName("org.postgresql.Driver");
    	 Connection connection=DriverManager.getConnection(url,properties);
    	 System.out.println("Connection Estbalished...");
    	 connection.close();
    	 
     }
     catch(ClassNotFoundException e) {
    	 e.printStackTrace();
     }
     catch(SQLException se) {
    	 se.printStackTrace();
     }
	}

}
