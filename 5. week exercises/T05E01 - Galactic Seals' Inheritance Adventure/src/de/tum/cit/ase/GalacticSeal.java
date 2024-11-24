package de.tum.cit.ase;

import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * Abstract superclass for Galactic Seals.
 */
public abstract class GalacticSeal {
    public @Nullable String name;
    protected boolean isHungry;

    /**
     * Constructor for GalacticSeal.
     *
     * @param name The name of the seal (nullable).
     */
    public GalacticSeal(@Nullable String name) {
        this.name = name;
        this.isHungry = true; // Seals are hungry by default
    }

    public @Nullable String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    /**
     * Abstract method to be implemented by subclasses.
     */
    public abstract void eat();
}
