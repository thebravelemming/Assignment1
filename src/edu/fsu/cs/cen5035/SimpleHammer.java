package edu.fsu.cs.cen5035;

/**
 * @author Derek Yohn
 * @date   28 Jan 2019
 */

public class SimpleHammer extends BasicWeapon implements Weapon {

    public SimpleHammer() {
        super(35);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
	if armor < 30 return DAMAGE;
	val = DAMAGE - armor;
	if val < 0 return 0;
	else return val;
    }

}
