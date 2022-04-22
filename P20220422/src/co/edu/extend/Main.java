package co.edu.extend;

import java.awt.geom.Area;

public class Main {

	public static void main(String[] args) {
		
		//휴대폰
		
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("고아라폰","white", 100);
		
		//부모클래스 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.hangUp();
		
		//자식클래스 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOnDmb();
		
		
		
		//부모클래스 메소드
		dmbCellPhone.powerOff();
		
		//부모클래스 필드출력
		System.out.println(dmbCellPhone.color);
		System.out.println(dmbCellPhone.model);
		
		
		
		
		
		
		
		//계산기 부모클래스
		Calculator cal = new Calculator();
		cal.areaCircle(50);
		
		
		//계산기 자식클래스
		Computer com = new Computer();
		com.areaCircle(60);
		
	}

}
