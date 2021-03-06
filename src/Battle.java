
public class Battle 
{
	private Unit attack, defend;
	private BattleGraphics battleGraphics;
	private String send = "";
	public Battle(Unit attack, Unit defend)
	{
		this.attack = attack;
		this.defend = defend;
		battleGraphics = new BattleGraphics(this);
		battleGraphics.setVisible(true);
	}
	public Unit getAttacker()
	{
		return attack;
	}
	public Unit getDefender()
	{
		return defend;
	}
	public void battle()
	{
		attack();
		if(defend.getHP() > 0)
		{
			if(attack.getWeapon().getRng() == defend.getWeapon().getRng())
				counterAttack();
			if(attack.getHP() > 0)
			{	
				if(attack.getSpeed() >= defend.getSpeed() + 5)
					attack();
				if(defend.getHP() <= 0)
				{
					send += "Defeneder was KOed!";
				}
			}
			else
			{
				send += "Attacker was KOed!";
			}
		}
		else
			send += "Defender was KOed!";
		battleGraphics.textArea(send);
		send = "";
	}
	public void attack()
	{
		int damageDealt = getDamage(attack, defend);
		send += "Attacker did " + damageDealt + " DMG to Defender!\n";
		defend.looseHP(damageDealt);
	}
	public void counterAttack()
	{
		int damageDealt = getDamage(attack, defend);
		send += "Defender did " + damageDealt + " DMG to Attacker!\n";
		attack.looseHP(damageDealt);
	}
	public int getDamage(Unit attacker, Unit defender)
	{	
		int hit = (int) (attacker.getSkill() + getWeaponTriangleHit(attacker.getWeapon(), defender.getWeapon()) - (defender.getSpeed() + defender.getLuck()));
		if(hit > 100)
			hit = 100;
		int randHit = (int) (Math.random() * 99);
		if(randHit < hit)
			return 0;
		int damage = 0;
		int crit = getCritChance(attacker, defender);
		int randCrit = (int) (Math.random() * 99);
		int weaponDamage = attacker.getWeapon().getDmg() + getWeaponTriangleDamage(attacker.getWeapon(),  defender.getWeapon());
		if(!attacker.getWeapon().getName().contains("thunder"))
			damage = attacker.getStrength() + weaponDamage - defender.getDefense();
		else
		{
			damage = attacker.getMagic() + weaponDamage - defender.getDefense();
		}
		if(randCrit < crit)
		{
			send += "CRIT\n";
			damage *= 3;	
		}
		return damage;
	}
	public int getCritChance(Unit atk, Unit def)
	{
		int critChance = (int) (atk.getLuck() - def.getLuck());
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
		else if((offense.getName().contains("thunder") || offense.getName().contains("Sword")) && (defense.getName().contains("thunder") || defense.getName().contains("Sword")))
			return offense.getAcc();
		else if((offense.getName().contains("Lance") || offense.getName().contains("Dagger")) && (defense.getName().contains("Lance") || defense.getName().contains("Dagger")))
			return offense.getAcc();
		else if((offense.getName().contains("Axe") || offense.getName().contains("Bow")) && (defense.getName().contains("Axe") || defense.getName().contains("Bow")))
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
		else if((offense.getName().contains("thunder") || offense.getName().contains("Sword")) && (defense.getName().contains("thunder") || defense.getName().contains("Sword")))
			return offense.getDmg();
		else if((offense.getName().contains("Lance") || offense.getName().contains("Dagger")) && (defense.getName().contains("Lance") || defense.getName().contains("Dagger")))
			return offense.getDmg();
		else if((offense.getName().contains("Axe") || offense.getName().contains("Bow")) && (defense.getName().contains("Axe") || defense.getName().contains("Bow")))
			return offense.getDmg();
		return offense.getDmg() + 1;
	}
}

/*
 * system("pause");
 * return 0;
 * */
