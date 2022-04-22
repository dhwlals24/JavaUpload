package co.edu.member;

public class Singleton {
	
	
	//필드
	private static Singleton singleton = new Singleton(); //하나의 객체 생성. 프라이빗으로 선언되면 메인 클래스에서 사용불가. 싱글톤 안에서만 사용 가능
	
	//생성자
	private Singleton() { 
		
	}
	
	
	//정적 메소드
	static Singleton getInstace() { 
		if(singleton == null) { //만약 비어있을 때는 싱글톤이라는 필드 만들라는 예외처리
			singleton = new Singleton();
		}
		return singleton; //프라이빗 안적혀있음. 싱글톤 타입 객체를 반환
	}
	
	
}
