package 인터페이스.wear;

public class TestMain {

	public static void main(String[] args) {
		Wearable[] w = {
				new WearableComputer("HAL"),
				new WarableRobot(Color.RED),
				new WarableRobot(Color.GREEN),
		};
		for(Wearable c : w) {
			c.putOn();
			c.putOff();
			System.out.println();
			
		}
	}

}
