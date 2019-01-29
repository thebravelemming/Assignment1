package edu.fsu.cs.cen5035;

/**
 * @author Derek Yohn
 * @date   28 January 2019
 */

public class CrazyRandomSword extends BasicWeapon implements Weapon {
    
    import java.util.concurrent.ThreadLocalRandom;
    import java.lang.Math;

    public CrazyRandomSword() {
	int min = 4;
	int max = 99;
        super(ThreadLocalRandom.current().nextInt(min, max+1));
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
		int min = 3;
		int max = Math.floor((1.0/3.0) * armor);

	    int ignore = ThreadLocalRandom.current().nextInt(min, max+1);
        float diff = (100.0 - ignore) / 100;

        int damage = DAMAGE - (int)(diff * armor);
	    if (damage < 0) {
			return 0;
		}
		return damage;
    }

}
