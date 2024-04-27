// create the methods and debug the code using this keyword and show output 
// main method , two parameterized method , default method , one parameterized method



package projecttwopackage;

public class debugMethod {
	
	public void method() {
		
		System.out.println(" default method");
	}
    
    public void method1(int a) {
    	
		this.method2(33,55);
		
		this.method();
		
		System.out.println(" one parameter method");
		
	}
    
    public void method2(int a , int b) {
		
		System.out.println(" two parameter method");
	}
    
     public static void main(String[] args) {
		System.out.println("main method");
		debugMethod obj = new debugMethod();
		obj.method1(56);
	}
}
