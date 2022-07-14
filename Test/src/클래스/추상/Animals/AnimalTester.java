package 클래스.추상.Animals;

public class AnimalTester {

	public static void main(String[] args) {
		Animal[] a = {
				new Dog("바둑이", "삽살개"),
				new Cat("아롱이", 7),
				new Dog("백두", "진돗개")
		};
		for(Animal b : a) {
			b.introduce();
			System.out.println();
		}
	}

}
