package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator(); //내가만든 설계도로 객체생성
		
		
		//메소드에서 메소드 호출
		cal.execute(); //외부에서 메소드 호출
		cal.avg(10,2);
		double avg = cal.avg(10,2);
		System.out.println(avg);
		
		
		Calculator2 myCalcu = new Calculator2();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10,20);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
		
	}

}
