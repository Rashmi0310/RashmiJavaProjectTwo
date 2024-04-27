// (((((10+2)+2)-3)*3)/3) get the value from console using scanner class // (((((x1+x2)+x3)-x4)*x5)/x6)

package projecttwopackage;

import java.util.Scanner;

public class ScanAssignmentThree {
	
	public int Sum (int a1 , int b1) {
		int c1;
		c1= a1+b1;
		System.out.println(" Value of sum" + c1);
		return c1;
	
	   }
	
	public int Sub (int a2 , int b2) {
		int c2;
		c2= a2-b2;
		System.out.println(" Value of sub" + c2);
		return c2;
	
	}
	
	public int Multiply (int a , int b) {
		int c;
		c= a*b;
		System.out.println(" Value of multiply" + c);
		return c;
		
		}
		
		public int div (int a3 , int b3) {
			int c3;
			c3= a3-b3;
			System.out.println(" Value of div" + c3);
			return c3;
		
		}
		
// main method
		public static void main(String[] args) {
// object creation
			ScanAssignmentThree obj = new ScanAssignmentThree();
// Scanner Class Creation
			Scanner obj1 = new Scanner(System.in);
			
			System.out.println(" Enter the first number");
			int num1 = obj1.nextInt();
			System.out.println(" Enter the second number");
			int num2 = obj1.nextInt();
// call sum 
			int Sum = obj.Sum(num1, num2);
			System.out.println(" Enter the third number");
			int num3 =obj1.nextInt();
// Call sum1
			int Sum1 = obj.Sum(Sum, num3);
			System.out.println(" Enter the fourth number");
			int num4 =obj1.nextInt();
// call sub
			int Sub = obj.Sub(Sum1, num4);
			System.out.println(" Enter the fifth number");
			int num5 =obj1.nextInt();
// call multiply
			int multiply = obj.Multiply(num5, Sub);
			System.out.println(" Enter the sixth number");
			int num6 =obj1.nextInt();
// call divide
			int div = obj.div(multiply, num6);
			System.out.println("final result of "+ (((((10+2)+2)-3)*3)/3));
             
		}

}
