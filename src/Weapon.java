
public class Weapon
{
	static int dmg = 0;
	static int rng = 0;
	static double acc = 0;
	static double crit = 0;
	static String name = "";
	
	public Weapon(int dmg, int rng, double acc, double crit, String name)
	{
		this.dmg = dmg;
		this.rng = rng;
		this.acc = acc;
		this.crit = crit;
		this.name = name;
	}
	
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
