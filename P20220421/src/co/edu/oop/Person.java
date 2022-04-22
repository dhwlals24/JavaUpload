package co.edu.oop;

public class Person {

	//필드
	//1. 주민번호
	//2. 이름
	//3. 주소
	//4. 나이
	
	//생성자
	//1. 기본 생성자(필드 초기화X)
	//2. 주민번호, 이름, 주소를 매개변수로 필드초기화
	
	//메소드
	//1. introduce -> 출력 예시 "Person[name : john, age : 20]"
	
	//main 클래스 : 임의의 3명에 대한 객체 만들고 메소드 introduce 호출하여 정보 입력
	//생성자에 데이터를 바로 입력하여 객체 생성 스캐너X
	
	
	
	//필드
	String socid;
	String name;
	String adrs;
	int years;
	
	//생성자
	public Person() {
		
	} //기본 생성자. 꼭 만들어야 되는 것은 아님
	
	public Person(String socid, String name, String adrs, int years) {
		this.socid = socid;
		this.name = name;
		this.adrs = adrs;
		this.years = years;
	}
	
	//메소드
	void info() {
		System.out.println("[" + "이름:" + name + " 주민번호:" + socid + " 주소:" + adrs + " 나이:" + years + "]");
	}
	
}
