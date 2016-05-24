public class Stats {
	
	// Private Field Declarations
	private int HPMAX = 0;
	private int HP = 0;
	private int STRENGTH = 0;
	private int MAGIC = 0;
	private int SKILL = 0;
	private int SPEED = 0;
	private int LUCK = 0;
	private int DEFENSE = 0;
	private int RESISTANCE = 0;
	private int MOVEMENT = 0;
	
	// Constructor
	public Stats(int HP, int STRENGTH, int MAGIC, int SKILL, int SPEED, int LUCK, int DEFENSE, int RESISTANCE, int MOVEMENT) {
		this.HPMAX = HP;
		this.HP = HP;
		this.STRENGTH = STRENGTH;
		this.MAGIC = MAGIC;
		this.SKILL = SKILL;
		this.SPEED = SPEED;
		this.LUCK = LUCK;
		this.DEFENSE = DEFENSE;
		this.RESISTANCE = RESISTANCE;
		this.MOVEMENT = MOVEMENT;
	}
	
	// Methods
	public void looseHP(int HP) {
		this.HP -= HP;
	}
	public void setHP(int HP) {
		this.HP = HP;
	}
	public int getHP() {
		return HP;
	}
	public int getStrength() {
		return STRENGTH;
	}
	public int getMagic() {
		return MAGIC;
	}
	public int getSkill() {
		return SKILL;
	}
	public int getSpeed() {
		return SPEED;
	}
	public int getLuck() {
		return LUCK;
	}
	public int getDefense() {
		return DEFENSE;
	}
	public int getResistance() {
		return RESISTANCE;
	}
	public int getMovement() {
		return MOVEMENT;
	}
}
