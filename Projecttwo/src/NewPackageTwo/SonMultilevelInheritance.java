// multilevel inheritance :- grandfather , fathermulti , sonmultilevel 



package NewPackageTwo;

import projecttwopackage.FatherMultiInheritance;

public class SonMultilevelInheritance extends FatherMultiInheritance {
     
	 public void m4() {
		System.out.println(" Son Multi level class one");
	}
	
	public static void main(String[] args) {
		SonMultilevelInheritance obj = new SonMultilevelInheritance();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.price=123;
		System.out.println("123");
	}
	
}
