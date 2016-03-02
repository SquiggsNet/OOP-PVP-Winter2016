
public abstract class GameCharacter {

	//Properties
	private String name;
	private int health = 100;
	
	//property procedures
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public abstract double CalcWrite();
	
	public abstract double CalcDefend();
	
}//end class
