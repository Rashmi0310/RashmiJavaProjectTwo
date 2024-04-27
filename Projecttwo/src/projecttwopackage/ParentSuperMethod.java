// super keyword second usage in case of method ( inheritance with method)


package projecttwopackage;

public class ParentSuperMethod {
       
// create three methods 
	
	public void m1() {
		this.m3(3, 0); // parent two parameter method 
		System.out.println(" parent  default parameter method");
	}
	
	public void m2(int a) {
		this.m1(); // parent default method
		System.out.println(" parent  one parameter method");
	}
	
	public void m3(int a , int b) {
		System.out.println(" parent  two parameter method");
	}
	
	public void m4(int a , int b , int c) {
		this.m2(3); // parent one parameter method 
		System.out.println(" parent  three parameter method");
	}
	public static void main(String[] args) {
		ParentSuperMethod obj = new ParentSuperMethod();
		obj.m4(4, 4, 4); // parent three parameter method 
	}
}
