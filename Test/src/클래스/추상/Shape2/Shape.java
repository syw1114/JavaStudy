package 클래스.추상.Shape2;

public abstract class Shape {
	
	/**
	 * 도형 정보를 나타내는 문자열을 반환하는 추상 메소드.
	 * 클래스 Shape로 부터 파생되는 클래스에서 이 메소드의 본체를 구현.
	 * 이 메소드는 java.lang.Objcet의 클래스의 메소드를 추상 메소드로
	 * 오버라이드한 메소드이다. 
	 */
	
	public abstract String toString();
	
	/**
	 * 메소드 draw는 도형을 그리기 위한 추상 메소드.
	 * 클래스 Shape로부터 파생된 클래스, 이 메소드의 본체를 구현.
	 */
	public abstract void draw();
	
	/**
	 * 메소드 print는 도형 정보의 표시와 도형의 그리기를 실행한다.
	 * 구체적으로는 아래의 두 가지 과정을 순서대로 실행.
	 * Step 1. 메소드 toString이 반환하는 문자열을 표시해서 줄 바꿈,.
	 * Step 2. 메소드 draw을 호츌한 도형의 그리기.
	 */
	
	public void print() {
		System.out.println(toString());
		draw();
	}
}
