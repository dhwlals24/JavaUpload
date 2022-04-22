package co.edu.oop;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("주문 번호 입력 > ");
		int odno = Integer.parseInt(sc.nextLine());
		System.out.println("주문 상품 번호 입력 > ");
		int itno = Integer.parseInt(sc.nextLine());
		System.out.println("주문자 아이디 입력 > ");
		String id = sc.nextLine();
		System.out.println("주문자 이름 입력 > ");
		String name = sc.nextLine();
		System.out.println("배송 주소 입력 > ");
		String address = sc.nextLine();
		
		ShoppingMall eMart = new ShoppingMall(odno, itno, id, name, address);
		eMart.info();

	}

}
