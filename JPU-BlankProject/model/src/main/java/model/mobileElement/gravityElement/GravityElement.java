package model.mobileElement.gravityElement;

import model.mobileElement.MobileElement;


/**
 * <h1>The GravityElement Class.</h1>
 *
 * @author Gabriel RICARD
 * @version 0.1
 */
public abstract class GravityElement extends MobileElement {
	
	/**
	 * Verify if moving down is possible.
	 * 
	 * @return true if moving down is possible or false if it's not possible
	 */
	public boolean isMoveDownPossible() {
		return false;
	}
	
	/**
	 * Move the GravityElement downward if it's possible.
	 */
	public void gravityMove() {
		
	}

}
