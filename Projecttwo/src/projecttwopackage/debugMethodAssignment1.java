// output should be in the below sequence(using this keyword)in case of method by debug mode
// three parameterized method , default method ,one parameterized method
// two parameterized method ,four parameterized method

package projecttwopackage;

public class debugMethodAssignment1 {

	
     public void m0() {
		this.m3(3, 2, 1); // three parameter method
		System.out.println(" default method");
	}
     public void m1(int a) {
 		this.m0(); // default method
 		System.out.println(" one parameterized method");
 	}
     public void m2(int a , int b) {
  		this.m1(5);// one parameter method
  		System.out.println(" two parameterized method");
  	}
     public void m3(int a , int b , int c ) {
  		
  		System.out.println(" three parameterized method");
  	}
     public void m4(int a , int b , int c , int d) {
  		this.m2(6, 8); // two parameter method
  		System.out.println(" four parameterized method");
  	}
     
     public static void main(String[] args) {
    	 debugMethodAssignment1 obj = new debugMethodAssignment1();
    	 obj.m4(20, 30, 40, 50); // four parameter method
	}
     
}
