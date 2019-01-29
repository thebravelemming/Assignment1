package edu.fsu.cs.cen5035;

/**
 * @author Javier
 */

public class Spear extends BasicWeapon implements Weapon {
    
    public Spear() {
        super(40);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
		int damage = DAMAGE - (int) (0.8 * armor);
		if (damage < 0) {
			return 0;
		}
		return damage;
    }

}
