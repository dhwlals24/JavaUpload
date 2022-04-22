package co.edu.homework;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		

		Student s1 = new Student(0, null, 0, 0, 0);
		
		
		int menu = 0;
		int stdnum = 0;
	
		
		
		while(true) {
			System.out.println("==========================================================");
			System.out.println("1. 학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
			System.out.println("==========================================================");
			System.out.println("선택>");
		    menu = Integer.parseInt(sc.nextLine());
		    
		    if(menu == 1) {
		    	System.out.println("학생 수>");
		    	stdnum = Integer.parseInt(sc.nextLine());
		    	
		    }
		
		
		}

	}

}
