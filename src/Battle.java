
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
		int totHit = 0;
		int hit = (int) (attack.getSkill() * 2 + getWeaponTriangleHit(attack.getWeapon(), defend.getWeapon()) + attack.getLuck());
		int evade = defend.getSpeed() * 2 + defend.getDefLuck();
		totHit = hit - evade;
		if(totHit > 100)
			totHit = 100;
		int randHit = (int) (Math.random() * 99);
		if(randHit < totHit)
			return 0;
		int damage = 0;
<<<<<<< HEAD
		int crit = getCritChance(attack, defend);
		int randCrit = (int) (Math.random() * 99);
		int weaponDamage = attack.getWeapon().getDmg() + getWeaponTriangleDamage(attack.getWeapon(),  defend.getWeapon());
		if(!attack.getWeapon().getName().contains("thunder"))
			damage = attack.getStrength() + weaponDamage - defend.getDefense();
		else
			damage = attack.getMagic() + weaponDamage - defend.getResistance();
		if(damage < 0)
			damage = 0;
=======
		int crit = getCritChance(attack, defend, attack.getWeapon());
		int randCrit = (int) (Math.random() * 100 - 1);
		int weaponDamage = attack.getWeapon().getDmg() + getWeaponTriangleDamage(attack.getWeapon(),  defend.getWeapon());
		damage = attack.getStrength() + weaponDamage - defend.getDefense();
>>>>>>> origin/master
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
		if((offense.getName().contains("thunder") || offense.getName().contains("Sword")) && (defense.getName().contains("Lance") || defense.getName().contains("Dagger")))
			return offense.getAcc() - offense.getAcc() * .1;
		else if((offense.getName().contains("Lance") || offense.getName().contains("Dagger")) && (defense.getName().contains("Axe") || defense.getName().contains("Bow")))
			return offense.getAcc() - offense.getAcc() * .1;
		else if((offense.getName().contains("Axe") || offense.getName().contains("Bow")) && (defense.getName().contains("thunder") || defense.getName().contains("Sword")))
			return offense.getAcc() - offense.getAcc() * .1;
		else if((offense.getName().contains("Axe") || offense.getName().contains("Bow")) && (defense.getName().contains("Axe") || defense.getName().contains("Bow")))
			return offense.getAcc();	
		else if((offense.getName().contains("thunder") || offense.getName().contains("Sword")) && (defense.getName().contains("thunder") || defense.getName().contains("Sword")))
			return offense.getAcc();	
		else if((offense.getName().contains("Lance") || offense.getName().contains("Dagger")) && (defense.getName().contains("Lance") || defense.getName().contains("Dagger")))
			return offense.getAcc();	
		return offense.getAcc() + offense.getAcc() * .1;
	}
	public int getWeaponTriangleDamage(Weapon offense, Weapon defense)
	{
		if((offense.getName().contains("thunder") || offense.getName().contains("Sword")) && (defense.getName().contains("Lance") || defense.getName().contains("Dagger")))
			return offense.getDmg() - 1;
		else if((offense.getName().contains("Lance") || offense.getName().contains("Dagger")) && (defense.getName().contains("Axe") || defense.getName().contains("Bow")))
			return offense.getDmg() - 1;
		else if((offense.getName().contains("Axe") || offense.getName().contains("Bow")) && (defense.getName().contains("thunder") || defense.getName().contains("Sword")))
			return offense.getDmg() - 1;
		else if((offense.getName().contains("Axe") || offense.getName().contains("Bow")) && (defense.getName().contains("Axe") || defense.getName().contains("Bow")))
			return offense.getDmg();	
		else if((offense.getName().contains("thunder") || offense.getName().contains("Sword")) && (defense.getName().contains("thunder") || defense.getName().contains("Sword")))
			return offense.getDmg();	
		else if((offense.getName().contains("Lance") || offense.getName().contains("Dagger")) && (defense.getName().contains("Lance") || defense.getName().contains("Dagger")))
			return offense.getDmg();	
		return offense.getDmg() + 1;
	}
}
/*
 * system("pause");
 * return 0;
 * */
