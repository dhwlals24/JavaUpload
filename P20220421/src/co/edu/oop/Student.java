package co.edu.oop;

public class Student {
	
	// 1명 관리 학생 관리 프로그램
		// 학생 정보 : 학번, 이름, 국어, 수학, 영어
		// 기본 생성자를 통한 인스턴스만들고, 인스턴스에 데이터 입력.
		// 1. 학생의 기본 정보 출력(학번, 이름, 국어, 수학, 영어)
		// 2. 학생의 점수 평균 출력(국어, 수학, 영어)
		
		//1. 필드
		int sdno;
		String name;
		int korsc;
		int matsc;
		int engsc;
		
		//2. 생성자
		
		public Student(int sdno, String name, int korsc, int matsc, int engsc) {
			this.sdno = sdno;
			this.engsc = engsc;
			this.korsc = korsc;
			this.matsc = matsc;
			this.name = name;
		}
		
		
		//3. 메소드
		
		void info() {
			System.out.println("학번:" + sdno + "  이름:" + name + "  국어점수:" + korsc + "  수학점수:" + matsc + "  영어점수:" + engsc); 
			System.out.println("-----------------------------------------------------------");
		}
		
		void avg() {
			int sum = (((int) engsc + korsc + matsc)/3);
			System.out.println("평균 " + sum + "점");
			System.out.println("-----------------------------------------------------------");
		}
	

}