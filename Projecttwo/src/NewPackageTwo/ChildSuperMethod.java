//  super keyword second usage in case of method ( inheritance with method)


package NewPackageTwo;

import projecttwopackage.ParentSuperMethod;

public class ChildSuperMethod extends ParentSuperMethod{
	
// create three methods 
	
		public void m5() {
			this.m6(2); // child one parameter method
			System.out.println(" child  default parameter method");
		}
		
		public void m6(int a) {
			super.m4(3, 3, 3); // parent three parameterized method 
			System.out.println(" child  one parameter method");
		}
		
		public void m7(int a , int b) {
			this.m5(); // child default parameter method
			System.out.println(" child  two parameter method");
		}
		
		public void m8(int a , int b , int c) {
			this.m7(1, 2); // child two parameter method 
			System.out.println(" child  three parameter method");
		}
		
// main method 
		
		public static void main(String[] args) {
// object creation and call method 
			ChildSuperMethod obj = new ChildSuperMethod	 ();
			obj.m8(4, 4, 4); // child three parameter method
		
		}

}
