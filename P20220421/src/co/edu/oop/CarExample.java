package co.edu.oop;

public class CarExample {

	public static void main(String[] args) {
		
		MyCar mycar = new MyCar();
		
		mycar.setGas(5); //매개변수가 5임
		
		boolean gasState = mycar.isLeftGas();
		if(gasState) { //가스o-> true
			System.out.println("출발합니다.");
			mycar.run(); //잔량 없을때까지 반복
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
		
		
	}
	
	static void show() { //클래스 내부에서도 메소드 어디서든 만들 수 O
		
	}

}
