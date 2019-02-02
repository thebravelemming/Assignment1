package edu.fsu.cs.cen5035;

/**
 * @author Derek Yohn
 * @date   1 February 2019
 *
 * This weapon has a low damage value, but has a chance to ignore
 * all armor and simulatenously deliver damage equal to the amount
 * of armor ignored.
 */

public class LuckyDagger extends BasicWeapon implements Weapon {
    
    import java.util.concurrent.ThreadLocalRandom;
    import java.lang.Math;

    public LuckyDagger() {
        super(5);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
		/// a 5% chance to do major damage
		int min = 1;
		int max = 20;
		int lucky = ThreadLocalRandom.current().nextInt(min, max+1);

		if (lucky == 13) {
			return Math.floor((7.0 * armor) / 3.0);
		}

		int damage = DAMAGE - armor;
		
	    if (damage < 0) {
			return 0;
		}
		return damage;
    }

}
