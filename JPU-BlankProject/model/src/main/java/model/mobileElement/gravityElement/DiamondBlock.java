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
	 * The Sprite preset for a DiamondBlock Element.
	 */
	private static Sprite sprite;
	
	/**
	 * The DiamondBlock constructor.
	 * 
	 * @param x, The sprite associated with the Element
	 * @param y, The state of the Element
	 */
	public DiamondBlock(final int x, final int y) {
		super(x,y,sprite,state);
	}
	

}
