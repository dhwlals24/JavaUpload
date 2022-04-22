package co.edu.casting; //상속관계에서 자동타입변환 현상 내용 .부모 메소드 내용을 재정의함

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Parent p1 = new Child(); //child에 있는 생성자를 사용해서 p1 만들것
		
		p1.method1(); //오버라이드 된거 없어서 바로 parent정보 출력
		p1.method2(); //2만 child 클래스에 있는게 나옴. child 객체 기본 생성자로 인스턴스 만들었기 때문에 오버라이드된 내용을 읽어옴
		//오버라이드되면 부모내용 말고 자식내용 사용하게됨
		p1.method3();
		// p1.method4(); //parent타입의 method4가 없기 때문에 오류남
		
		
		
		//클래스 타입 배열
		Parent p2 = new Parent();
		Parent p3 = new Parent();
		Parent p4 = new Parent(); //인스턴스 3개 만듦
		
		
		Parent[] parent = {p2,p3,p4}; //다차원 배열이랑 같은 개념
	 	                  //0  1  2 각각 주소값 가지고 있음. 각 3개의 인덱스 안에 객체 있음
		
	}

}
