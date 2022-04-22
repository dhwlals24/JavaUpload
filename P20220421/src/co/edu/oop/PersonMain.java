package co.edu.oop;

public class PersonMain {

	public static void main(String[] args) {
		
		Person per = new Person();
		
		per.socid = "910113-1110824";
		per.name = "john";
		per.adrs = "daegu";
		per.years = 20;
		per.info();
		
		Person per2 = new Person("990619-2364344", "kim", "seoul", 40);
		per2.info();
		
		Person per3 = new Person("890323-1466445", "Tom", "newyork", 35);
		per3.info();
		
		System.out.println();

	}

}
