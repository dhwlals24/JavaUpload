package co.edu.company;

import java.util.Scanner; //스캐너 클래스 사용할 때 

import co.edu.member.Person; //다른 패키지에 있는 클래스를 사용할 때 import사용


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person p1 = new Person("123456-7890342", "홍길동");
		
		p1.info();
		
		
		
		//Manager, Programmer -> Employee를 상속 받고, getSalary를 오버라이드
		//Manager -> baseSalary + 100000
		//Programmer -> baseSalary + 200000
		
		Manager manager = new Manager();
		System.out.println("관리자의 월급 : " + manager.getSalary());
		
		Programmer prog = new Programmer();
		System.out.println("프로그래머의 월급 : " + prog.getSalary());
		
		
		
		
		//bird -> animal 상속받고 walk 메소드 재정의
		//bird.walk -> 출력문 : 헤엄을 칠 수 있다.
		Bird bird = new Bird();
		
		bird.walk();
		bird.fly();
		
		
		
		

		
	}

}
