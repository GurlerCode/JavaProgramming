package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * Class representing a StarSeal.
 */
public class StarSeal extends GalacticSeal {
    public StarSeal(@Nullable String name) {
        super(name);
    }

    @Override
    public void eat() {
        if (isHungry()) {
            System.out.println(getName() + " the StarSeal eats!");
            setHungry(false);
        } else {
            System.out.println(getName() + " the StarSeal is not hungry.");
        }
    }
}
