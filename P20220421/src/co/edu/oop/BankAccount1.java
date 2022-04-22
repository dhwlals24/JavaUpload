package co.edu.oop;

public class BankAccount1 {
	
	//2. 은행 계좌
		//계좌번호, 예금주, 잔액
		//매개 변수 3개를 가지는 생성자
		//메소드
		//1. 예금 할 수 있는 메소드, 2. 출금할 수 있는 메소드, 3. 현재 잔액 확인 메소드
		
		//Main class
		// 인스턴스는 1개만, 인자 3개(입금 출금 를 가지도록 생성
		//-Scanner 이용해서 예금, 출금, 잔액 확인
		//-반복문 이용해서 1. 예금, 2.출금, 3.잔액 확인, 4. 종료
	
	
	//1.필드
	String acnum; //계좌번호
	String acname; //예금주
	int balance; //잔액
	
	
	
	//2.생성자
	public BankAccount1 (String acnum, String acname, int balance) {
		this.acnum = acnum;
		this.acname = acname;
		this.balance = balance;
	}
	
	//3.메소드
	
	//예금 메소드
	void in (int money) {
		this.balance += money;
		System.out.println("예금 후 잔액>" + balance);
		System.out.println("----------------------");
		System.out.println("예금주>" + acname);
		System.out.println("계좌 번호>" + acnum);
		System.out.println("----------------------");
	}
	
	//출금 메소드
	void out (int money) {
		this.balance -= money;
		System.out.println("출금 후 잔액>" + balance);
		System.out.println("----------------------");
		System.out.println("예금주>" + acname);
		System.out.println("계좌 번호>" + acnum);
		System.out.println("----------------------");
		
	}
	
	//잔액 확인 메소드
	int now() { //int는 반환해줄 때, void는 반환 안됨
		return balance; //그래서 이렇게 쓸 수 있음
	}
	
	

}
