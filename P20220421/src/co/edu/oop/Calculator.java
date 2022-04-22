package co.edu.oop;

public class Calculator {

	//필드
	
	//생성자
	
	//메소드
	
	void execute() {
		powerOn();
	}

	double avg(int x, int y) {
		int sum = plus(x, y); //플러스 실행해서 sum에 결과 담음
		double result = (double) sum/2;
		return result;
	}
	
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	int plus(int x, int y) { //()안에 메인에서 3과 2 데이터 들어옴. 3과 2를 받을 수 있는 데이터 타입 선언하는 부분임. "매개변수"
		int result = x+y;
		return result; // result에 값을 넣어주면 return이 연산된 결과물을 다시 돌려줌 (단 데이터 타입이 서로 같아야함)
	}
	
	int minus(int x, int y) {
		int result = x-y;
	    return result;
	}
	
}
