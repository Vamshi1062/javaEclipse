package cgg.sma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cgg.sma.manage.ConnectionProvider;
import cgg.sma.model.Student;

public class StudentDAO {
	
	Connection conn;

	public StudentDAO() {
		super();
		conn=ConnectionProvider.createConnection();
	}
	
	public boolean insertStudentToDB(Student st) {
		
		boolean f=false;
		
		String q= "insert into students(student_name,student_phone,student_city) values(?,?,?)";
		
		try {
			
			//preparedStatement...
			PreparedStatement ps=conn.prepareStatement(q);
			
			ps.setString(1, st.getsName());
			ps.setString(2, st.getsPhone());
			ps.setString(3, st.getsCity());
			
			//execute..
			ps.executeUpdate();
			
			f=true;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public boolean deleteStudent(int userId) {
		boolean f= false;
		try {
			String q="delete from students where studentId=?";
			//preparedStatement...
			PreparedStatement ps=conn.prepareStatement(q);
			
			ps.setInt(1,userId);
			
			//execute..
			ps.executeUpdate();
			
			f=true;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	public void showAllStudents() {
		
		try {
			
			String q="select * from students";
			
			//createStatement
			
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(q);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name = rs.getString(2);
				String phone= rs.getString(3);
				String city= rs.getString(4);
				
				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("phone No : "+phone);
				System.out.println("city : "+city);
				System.out.println("--------------");
				
			}
			rs.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean updateStudentName(int id, String name) {
		
		boolean f=false;
		String q="update students set student_name=? where studentId=?";
		
		try {
			
			//preparedStatement...
			PreparedStatement ps=conn.prepareStatement(q);
			
			ps.setString(1, name);
			ps.setInt(2, id);
			
			//execute..
			ps.executeUpdate();
			
			f=true;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	public boolean updateStudentPhoneNo(int id, String phno) {
		
		boolean f=false;
		String q="update students set student_phone=? where studentId=?";
		
		try {
			
			//preparedStatement...
			PreparedStatement ps=conn.prepareStatement(q);
			
			ps.setString(1, phno);
			ps.setInt(2, id);
			
			//execute..
			ps.executeUpdate();
			
			f=true;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public boolean updateStudentCity(int id, String city) {
		boolean f=false;
		String q="update students set student_city=? where studentId=?";
		
		try {
			
			//preparedStatement...
			PreparedStatement ps=conn.prepareStatement(q);
			
			ps.setString(1, city);
			ps.setInt(2, id);
			
			//execute..
			ps.executeUpdate();
			
			f=true;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return f;
	}
	
	

}
