
public class Unit extends stats
{
	Weapon weapon;
	public Unit (int HP, int STRENGTH, int MAGIC, int SKILL, int SPEED, int LUCK, int DEFENSE, int RESISTANCE, int MOVEMENT, Weapon weapon)
    {
		super(HP, STRENGTH, MAGIC, SKILL, SPEED, LUCK, DEFENSE, RESISTANCE, MOVEMENT);
    }
	public int getDmg()
	{
		return getStrength() + weapon.getDmg();
	}
	public Weapon getWeapon()
	{
		return weapon;
	}
	public int getLuck()
	{
		return super.getLuck() + (int) weapon.getCrit();
	}
	public int getDefLuck()
	{
		return super.getLuck();
	}
}
