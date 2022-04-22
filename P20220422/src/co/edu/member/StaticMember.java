package co.edu.member;

public class StaticMember {

	static double PI = 3.14159; //스태틱 사용하는 경우 : 클래스에 어떤 데이터가 들어가는지 바로 정의. 변하지 않는 값일때 편리. 메모리 줄일 수 있음
	
	int a;
	
	static int plus(int x, int y) {
		StaticMember sm = new StaticMember(); //클래스 인스턴스화 한 후에
		return x+y+sm.a; //이렇게 a호출해야함
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
}
