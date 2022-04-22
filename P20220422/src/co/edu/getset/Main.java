package co.edu.getset;

public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50); //존재하지않는 스피드임
		
		int speed = myCar.getSpeed(); //음수 안나오게 설정해뒀음
		
		System.out.println(speed); //결과 음수 안나옴
		
		
		//50 mile 속도를 넣음
		myCar.setSpeed(50);
		//50 mile -> km 변환된 값을 보고시프다
		speed = myCar.getSpeed();
		
		System.out.println(speed);

	}

}
