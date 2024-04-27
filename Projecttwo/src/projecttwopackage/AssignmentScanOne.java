// (((((x1*x2)+x3)-x4)+x5)/x6)  get the value from console using scanner class

package projecttwopackage;

import java.util.Scanner;

public class AssignmentScanOne {
	
	public int Multiply (int a , int b) {
	int c;
	c= a*b;
	System.out.println(" Value of multiply" + c);
	return c;
	
	}
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
	public int div (int a3 , int b3) {
		int c3;
		c3= a3-b3;
		System.out.println(" Value of div" + c3);
		return c3;
	
	}
	
	public static void main(String[] args) {
		AssignmentScanOne obj = new AssignmentScanOne();
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println(" Enter the value of x1");
		int x1 = obj1.nextInt();
		System.out.println(" Enter the value of x2");
		int x2 = obj1.nextInt();
// call  method " multiply "
		int Multiply = obj.Multiply(x1 , x2);
		System.out.println(" Enter the value of x3");
// call scanner
		int x3 = obj1.nextInt();
// call sum 
		int Sum = obj.Sum(Multiply, x3);
		System.out.println(" Enter the value of x4");
		int x4 = obj1.nextInt();
// call sub
		int Sub = obj.Sub(Sum, x4);
		System.out.println(" Enter the value of x5");
		int x5 = obj1.nextInt();
//call sum1
		int Sum1 = obj.Sum(Sub, x5);
		System.out.println(" Enter the value of x6");
		int x6 =obj1.nextInt();
// call divide
		int div = obj.div(Sum1, x6);
		System.out.println("final result of " +(((((x1*x2)+x3)-x4)+x5)/x6));
		
		
		

		
		
		
	}

}
