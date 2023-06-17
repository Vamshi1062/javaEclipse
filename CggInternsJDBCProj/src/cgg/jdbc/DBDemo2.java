package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo2 {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="Vamshi@1062";
		
		try {
			Class.forName("org.postgresql.Driver");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);		}
	try(Connection con=DriverManager.getConnection(url,username,password);Statement st=con.createStatement()){
		System.out.println("Connection established...");
		String dropcmd="drop table if exists student";
		String createcmd="create table student(studentid int primary key,sname varchar(40),age int)";
		st.execute(dropcmd);
		st.execute(createcmd);
		System.out.println("table created...");
		String insertcmd="insert into student values(12,'xxx',21)";
		int cnt=st.executeUpdate(insertcmd);
		System.out.println(cnt+" row(s) inserted...");
	}catch(SQLException se) {
		System.out.println(se);
	}

}
}