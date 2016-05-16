import java.util.ArrayList;

public class Characters 
{
    final Unit[] squad = new Unit [8];
    /** Constructs a Squad object with 8 different units
      */
    //predetermined-quicksAve
    public Characters()
    {           
	// Range is minus 1, so 2 range is actually only 1
	//movement, hp, strength, range, image, attack type, 			criticalHit ratio
    	squad [0] = new Unit(0, 0, 0, 0, 0, 0, 0, 0, 0);
    	squad [1] = new Unit(0, 0, 0, 0, 0, 0, 0, 0, 0);
    	squad [2] = new Unit(0, 0, 0, 0, 0, 0, 0, 0, 0);
		squad [3] = new Unit(0, 0, 0, 0, 0, 0, 0, 0, 0);
		squad [4] = new Unit(0, 0, 0, 0, 0, 0, 0, 0, 0);
		squad [5] = new Unit(0, 0, 0, 0, 0, 0, 0, 0, 0);
		squad [6] = new Unit(0, 0, 0, 0, 0, 0, 0, 0, 0);
		squad [7] = new Unit(0, 0, 0, 0, 0, 0, 0, 0, 0);
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
