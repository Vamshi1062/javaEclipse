package cgg.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoInsert {

	public static void main(String[] args) {
		 String url="jdbc:postgresql://localhost:5432/cgg_interns";
		 String username="postgres";
		 String password="Vamshi@1062"; 
		 try {
			 Class.forName("org.postgresql.Driver");
			 Connection con=DriverManager.getConnection(url, username, password);
			 Statement st=con.createStatement();
			 
			 int empno=Integer.parseInt(args[0]);
			 String ename=args[1];
			 double salary=Double.parseDouble(args[2]);
			 String insertcmd="insert into emp values("+empno+",'"+ename+"',"+salary+")";
			 int cnt=st.executeUpdate(insertcmd);
			 System.out.println(cnt+" row(s) inserted");
			 st.close();
			 con.close();
		 }
			 catch(ClassNotFoundException e) {
				 System.out.println(e.getMessage());
			 }
			 catch(SQLException se) {
				 System.out.println(se.getMessage());
			 }
			 
		 }
	}


