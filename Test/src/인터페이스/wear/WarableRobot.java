package 인터페이스.wear;

public class WarableRobot implements Color,Wearable {
	private int color;
	
	public WarableRobot(int color) { changeColor(color); }
	public void  changeColor(int color) { this.color = color; }
	
	public String toString() {
		switch(color) {
		case RED : return "빨강 로봇";
		case GREEN : return "초록 로봇";
		case BLUE : return "파랑 로봇";
		}
		return "로봇";
	}
	public void putOn() {
		System.out.println(toString() + "장착!!");
	}
	public void putOff() {
		System.out.println(toString() + "해제!!");
	}
	
}
