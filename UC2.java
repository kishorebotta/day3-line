package projectline;

import java.util.Scanner;


public class UC2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		double x1 , x2 ,y1 ,y2 , length ;
		
		System.out.println("enter x1");
		x1=input.nextDouble();
		
		System.out.println("enter x2");
		x2=input.nextDouble();
		
		
		System.out.println("enter y1");
		y1=input.nextDouble();
		
		System.out.println("enter y2");
		y2=input.nextDouble();
		
		length = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2- y1 , 2));
		System.out.println(length);

		
	}

}
