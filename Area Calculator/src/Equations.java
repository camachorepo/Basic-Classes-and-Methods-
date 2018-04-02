import java.util.Scanner;

public class Equations {

	static Scanner reader =   new Scanner (System.in);
	
	public static void main (String[] args ) {
		
		
		int shape =0;
		System.out.println("Hello i can find the area of some basic shapes with a little infomation"); 
		System.out.println("Which shape would you like to find the information for?"); 
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Square");
		System.out.println("4. Triangle");
		
		System.out.println(":");
		shape = reader.nextInt();  
		
		
		switch(shape) {
		case 1: 
			System.out.println("The area is : " + area_circle());
			break; 
		case 2:
			System.out.println("The area is : " + area_rectangle());
			break;
		case 3: 
			System.out.println("The area is : " + area_square());
			break; 
			
		case 4: 
			System.out.println("The area is : " + area_triangle());
			break; 
			
		default: 
			System.out.println("You entered in a wrong shape value try again!");
			break;
		
		
		
		
		
		
		}
		
	}
	
	
	
	public static double area_circle()  {
			
		System.out.println("Please enter the radius of the circle");
		return (Math.PI * Math.pow(reader.nextDouble(), 2));
	}
	
	public static int area_rectangle() {   // returns the area of a rectangle
		int length, width;
		
		System.out.println("Please enter the length of the rectangle:"); 
		length = reader.nextInt();
		System.out.println("Please enter the width of the rectangle:"); 
		width = reader.nextInt();
		
		return (length * width);
	}
	
	
	
	public static int area_square() {      // returns the area of a square
		int side =0;
		System.out.println("Please enter one of the sides of the square:"); 
		side = reader.nextInt();
		return side * side;
	}
	
	public static double area_triangle() { // returns the area of a triangle
			double base = 0.0; 
			double height = 0.0;
		
			System.out.println("Please enter the base of the triangle: "); 
			base = reader.nextDouble();
			System.out.println("Please enter the height of the triangle: "); 
			height = reader.nextDouble();
	return (0.5 * base * height);
	}	
		
}
