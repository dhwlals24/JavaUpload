package co.edu.homework;

public class Student {
	
	
	
	// 학생 관리 프로그램 구현.
	// 관리 해야 할 학생 수 입력 후 학생 수만큼 정보 입력.
	// 학생 정보 : 학번, 이름, 국어, 수학, 영어
	// 학생 번호 입력 시, 학생의 기본 정보 및 평균 출력.
	// getter, setter 사용해서 데이터 저장

	// 추가 문제, 학생 번호 입력시, 추가적으로 평균으로 등수 출력 기능.
	// 조건 1) class를 이용하여 학생을 등록.
	// 조건 2) class에서 학생의 기본 정보 및 평균을 출력하는 메소드 사용.

	//필드
	// 학생 정보 : 학번, 이름, 국어, 수학, 영어
		int studentNo;
		String studentName;
		int kor;
		int eng;
		int math;
		

    //생성자		
		public Student (int studentNo,String studentName, int kor, int eng,int math) {
			this.eng=eng;
			this.kor =kor;
			this.studentName=studentName;
			this.studentNo=studentNo;
		}
		
		
    //메소드
		
		
		
		public int getStudentNo() {
			return studentNo;
		}


		public void setStudentNo(int studentNo) {
			this.studentNo = studentNo;
		}


		public String getStudentName() {
			return studentName;
		}


		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}


		public int getKor() {
			return kor;
		}


		public void setKor(int kor) {
			this.kor = kor;
		}


		public int getEng() {
			return eng;
		}


		public void setEng(int eng) {
			this.eng = eng;
		}


		public int getMath() {
			return math;
		}


		public void setMath(int math) {
			this.math = math;
		}


		public void showInfo() {
			 System.out.println("이름>"  + studentName );
			 System.out.println("국어점수>" + kor);
			 System.out.println("영어점수>" + eng);
			 System.out.println("수학점수>" + math);
			 System.out.println("평균점수>" );
		}


		
		
	    
		
}
