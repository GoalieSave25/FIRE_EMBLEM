import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Characters 
{
    final Unit[] squad = new Unit [8];
    /** Constructs a Squad object with 8 different units
      */
    //predetermined-quicksAve
    public Characters(boolean friendly)
    {
    	if(friendly)
    	{	//myrmidon
    		squad [0] = new Unit(40, 20, 16, 23, 25, 24, 18, 20, 5, new Weapon(12, 1, 60, 0, "Silver Sword"), new ImageIcon("Chara GIFs/1.gif"), true, true, "1");
    		//mage
    		squad [1] = new Unit(35, 17, 22, 20, 23, 19, 16, 24, 5, new Weapon(8, 2, 75, 0, "Elthunder"), new ImageIcon("Chara GIFs/2.gif"), true, true, "2");
    		//thief
    		squad [2] = new Unit(35, 19, 18, 20, 24, 18, 17, 22, 5, new Weapon(7, 2, 85, 0, "Steel Dagger"), new ImageIcon("Chara GIFs/3.gif"), true, true, "3");
    		//cavalier
    		squad [3] = new Unit(40, 22, 15, 21, 20, 24, 22, 21, 7, new Weapon(10, 1, 75, 0, "Steel Lance"), new ImageIcon("Chara GIFs/4.gif"), true, true, "4");
    		//knight
    		squad [4] = new Unit(45, 24, 15, 22, 17, 22, 26, 18, 4, new Weapon(14, 1, 60, 0, "Silver Lance"), new ImageIcon("Chara GIFs/5.gif"), true, true, "5");
    		//fighter
    		squad [5] = new Unit(45, 25, 15, 23, 22, 21, 19, 18, 5, new Weapon(12, 1, 65, 0, "Steel Axe"), new ImageIcon("Chara GIFs/6.gif"), true, true, "6");
    		//mercenary
    		squad [6] = new Unit(40, 22, 15, 24, 22, 20, 21, 19, 5, new Weapon(9, 1, 85, 0, "Steel Sword"), new ImageIcon("Chara GIFs/7.gif"), true, true, "7");
    		//archer
    		squad [7] = new Unit(40, 21, 15, 23, 21, 20, 20, 17, 5, new Weapon(11, 2, 75, 0, "Steel Bow"), new ImageIcon("Chara GIFs/8.gif"), true, true, "8");
    	}
    	else
    	{	//myrmidon
    		squad [0] = new Unit(40, 20, 16, 23, 25, 24, 18, 20, 5, new Weapon(12, 1, 60, 0, "Silver Sword"), new ImageIcon("Chara GIFs/1.gif"), true, false, "1");
    		//mage
    		squad [1] = new Unit(35, 17, 22, 20, 23, 19, 16, 24, 5, new Weapon(8, 2, 75, 0, "Elthunder"), new ImageIcon("Chara GIFs/2.gif"), true, false, "2");
    		//thief
    		squad [2] = new Unit(35, 19, 18, 20, 24, 18, 17, 22, 5, new Weapon(7, 2, 85, 0, "Steel Dagger"), new ImageIcon("Chara GIFs/3.gif"), true, false, "3");
    		//cavalier
    		squad [3] = new Unit(40, 22, 15, 21, 20, 24, 22, 21, 7, new Weapon(10, 1, 75, 0, "Steel Lance"), new ImageIcon("Chara GIFs/4.gif"), true, false, "4");
    		//knight
    		squad [4] = new Unit(45, 24, 15, 22, 17, 22, 26, 18, 4, new Weapon(14, 1, 60, 0, "Silver Lance"), new ImageIcon("Chara GIFs/5.gif"), true, false, "5");
    		//fighter
    		squad [5] = new Unit(45, 25, 15, 23, 22, 21, 19, 18, 5, new Weapon(12, 1, 65, 0, "Steel Axe"), new ImageIcon("Chara GIFs/6.gif"), true, false, "6");
    		//mercenary
    		squad [6] = new Unit(40, 22, 15, 24, 22, 20, 21, 19, 5, new Weapon(9, 1, 85, 0, "Steel Sword"), new ImageIcon("Chara GIFs/7.gif"), true, false, "7");
    		//archer
    		squad [7] = new Unit(40, 21, 15, 23, 21, 20, 20, 17, 5, new Weapon(11, 2, 75, 0, "Steel Bow"), new ImageIcon("Chara GIFs/8.gif"), true, false, "8");
    	}
    }
    
    //undetermined-custom
    public Characters(Unit unit0, Unit unit1, Unit unit2, Unit unit3, Unit unit4, Unit unit5, Unit unit6, Unit unit7)
    {           
	// Range is minus 1, so 2 range is actually only 1
	//movement, hp, strength, range, image, attack type, 			criticalHit ratio
    	squad [0] = unit0;
    	squad [1] = unit1;
    	squad [2] = unit2;
		squad [3] = unit3;
		squad [4] = unit4;
		squad [5] = unit5;
		squad [6] = unit6;
		squad [7] = unit7;
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
}
