package de.tum.cit.ase;

/**
 * Interface representing teleportation capabilities.
 */
public interface Teleporting {
    int MIN_POWER = 0;
    int MAX_POWER = 100;

    void teleport();

    void setPower(int power);

    int getPower();
}
