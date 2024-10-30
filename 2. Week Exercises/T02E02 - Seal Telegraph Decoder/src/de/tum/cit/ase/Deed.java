package de.tum.cit.ase;

import java.util.Date;

/**
 * Represents a good deed. Contains the date of the deed and the description of the deed, and also a custom
 * <code>toString</code> method which returns a string in the format of:<br>
 * <blockquote><pre>
 *     Good deed on <code>dateOfDeed</code>: <code>deedDescription</code>
 * </pre></blockquote>
 */
public class Deed {

    private Date dateOfDeed;
    private String deedDescription;

    /**
     * Creates a new <code>Deed</code> with the given date of the deed and the deed description
     * @param dateOfDeed a <code>Date</code> object representing the date of the deed
     * @param deedDescription a <code>String</code> with the description of the deed
     */
    public Deed(Date dateOfDeed, String deedDescription) {
        this.dateOfDeed = dateOfDeed;
        this.deedDescription = deedDescription;
    }

    public Date getDateOfDeed() {
        return dateOfDeed;
    }

    public void setDateOfDeed(Date dateOfDeed) {
        this.dateOfDeed = dateOfDeed;
    }

    public String getDeedDescription() {
        return deedDescription;
    }

    public void setDeedDescription(String deedDescription) {
        this.deedDescription = deedDescription;
    }

    /**
     * Returns a string with the format of:
     * <blockquote><pre>
     *     Good deed on <code>dateOfDeed</code>: <code>deedDescription</code>
     * </pre></blockquote>
     */
    @Override
    public String toString() {
        return "Good deed on " + dateOfDeed + ": " + deedDescription;
    }
}