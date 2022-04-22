package co.edu.oop;

public class ShoppingMall {
	
	//필드
	int odno;
	int itno;
	String id;
	String name;
	String address;
	
	//생성자
	public ShoppingMall(int odno, int itno, String id, String name, String adress) {
		super();
		this.odno = odno; //매개변수와 필드명 동일할 때 인스턴스 필드 (파란거) 명확히 하기위해 this 사용
		this.itno = itno;
		this.id = id;
		this.name = name;
		this.address = adress;
	}

	
	
	//메소드
	void info() {
		System.out.println("주문 번호 : " + odno);
		System.out.println("주문 상품 번호 : " + itno);
		System.out.println("주문자 아이디 : " + id);
		System.out.println("주문자 이름 : " + name);
		System.out.println("배송 주소 : " + address);
		
	}


}
