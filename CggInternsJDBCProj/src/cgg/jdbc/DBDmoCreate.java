package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDmoCreate {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="Vamshi@1062";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement();
			String dropcmd="drop table if exists emp";
			String createcmd="create table emp(empid int primary key,ename varchar(40),salary numeric(12,2))";
			st.execute(dropcmd);
			st.execute(createcmd);
			
			System.out.println("Table created...");
			
			st.close();
			con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}

	}

}
