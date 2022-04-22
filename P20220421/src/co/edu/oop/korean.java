package co.edu.oop;

public class korean {
	
	//필드
	String nation = "대한민국";
	String name;
	String ssn; //주민번호
	
	
	//생성자의 오버로딩
	public korean(String n, String s) {
		//this는 클래스 내에 선언된 필드를 콕 찝어서 사용하겠다는 용도
		this.name = n;
		this.ssn = s;
	}
	
	
	public korean(String p, String n, String s) {
		this.nation = p;
		this.name = n;
		this.ssn = s;
	}
	
	
	
	
	//메소드의 오버로딩
	void getInfo() { //void : return타입이 필요없을 때 사용
		System.out.println("국적 : " + this.nation); //this.써도 됨
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + ssn);
		return; // void + return; = 여기서 리턴은 종료하는 기능이라 오류 안 남. sysout 중간에 넣으면 오류남
		
	}

}
