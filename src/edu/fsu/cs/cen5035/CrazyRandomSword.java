package edu.fsu.cs.cen5035;

/**
 * @author Derek Yohn
 * @date   28 January 2019
 */

import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;


public class CrazyRandomSword extends BasicWeapon implements Weapon {
    

    public CrazyRandomSword() {
        super(ThreadLocalRandom.current().nextInt(4, 100));
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
		int min = 3;
		int max = (int)Math.floor((1.0/3.0) * armor);

	    int ignore = ThreadLocalRandom.current().nextInt(min, max+1);
        double diff = (100.0 - ignore) / 100;

        int damage = DAMAGE - (int)(diff * armor);
	    if (damage < 0) {
			return 0;
		}
		return damage;
    }

}
