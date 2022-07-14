package 인터페이스.Player;

class PortablePlayerTester {

	public static void main(String[] args) {
		PortablePlayer a = new PortablePlayer();
		a.play();
		a.stop();
		a.changeSkin(Skinnable.LEOPARD);

	}

}
