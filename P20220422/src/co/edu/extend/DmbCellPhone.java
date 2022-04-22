package co.edu.extend;

//자식 클래스
public class DmbCellPhone extends CellPhone{
	
	//필드
	public int channel;
	
	
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		//this.model = model;
		//this.color = color;
		super(model, color); //부모 클래스에 생성된 생성자는 super연산자를 사용해 데이터 호출
		this.channel = channel;
	}
	
	
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "Dmb 시작");
		super.powerOn(); //부모 클래스에 생성된 메소드 super 사용해 호출
	}
	void turnOffDmb() {
		System.out.println("Dmb 종료");
	}
	
	@Override //오버라이드 어노테이션 -> poweOn이라는 부모 클래스 메소드를 자식 클래스에서 호출해서 수정함
	void powerOn () {
		System.out.println("자식 클래스에서 전원읊 켭니다.");
	}
	
	

}
