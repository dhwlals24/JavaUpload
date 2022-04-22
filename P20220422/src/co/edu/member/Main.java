package co.edu.member;

public class Main {

	public static void main(String[] args) {
		
		//이 과정 생략 -> StaticMember sm = new StaticMember();
		
		double pi = StaticMember.PI;
		System.out.println(pi);
		
		int sum = StaticMember.plus(5,10);
		System.out.println(sum);
		
		int minus = StaticMember.minus(10,5);
		System.out.println(minus);
		
		Pizza p1 = new Pizza("Super Suprme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni"); //각각 다른 인스턴스화 3개
		
		int sales = Pizza.count; //생성자를 사용할때마다 구문 내용(count++) 실행됨 위에거 3번 실행.
		
		System.out.println("판매된 피자 갯수 : " + sales);
		
		
		
		
		//싱글톤
		Singleton obj1 = Singleton.getInstace(); //싱글톤 클래스의 정적 메소드 호출
		Singleton obj2 = Singleton.getInstace();
		
		if (obj1 == obj2) { //똑같은 주소 번지를 가지고 있음을 확인가능. 주소 출력해보니 똑같음
			System.out.println("하나의 싱글톤 객체입니다.");
		}
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		
		//사람 파이널
		Person p4 = new Person("123456-7892345", "홍길동");
		System.out.println(p4.nation + "," + p4.ssn + "," + p4.name);
		//p4.nation = "USA"; //nation은 인스턴스화 할때 파이널 필드로 지정되었기 때문에 접근 못함. 		
		
		
		//지구 정적 + 파이널
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS );
		System.out.println("지구의 표면적 : " + Earth.EARTH_ARIA);
		
	}

}
