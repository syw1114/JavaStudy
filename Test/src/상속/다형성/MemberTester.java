package 상속.다형성;

public class MemberTester {

	/*
	 * 				상위(조상) Object   모든 클래스의 상위 클래스. java.lang 패키지에 속한다.
	 * 					'
	 * 					'
	 * 					'
	 * 					     Member	  Member는 Object에서 파생.  상위 클래스는 Object, SpecialMembersms 는 하위클래스.
	 * 					'
	 * 					'
	 * 					'
	 * 				하위(자손) SpecialMember  SpecialMember는 Member에서 파생.  상위 클래스는 Member.
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		//Member형 변수는 Member뿐만이 아니고 SpecialMember도 참조 가능.
		Member[] m = { 
				new Member("하나", 101, 27),
				new SpecialMember("두리", 102, 31, "회비 무료"),
				new SpecialMember("아름",103, 52, "회비 반액무료"),
		};
		for(Member k : m) {
			k.print(); // 동적 결합 : 참조되는 곳의 클래스형 메소드가 호출된다.
			System.out.println();
		}
	}

}
