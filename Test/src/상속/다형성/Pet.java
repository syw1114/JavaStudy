package 상속.다형성;

class Pet {
	private String name;
	private String masterName;
	
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}

	public String getName() {
		return name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void introduce() {
		System.out.println("내 이름은 " + name + "입니다");
		System.out.println("주인은 " + masterName + "입니다");
	}
}

class RobotPet extends Pet{
	
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	public void introduce() {
		System.out.println("저는 로봇입니다. 이름은 " + getName() + "입니다");
		System.out.println("주인님은" + getMasterName() + "입니다");
	}
	
	public void work(int sw) {
		switch(sw) {
		case 0 : System.out.println("청소를 합니다."); break;
		case 1 : System.out.println("빨래를 합니다."); break;
		case 2 : System.out.println("밥을 합니다."); break;
		}
	}
}
