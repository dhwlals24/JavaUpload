package co.edu.extend;

public class Computer extends Calculator {
 
	@Override
	double areaCircle(double r) {
		System.out.println("자식 클래스에서 areaCircle() 실행");
		return 3.14159 * r * r;
		
	}
}
