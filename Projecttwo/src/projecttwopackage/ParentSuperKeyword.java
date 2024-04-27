// first super keyword usage in case of inheritance with constructor


package projecttwopackage;

public class ParentSuperKeyword {
	
	public ParentSuperKeyword() {
		this(6,8,9); // three
		System.out.println("Parent Default Constructor");
	}
 
	public ParentSuperKeyword(int a) {
		this(5,6); // two parent 
		System.out.println("Parent one parameterized Constructor");
	}
	
	public ParentSuperKeyword(int a , int b) {
		this(); // default 
		System.out.println("Parent two parameterized Constructor");
	}
	
	public ParentSuperKeyword(int a , int b , int c ) {
		
		System.out.println("Parent three parameterized Constructor");
		
	}
	public static void main(String[] args) {
		ParentSuperKeyword obj = new ParentSuperKeyword(5);// one parent
		
	}
}
