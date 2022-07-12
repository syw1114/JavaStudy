package 클래스.추상.Shape2;

/**
 * 클래스 AbstLine은 직선을 나타내는 추상클래스
 * 이 클래스는 도형을 나타내는 추상 클래스 Shape로 부터 파생된 클래스입니다.
 * 추상 클래스이기 때문에 이 클래스의 인스턴스를 생성할 수는 없습니다.
 * 구체적인 직선 클래스는 이 클래스로부터 파생됩니다.
 * @author seoyeong-u
 *
 */

public abstract class AbstLine extends Shape{
	/**
	 * 직선의 길이를 나타내는 int형 필드입니다.
	 */
	private int length;
	
	/**
	 * 직선을 생성하는 생성자
	 * 길이를 인수로 전달받음
	 * length 생성할 직선의 길이.
	 */
	public AbstLine(int length) {
		setLength(length);
	}
	
	/**
	 * 직선의 길이를 취득
	 * @return 직선의 길
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * 직선의 길이를 설정
	 */
	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		return "AbstLine [length=" + length + "]";
	}
	
}
