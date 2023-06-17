package cgg.sma.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cgg.sma.dao.StudentDAO;
import cgg.sma.model.Student;

public class StudentManage {
	static StudentDAO studentDAO =new StudentDAO();

	public static void main(String[] args) {
		System.out.println("Welcome to Student Management Application:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("press 1 to Add Student:");
			System.out.println("press 2 to Update Student");
			System.out.println("press 3 to Delete Student");
			System.out.println("press 4 to Display All Student");
			System.out.println("press 5 to exit");
			
			System.out.println("Enter your choice");
			
			try {
				int ch=Integer.parseInt(br.readLine());
				
				if(ch==1) {
					//add student..
					System.out.println("Enter Student Name:");
					String name=br.readLine();
					System.out.println("Enter Student phone number");
					String phone=br.readLine();
					System.out.println("Enter Student City");
					String city=br.readLine();
					
					//create student object to store
					
					Student student = new Student(name,phone,city);
					
					boolean answer = studentDAO.insertStudentToDB(student);
					if(answer) {
						System.out.println("Student added successfully");
					}
					else {
						System.out.println("Something went wrong");
					}
					
				}
				else if(ch==2) {
					//update student..
					System.out.println("Enter the Details you want to  be update:\n Press 1 To update the Student Name.\n press 2. To update the phone number.\n press 3. To update the city.");
					int update=Integer.parseInt(br.readLine());
					switch(update) {
					case 1:
						System.out.println("Enter the Student ID");
						int id=Integer.parseInt(br.readLine());
						System.out.println("Enter the Student Name");
						String name=br.readLine();
						boolean answer=studentDAO.updateStudentName(id,name);
						if(answer) {
							System.out.println("Student Name updated successfully");
						}
						else {
							System.out.println("Something went wrong");
						}
						break;
					case 2:
						System.out.println("Enter the Student ID");
						int id1=Integer.parseInt(br.readLine());
						System.out.println("Enter the Student Phone number");
						String phno=br.readLine();
						boolean answer1=studentDAO.updateStudentPhoneNo(id1,phno);
						if(answer1) {
							System.out.println("Student phno updated successfully");
						}
						else {
							System.out.println("Something went wrong");
						}
						break;
					case 3:
						System.out.println("Enter the Student ID");
						int id2=Integer.parseInt(br.readLine());
						System.out.println("Enter the Student city");
						String city=br.readLine();
						boolean answer2=studentDAO.updateStudentCity(id2,city);
						if(answer2) {
							System.out.println("Student city updated successfully");
						}
						else {
							System.out.println("Something went wrong");
						}
						break;
						
					}
					
				}
				else if(ch==3) {
					//delete student..
					
					System.out.println("Enter studentId to delete");
					int userId = Integer.parseInt(br.readLine());
					
					boolean answer = studentDAO.deleteStudent(userId);
					
					if(answer) {
						System.out.println("student deleted");
					}
					else {
						System.out.println("something went wrong");
					}
				}
				else if(ch==4) {
					//display All students..
					
					studentDAO.showAllStudents();
					
				}
				else if(ch==5) {
					//exit
					break;
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thank you for using this app");
		System.out.println("see you soon.... bye bye");

	}

}
