import java.util.ArrayList;

public class Characters 
{
    final Unit[] squad = new Unit [8];
    /** Constructs a Squad object with 8 different units
      */
    public Squad ()
    {           
	// Range is minus 1, so 2 range is actually only 1
	//movement, hp, strength, range, image, attack type, 			criticalHit ratio
	squad [0] = new //job class
	squad [1] = new //job class
	squad [2] = new //job class
	squad [3] = new Unit
	squad [4] = new Unit
	squad [5] = new Unit
	squad [6] = new Unit
	squad [7] = new Unit
    }

    public String toString ()
    {
	String totalSquad = "";
	for (int squadPos = 0 ; squadPos < 5 ; squadPos++)
	    totalSquad += squadPos + ")" + "\n" + squad [squadPos] + 	"\n";
	return totalSquad;
    }


    public Unit getUnit (int unitNumber)
    {
	return squad [unitNumber];
    }
	
//
public class Unit
{
//code it to extend stats and return each class with predetermined stat values to create a team?
//

}

public Unit (int movement, int hp, int strength, int range, int image, int attackType, int criticalHit)
    {
	this.movement = movement;
	this.hp = hp;
	this.strength = strength;
	this.range = range;
	this.image = image;
	this.attackType = attackType;
	this.criticalHit = criticalHit;
    }


    /** Determines the picture and returns the values
      */
    public String toString ()
    {
	return "" + "Movement: " + movement + "   HP:  " + hp +
	    "\nStrength:  " + strength + "   Range:  " + range;
    }



    public int getMovement ()
    {
	return movement;
    }


    public int getHP ()
    {
	return hp;
    }


    public int getStrength ()
    {
	return strength;
    }


    public int getRange ()
    {
	return range;
    }


    public int getImageNumber ()
    {
	return image;
    }


    public int getAttackType ()
    {
	return attackType;
    }


    public int getCriticalHit ()
    {
	return criticalHit;
    }


    /** Add one range to a unit
      * @param rangeCheck   the num
      */
    public int addRange (int rangeCheck)
    {
	range += rangeCheck;
	return range;
    }
}
//
}
