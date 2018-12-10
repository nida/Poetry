package in.present;
/**
 * 
 */

/**
 * @author rafeen
 *
 */
class Expression extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Parameterless Constructor
	public Expression() {
	}

	// Constructor that accepts a message
	public Expression(String message) {
		super(message);
	}
}
