package model.blocks;

import model.*;

/**
 * <h1>The Blocks element class.</h1>
 * 
 * @author Thibaut MAITREPIERRE AND Gabriel RICARD
 *
 */
public abstract class Blocks extends Element {

	/**
	 * Is used as a link between several types of Blocks, and Element.
	 */
	
	/**
	 * Blocks Element constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 * @param image, The sprite associated with the Element
	 * @param state, The state of the Element
	 */
	public Blocks(final int x, final int y, Sprite image, State state) {
		super(x,y,image,state);
	}
}
