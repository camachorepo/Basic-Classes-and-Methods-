import java.util.Scanner;

public class Equation {


	
	
	
	public static void main(String[] args){
		double sideA, sideB; 
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Hello this program can give the hypotenuse of a triangle given two values!");
		
		
			for(int i=0; i<3; i++) {
				
				
				System.out.println("Please give me the value of side 1 of triangle " + (i+1) + " : "); 
				sideA = reader.nextDouble();
				System.out.println("Please give me the value of side 2 of triangle " + (i+1) + " : ");
				sideB = reader.nextDouble();
				
				System.out.println("The value of the hypotenus of triangle "+ (i+1) + " is : " + hypotenuse(sideA, sideB));
				
				
				
			}
		
	}
	
	
	 static double hypotenuse (double side1, double side2){
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		
	}
	
	
}
