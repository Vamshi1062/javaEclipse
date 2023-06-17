package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo1 {

	public static void main(String[] args) {
       String url="jdbc:postgresql://localhost:5432/cgg_interns";
       String username="postgres";
       String password="Vamshi@1062";
       try {
       Class.forName("org.postgresql.Driver");
       Connection connection = DriverManager.getConnection(url, username, password);
//       Statement statement = connection.createStatement();
//       ResultSet rs=statement.executeQuery("select * from emp");
//       ResultSetMetaData rsm=rs.getMetaData();
//       int cnt=rsm.getColumnCount();
//       for(int i=1;i<=cnt;i++) {
//    	   System.out.print(rsm.getColumnName(i)+"\t");
//       }
//       System.out.println();
//       while(rs.next()) {
//    	   System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
//       }
       PreparedStatement st=connection.prepareStatement("insert into emp values(?,?,?)");
       st.setInt(1,123);
       st.setString(2,"sanju");
       st.setDouble(3,123456);
      
       int i=st.executeUpdate();
       System.out.println(i +"rows effected");
       connection.close();
	}
       catch(Exception e) {
    	   e.printStackTrace();
       }
	}
}
