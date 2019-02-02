package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
		    case "sword":
                return new Sword();
		    case "spear":
            	return new Spear();
		    case "simplehammer":
     			return new SimpleHammer();
    		case "crazyrandomsword":
			    return new CrazyRandomSword();
    		case "luckydagger":
	    		return new LuckyDagger();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
