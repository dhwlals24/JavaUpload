package co.edu.oop;

import java.util.Scanner;

public class BankMain1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount1 bank = new BankAccount1("110-423-036277", "오지민", 100000);
		
		int menu =0;
		int money =0;
		
		while(true) {
			System.out.println("1.예금  2.출금  3.잔액 확인  4.종료");
			System.out.println("선택->");
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.println("예금액 입력->");
				money = Integer.parseInt(sc.nextLine());
				bank.in(money);
			}
			
			else if(menu == 2) {
				System.out.println("출금액 입력->");
				money = Integer.parseInt(sc.nextLine());
				bank.out(money);
			}
			
			else if(menu == 3) {
				System.out.println("잔액 확인->");
				System.out.println(bank.now() + "원 입니다.");
			}
			
			else if(menu == 4) {
				System.out.println("종료");
			}
			
			
			
			
			
		}

	}

}
