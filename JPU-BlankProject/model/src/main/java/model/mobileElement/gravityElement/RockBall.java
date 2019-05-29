package model.mobileElement.gravityElement;

import model.Sprite;
import model.State;


/**
 * <h1>The RockBall Class.</h1>
 *
 * @author Gabriel RICARD
 * @version 0.1
 */
public class RockBall extends GravityElement {
	
	
	/**
	 * The State preset for a RockBall Element.
	 */
	private static State state = State.UNBREAKABLE;
	
	/**
	 * The Sprite preset for a Rockball Element.
	 */
	private static Sprite sprite;
	
	/**
	 * The RockBall constructor.
	 * 
	 * @param x, The sprite associated with the Element
	 * @param y, The state of the Element
	 */
	public RockBall(final int x, final int y) {
		super(x,y,sprite,state);
	}
}
