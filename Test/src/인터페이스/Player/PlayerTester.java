package 인터페이스.Player;

public class PlayerTester {

	public static void main(String[] args) {
		Player[] a = new Player[2];
		a[0] = new VideoPlayer();
		a[1] = new CDPlayer();
		
		for(Player b : a) {
			b.play();
			b.stop();
			System.out.println();
		}

	}

}
