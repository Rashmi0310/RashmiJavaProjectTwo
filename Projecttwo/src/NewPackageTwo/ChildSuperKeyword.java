// first super keyword usage in case of inheritance with constructor

package NewPackageTwo;

import projecttwopackage.ParentSuperKeyword;

public class ChildSuperKeyword extends ParentSuperKeyword {
	
	public ChildSuperKeyword() {
		this(2,4); // two child parameterized constructor
		System.out.println("Child Default Constructor");
	}
	
	public ChildSuperKeyword(int a) {
		this(); // default
		System.out.println("Child one parameterized Constructor");
		
	}
	
	public ChildSuperKeyword(int a , int b) {
		super(2); // one parent parameterized constructor
		
		System.out.println("Child two parameterized Constructor");
	}
	
	public ChildSuperKeyword(int a , int b , int c) {
		this(3); // one child parameter constructor
		System.out.println("Child three parameterized Constructor");
	}
	
	public static void main(String[] args) {
		ChildSuperKeyword obj= new ChildSuperKeyword(5,6,7);// three child parameter constructor
		
	}

}
