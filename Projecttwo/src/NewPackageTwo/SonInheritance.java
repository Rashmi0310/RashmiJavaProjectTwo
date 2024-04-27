// single level inheritance -- Father and Son

package NewPackageTwo;

import projecttwopackage.FatherInheritance;

public class SonInheritance extends FatherInheritance {
        
	public void m3() {
		System.out.println(" Child class");
	}
	
	public static void main(String[] args) {
		SonInheritance obj = new SonInheritance();
		obj.m1();
		obj.m3();
		obj.m2();
		obj.price=456;
		System.out.println("result of price" + obj.price);
	}
}
