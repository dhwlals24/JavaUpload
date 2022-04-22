package co.edu.oop;

public class Main {

	public static void main(String[] args) {
		
		//자동차 객체 생성 : Car클래스의 설계도 바탕으로 new연산자 통해서 자동차 객체 만듦
//		Car myCar = new Car(); //생성자
//		
//		
//		myCar.company = "기아";
//		myCar.model = "k3";
//	    myCar.color = "white";
//	    myCar.maxSpeed = 150; //mycar라는 객체에 들어간 각각의 변수에 데이터를 넣어줌
//	    
//	    myCar.info();
//	    
//	    //생성자 통한 데이터 입력
//	    Car myCar2 = new Car("sonata", "black"); //mycar2라는 객체 만듦과 동시에 데이터 2개 넣음
//	    
//	    myCar2.info();
//	    
//	    
//	    
//	    korean k1 = new korean("박자바", "001212-1234567");
//	    k1.getInfo();
//	    
//	    korean k2 = new korean("김자바", "880101-9876123");
//		k2.getInfo();
//		
//		korean k3 = new korean("미국", "자바리","770505-3456321");
//		k3.getInfo();
		
		
		//클래스 내부에 생성자 선언 생략. 자바에서 자동으로 기본 생성자 제공해줌
		// Temp temp = new Temp();
		
		
		
		Calculator cal = new Calculator();
		
		int result = cal.plus(3,2);
		System.out.println(result);
		
		result = cal.minus(10,2);
		System.out.println(result);
		
		
		
		
		
	}

}

