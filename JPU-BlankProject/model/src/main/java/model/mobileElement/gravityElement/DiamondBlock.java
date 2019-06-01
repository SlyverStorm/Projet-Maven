package model.mobileElement.gravityElement;

import model.Sprite;
import model.State;


/**
 * <h1>The DiamondBlock Class.</h1>
 *
 * @author Gabriel RICARD
 * @version 0.1
 */
public class DiamondBlock extends GravityElement {
	
	
	/**
	 * The State preset for a DiamondBlock Element.
	 */
	private static State state = State.LOOTABLE;
	

	/**
	 * The DiamondBlock constructor.
	 * 
	 * @param x, The sprite associated with the Element
	 * @param y, The state of the Element
	 * @param sprite , the DiamondBlock associated sprite
	 */
	public DiamondBlock(final int x, final int y, Sprite sprite) {
		super(x,y,sprite,state);
	}
	

}
