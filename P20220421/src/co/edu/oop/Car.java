package co.edu.oop;

public class Car {
    //필드 (속성)
	String company; //null
	String model;
	String color;
	int maxSpeed; //0
	
	//생성자 (객체 초기화)
    public Car() { //데이터 안 들어간 생성자
    	
    }
    
    public Car(String a, String b) { //생성자 이름 같아도 뒤에 들어오는 데이터에 따라 여러개 만들 수 있음
    	this.model = a; //this : 클래스 안에 존재하는 변수model에다가 밖에서 생성한  model을 넣어줌. 둘이 다른거
    	this.color = b;
    }
    
    public Car(String a) {
    	this.model  = a;
    }
    
    
	
	//메소드 (기능)
	void info() {
		System.out.println("회사 : " + company);
		System.out.println("차종 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최대속도 : " + maxSpeed);
		
		
	}
	
	
}
