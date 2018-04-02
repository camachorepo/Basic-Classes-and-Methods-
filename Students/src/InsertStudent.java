
public class InsertStudent {

	
	private String name; 
	private int grade;
	private double gpa; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	} 
	
		
	public void printStudentInfo() {
		System.out.println("The Student name is : "+ this.name);
		System.out.println("The Student grade is:" + this.grade); 
		System.out.println("The Student gpa is: " + this.gpa);
		
	}
}
