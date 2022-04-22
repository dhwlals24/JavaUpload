
package co.edu.oop;

public class MyCar {
	
	//필드
	// String 스트링 데이터 타입도 클래스라서 대문자. 변수랑 클래스 구분하기 위함
	
	int gas;
	
	
	//생성자
	
	
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() { //남은가스
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; //boolean 타입이기 때문에 true of false. false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; //true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) { //연료 있을때
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				return; //메소드 실행 종료
			}
		}
	}
 }
