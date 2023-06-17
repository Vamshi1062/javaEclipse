package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBDemo {

	public static void main(String[] args) {
     String url="jdbc:postgresql://localhost:5432/cgg_interns";
     String username="postgres";
     String password="Vamshi@1062";
     try {
    	 //register driver with Driver Manager class
    	Class.forName("org.postgresql.Driver");
    	 //second way of registering driver with DriverManager Class
    	// DriverManager.registerDriver(new Driver());
    	 
    	Connection connection= DriverManager.getConnection(url,username,password);
    	System.out.println("connection established....");
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
