package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {

    	int armor = 29;

        Weapon weapon = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + weapon.hit() + " of damage.");        
        System.out.println("Swords was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        weapon = WeaponFactory.getWeapon("spear");
        System.out.println("Spear has " + weapon.hit() + " of damage.");        
        System.out.println("Spear was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //TODO: Add the remainig weapons here
		weapon = WeaponFactory.getWeapon("simplehammer");
        System.out.println("SimpleHammer has " + weapon.hit() + " of damage.");        
        System.out.println("SimpleHammer was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

		weapon = WeaponFactory.getWeapon("crazyrandomsword");
        System.out.println("CrazyRandomSword has " + weapon.hit() + " of damage.");        
        System.out.println("CrazyRandomSword was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

		weapon = WeaponFactory.getWeapon("luckydagger");
        System.out.println("LuckyDagger has " + weapon.hit() + " of damage.");        
        System.out.println("LuckyDagger was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

    }
}
