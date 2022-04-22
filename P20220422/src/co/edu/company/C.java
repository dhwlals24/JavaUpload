package co.edu.company;

import co.edu.ess.A;

public class C extends A { //자식 클래스가 부모 클래스 상속받을 때 extends사용

	public static void main(String[] args) {
		
		A a = new A(); //
		int temp;
		//public
		temp = a.b; //b밖에 안나옴. 퍼블릭이라서
		
		//protected
		C c = new C();
		int d = c.c; //A클래스에 protected로 지정된 c를 extend로 상속받아서 사용 가능 (자식 클래스)

	}

}
