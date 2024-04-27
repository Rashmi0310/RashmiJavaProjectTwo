// create the constructor and debug the code using this keyword and show output  (debug the code using constructor)
// main method , two parameterized , default , one parameterized


package projecttwopackage;

public class DebugConstructor {
	
// create constructor 
	public DebugConstructor() {
		
		this(20 , 22); // two parameter
		System.out.println(" default constructor");
			
	   }
	
	public DebugConstructor(int a) {
		
		this(); // default parameter
		System.out.println(" one parameter constructor");
		
   }
    
	public DebugConstructor(int a , int b) {
		
		System.out.println(" two parameter constructor");
		
   }
	
// main method
	
	public static void main(String[] args) {
	System.out.println("main method of the code");
// object creation constructor calling and add breakpoint for debug 
	DebugConstructor obj = new DebugConstructor(234); // one parameter
	}
}
