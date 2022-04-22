package co.edu.getset; //getset : 정보 은닉. 정보 캡슐화. 데이터와 메소드를 캡슐화하여 보효. 마우스 우클릭으로 불러오면 편함

//getter : 사용자에 맞줘서 데이터 변환 (km 마일 등)
//setter : 

public class Car {
	
	
	//필드
	private String company; 
	private String model;
	private String color; //접근 못하게 private로 막음
	private int speed;
	
	
	//생성자
	
	
	
	
	
	//메소드
	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getSpeed() {
		// 속도 mile(미국 단위) -> km로 변환
		return speed*2;
	}



	public void setSpeed(int speed) { //스피드가 음수일때 0으로 처리해서 데이터를 객체의 인스턴트 필더에 넣어줌
		if(speed <0) {
			speed = 0;
		}
		this.speed = speed;
	}




	
	

	
	

}
