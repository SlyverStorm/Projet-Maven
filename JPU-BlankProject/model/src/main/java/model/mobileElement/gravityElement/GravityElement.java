package model.mobileElement.gravityElement;

import model.Sprite;
import model.State;
import model.mobileElement.MobileElement;


/**
 * <h1>The GravityElement Class.</h1>
 *
 * @author Gabriel RICARD
 * @version 0.1
 */
public abstract class GravityElement extends MobileElement {
	
	/**
	 * The GravityElement constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 * @param sprite, The sprite associated with the Element
	 * @param state, The state of the Element
	 */
	public GravityElement(final int x, final int y, Sprite sprite, State state) {
		super(x,y,sprite,state);
	}
	
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
