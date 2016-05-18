
public class Battle 
{
	private Unit attack, defend;
	public Battle(Unit attack, Unit defend)
	{
		this.attack = attack;
		this.defend = defend;
	}
	public void attack()
	{
		
	}
	public void counterAttack()
	{
		
	}
	public int getDamage()
	{	
		int hit = (int) (attack.getSkill() + getWeaponTriangleHit(attack.getWeapon(), defend.getWeapon()) - (defend.getSpeed() + defend.getLuck()));
		if(hit > 100)
			hit = 100;
		int randHit = (int) (Math.random() * 100 - 1);
		if(randHit < hit)
			return 0;
		int damage = 0;
		int crit = getCritChance(attack, defend, attack.getWeapon());
		int randCrit = (int) (Math.random() * 100 - 1);
		int weaponDamage = attack.getWeapon().getDmg() + getWeaponTriangleDamage(attack.getWeapon(),  defend.getWeapon());
		damage = attack.getStrength() + weaponDamage - defend.getDefense();
		if(randCrit < crit)
			damage *= 3;		
		return damage;
	}
	public int getCritChance(Unit atk, Unit def, Weapon weapon)
	{
		int critChance = (int) (atk.getLuck() + weapon.getCrit() - def.getLuck());
		if(critChance < 0)
			critChance = 0;
		return critChance;
	}
	public double getWeaponTriangleHit(Weapon offense, Weapon defense)
	{
		if(offense.getName().contains("Sword") && defense.getName().contains("Lance"))
			return offense.getAcc() - offense.getAcc() * .1;
		else if(offense.getName().contains("Lance") && defense.getName().contains("Axe"))
			return offense.getAcc() - offense.getAcc() * .1;
		else if(offense.getName().contains("Axe") && defense.getName().contains("Sword"))
			return offense.getAcc() - offense.getAcc() * .1;
		else if(offense.getName().contains("Bow") || defense.getName().contains("Bow"))
			return offense.getAcc();
		else if(offense.getName().contains("Tome") || defense.getName().contains("Tome"))
			return offense.getAcc();
		return offense.getAcc() + offense.getAcc() * .1;
	}
	public int getWeaponTriangleDamage(Weapon offense, Weapon defense)
	{
		if(offense.getName().contains("Sword") && defense.getName().contains("Lance"))
			return offense.getDmg() - 1;
		else if(offense.getName().contains("Lance") && defense.getName().contains("Axe"))
			return offense.getDmg() - 1;
		else if(offense.getName().contains("Axe") && defense.getName().contains("Sword"))
			return offense.getDmg() - 1;
		else if(offense.getName().contains("Bow") || defense.getName().contains("Bow"))
			return offense.getDmg();
		else if(offense.getName().contains("Tome") || defense.getName().contains("Tome"))
			return offense.getDmg();
		return offense.getDmg() + 1;
	}
}
/*
 * system("pause");
 * return 0;
 * */
