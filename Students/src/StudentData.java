import java.util.Scanner;

public class StudentData {

	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		
//		InsertStudent student1 = new InsertStudent(); 
//		InsertStudent student2 = new InsertStudent(); 
//		InsertStudent student3 = new InsertStudent(); 
//		InsertStudent  studentarr [] = new InsertStudent[3];
		
		System.out.println("Hello i store student data");
		System.out.println("Please let me know how many students data you would like stored : ");
		int numStudents = reader.nextInt();
		reader.nextLine();
		InsertStudent  studentarr [] = new InsertStudent[numStudents];
		int sum =0;
//		student1.setName(askName(1));
//		student1.setGrade(askGrade(1));
//		student1.setGpa(askGpa(1));
//		student1.printStudentInfo();
//		student2.setName(askName(2));
//		student2.setGrade(askGrade(2));
//		student2.setGpa(askGpa(2));
//		student2.printStudentInfo();		
//		student3.setName(askName(3));
//		student3.setGrade(askGrade(3));
//		student3.setGpa(askGpa(3)); 
//		student3.printStudentInfo();
		
		
		for(int i=0; i < studentarr.length; i++) {
			studentarr[i] = new InsertStudent();
			studentarr[i].setName(askName(i+1));
			studentarr[i].setGrade(askGrade(i+1));
			studentarr[i].setGpa(askGpa(i+1));
			studentarr[i].printStudentInfo();
			sum += studentarr[i].getGrade();
		}

		System.out.println("The Students average is:" + sum/studentarr.length );
		
		
	//	System.out.println("The Students average is: " + setAverage(student1.getGrade(), student2.getGrade(), student3.getGrade()));
		
	}
	
	public static int askGrade  (int number) {
		System.out.println("Please enter info for student " + number + " grade : ");
		
		return reader.nextInt(); 
	}
	
	public static String askName(int number) {
		System.out.println("Please enter info for student " + number + " name : "); 
		return reader.nextLine(); 
	}
	
	public static double askGpa(int number) {
		double  gpa = 0.0;
		System.out.println("Please enter info for student " + number + " GPA : ");	
		
		gpa = reader.nextDouble();
		reader.nextLine();
		return gpa;
	}
	
//	public static int setAverage(int grade1, int grade2, int grade3) {
//		int studentAverage = (grade1+ grade2+ grade3)/3;
//		return studentAverage;
//		}
	


}
