package projectline;

import java.util.Scanner;

public class UC4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double length1,length2,x1,y1 ,x2,y2, x11, y11 ,x22, y22;
        
        
        System.out.println("Line1");

        System.out.println("Enter X1 :");
        x1= scan.nextDouble();
        System.out.println("Enter Y1 :");
        y1= scan.nextDouble();
        System.out.println("Enter X2 :");
        x2= scan.nextDouble();
        System.out.println("Enter Y2 :");
        y2 = scan.nextDouble();
        

        System.out.println("Line2");

        System.out.println("Enter X11 :");
        x11= scan.nextDouble();
        System.out.println("Enter Y11 :");
        y11= scan.nextDouble();
        System.out.println("Enter X22 :");
        x22= scan.nextDouble();
        System.out.println("Enter Y22 :");
        y22= scan.nextDouble();
        
       
        length1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("length of line 1 :"+length1);

        length2 = Math.sqrt((y22 - y11) * (y22 - y11) + (x22 - x11) * (x22 - x11));
        System.out.println("length of line 2 :"+length2);
        
        
        String line1= Double.toString(length1);

        String line2= Double.toString(length2);

        System.out.println (line1.compareTo(line2));

        if(line1.compareTo (line2) == 0){

            System.out.println("lines are equal");}

        else if(line1.compareTo(line2) > 0)

            System.out.println("line-1 is greater than line-2 ");
        else
            System.out.println("line-1 is smaller than line-2 ");

        
          
   }
}
		
		
		
	
