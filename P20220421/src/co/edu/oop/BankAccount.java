package co.edu.oop;

public class BankAccount {
	
	//2. 은행 계좌
	//계좌번호, 예금주, 잔액
	//매개 변수 3개를 가지는 생성자
	//메소드
	//1. 예금 할 수 있는 메소드, 2. 출금할 수 있는 메소드, 3. 현재 잔액 확인 메소드
	
	//Main class
	// 인스턴스는 1개만, 인자 3개(입금 출금 를 가지도록 생성
	//-Scanner 이용해서 예금, 출금, 잔액 확인
	//-반복문 이용해서 1. 예금, 2.출금, 3.잔액 확인, 4. 종료
	
	
	//필드
	String account; //계좌번호
	String name; //이름
	int balance; //잔액
	
	//생성자
	public BankAccount(String account, String name, int balance) {
		this.account = account;
		this.name = name;
		this.balance = balance;
	}
	
	//메소드
	void deposit(int money) { //예금 메소드
		this.balance += money; //잔고 + 입력된 값 계산
		System.out.println("계좌 번호> "+ this.account);
		System.out.println("예금주> " + this.name);
		System.out.println("예금 후 잔액> " + this.balance);
	}
	
	void withDraw(int money) { //출금 메소드
		this.balance -= money; //잔고 - 입력된 값 계산
		System.out.println("계좌 번호> "+ this.account);
		System.out.println("예금주> " + this.name);
		System.out.println("출금 후 잔액> " + this.balance); //세가지 정보 다시 내보내줌
	}
	
	int nowMoney() { //현재 잔액
		return balance;
	}
	
	
}
