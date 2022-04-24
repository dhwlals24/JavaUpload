package co.edu.homework;

//import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu = 0;
		int stdnum =0;
		
		Student[] std = new Student[stdnum];
		


		while (true) {

			System.out.println("==========================================================");
			System.out.println("1.학생수 입력 | 2.학생정보입력 | 3.학생정보출력 | 4.순위 | 5.종료");
			System.out.println("==========================================================");
			System.out.println("항목선택>");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.println("학생수>");
				stdnum = Integer.parseInt(sc.nextLine());
			}
			

			else if (menu == 2) {
				
				
				for (int i = 0; i < stdnum +1; i++) {

					System.out.println(i + "번째 학생");
					
					System.out.println("학번, 이름, 국어점수, 영어점수, 수학점수 입력>");
					int xstudentNo = Integer.parseInt(sc.nextLine());
					
					//System.out.println("이름>");
					String xstudentName = sc.nextLine();
					

					//System.out.println("국어점수>");
					int xkor = Integer.parseInt(sc.nextLine());
					

					//System.out.println("영어점수>");
					int xeng = Integer.parseInt(sc.nextLine());
					

					//System.out.println("수학점수>");
					int xmath = Integer.parseInt(sc.nextLine());
					
					std[i] = new Student(xstudentNo,xstudentName,xkor,xeng,xmath);
						

					//System.out.println("저장되었습니다.");

				}
				
				System.out.println("저장되었습니다.");

				// continue;

			}

			else if (menu == 3) {

				System.out.println("학번입력>");
				int searchNo = Integer.parseInt(sc.nextLine());
				

				
				boolean test = true;
				
				for (int i = 0; i < std.length +1 ; i++) {	
				
					if (searchNo == std[i].studentNo) {
						std[i].showInfo();
						test=true;
						break;
						
					} else {
						test = false;
					}
	
				}

			
			}

		}
	}
	
}

