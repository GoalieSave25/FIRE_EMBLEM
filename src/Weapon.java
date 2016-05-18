
public class Weapon
{
	// Private Field Declarations
	private int dmg = 0;
	private int rng = 0;
	private double acc = 0;
	private double crit = 0;
	private String name = "";
	
	// Constructor
	public Weapon(int DMG, int RNG, double ACC, double CRIT, String NAME)
	{
		this.dmg = DMG;
		this.rng = RNG;
		this.acc = ACC;
		this.crit = CRIT;
		this.name = NAME;
	}
	
	// Methods
	public int getDmg()
	{
		return dmg;
	}

	public int getRng()
	{
		return rng;
	}
	
	public double getAcc()
	{
		return acc;
	}
	
	public double getCrit()
	{
		return crit;
	}
	
	public String getName()
	{
		return name;
	}
}
