package co.edu.oop;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount bank = new BankAccount("110-423-4543", "오지민", 500000);
		
		int menu =0;
		int money =0;
		
		while(true) {
			System.out.println("1.예금   2.출금   3.잔액 확인   4.종료");
			System.out.println("선택> "); //여기까지 처음 나오는 화면, 되돌아오는 화면 (트루)
			menu = Integer.parseInt(sc.nextLine()); //여기서 입력한 숫자는 돈이 아니라 메뉴 순서
			
			if(menu==1) {
				System.out.println("예금액> ");
				money = Integer.parseInt(sc.nextLine()); //여기서 입력한 숫자는 돈
				bank.deposit(money); //입력한 돈 예금 메소드로
				
			} else if(menu==2) {
				System.out.println("출금액> ");
				money = Integer.parseInt(sc.nextLine());
				bank.withDraw(money); //입력한 돈 출금 메소드로
				
			} else if(menu==3) {
				System.out.println("잔액 확인> ");
				System.out.println(bank.nowMoney() + "원 입니다.");
				
			} else if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}
		

	}

}
