package 문자열;

public class Tester2 {
	
	static void printStringArray(String[] s) {
		for(int i = 0; i< s.length; i++)
			System.out.println("No." + i + " = " + s[i]);
	}
	public static void main(String[] args) {
		String hands[] = {
				"가위","바위","보"
		};
		System.out.println("커맨드라인 인수");
		printStringArray(args);
		
		System.out.println("가위바위보의 손");
		printStringArray(hands);
	
	}
}
