package de.tum.cit.ase;

public class Ticket {

	private boolean valid;

	/**
	 * Constructor for the Ticket class
	 *
	 * @param valid this param represents the validity of a Ticket object.
	 */
	public Ticket(boolean valid) {
		this.valid = valid;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	/**
	 * This method overrides the default toString method
	 *
	 * @return String value stating whether the ticket is valid or not.
	 */
	@Override
	public String toString() {
		return (valid ? "valid" : "invalid") + " ticket";
	}
}
