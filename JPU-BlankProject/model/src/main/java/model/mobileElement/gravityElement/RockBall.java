package model.mobileElement.gravityElement;

import java.io.IOException;

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
	 * The RockBall constructor.
	 * 
	 * @param x, The sprite associated with the Element
	 * @param y, The state of the Element
	 * @param sprite , The RockBall associated Sprite
	 * @throws IOException
	 */
	public RockBall(final int x, final int y, Sprite sprite) throws IOException {
		
		super(x,y,sprite,state);
		
	}
}
