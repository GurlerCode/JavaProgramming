package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * Class representing a MeteorSeal.
 */
public class MeteorSeal extends GalacticSeal implements Teleporting {
    private int power;

    public MeteorSeal(@Nullable String name, int power) {
        super(name);
        this.power = Math.min(Math.max(power, MIN_POWER), MAX_POWER);
    }

    @Override
    public void eat() {
        if (isHungry) {
            System.out.println(getName() + " the MeteorSeal eats!");
            isHungry = false;
            power = Math.min(power + 1, MAX_POWER); // Increase power
        } else {
            System.out.println(getName() + " the MeteorSeal is not hungry.");
        }
    }

    @Override
    public void teleport() {
        if (power == MIN_POWER) {
            System.out.println(getName() + " the MeteorSeal is too weak to teleport.");
            return; // Prevent duplicate output
        }

        System.out.println(getName() + " the MeteorSeal teleports!");
        isHungry = true;
        power--; // Decrease power
    }

    @Override
    public void setPower(int power) {
        this.power = Math.min(Math.max(power, MIN_POWER), MAX_POWER);
    }

    @Override
    public int getPower() {
        return power;
    }
}
