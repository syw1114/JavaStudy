package 클래스.추상.Shape2;
/**
 * 클래스 VirtLine은 수직진선을 나타내는 클래스
 * 이 클래스는 직선을 나타내는 추상 클래스 AbstLin로부터 파생된 클래스.
 * @author seoyeong-u
 *
 */
public class VirtLine extends AbstLine {
	
	public VirtLine(int length) {
		super(length);
	}

	public String toString() {
		return "VirtLine(length: " + getLength() + ")";
	}

	public void draw() {
		for(int i = 1; i<= getLength(); i++) {
			System.out.println('|');
		}
	}
	
}
