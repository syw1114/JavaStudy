package 클래스.추상.Shape2;
/**
 * 수평직선을 나타내는 클래스입니다
 * 직선을 나타내는 추상 클래스 AbstLine으로부터 파생된 클래스.
 *
 */
public class HorzLine extends AbstLine {
	/**
	 * 수평직선을 생성하는 클래스입니다.
	 * 길이를 인수로 전달받습니다.
	 * length 생성할 직선의 길이.
	 */
	public HorzLine(int length) {
		super(length);
	}

	/**
	 * toString은 수평직선에 관한 도형 정보를 나타내는 문자열을 반환
	 */
	public String toString() {
		return "HorzLine(length:" + getLength() + ")";
	}
	
	/**
	 * draw는 수평직선을 그립니다.
	 * 그리기는 마이너스 기호 - 을 가로로 나열
	 * 길이의 개수만큼 - 를 연속 표시하고 줄 바꿈.
	 */
	public void draw() {
		for(int i = 1; i<=getLength(); i++) {
			System.out.print('-');
		}
		System.out.println();
	}
}
