package model.blocks;

import model.Sprite;
import model.State;


/**
 * <h1>The EmptyBlock element class.</h1>
 * 
 * @author Thibaut MAITREPIERRE AND Gabriel RICARD
 *
 */
public class EmptyBlock extends Blocks {

	/**
	 * Sprite is used to get a specific sprite for EmptyBlock.
	 * State is used to attribute a state to the EmptyBlock.
	 */
	
	/**
	 * The static Sprite preset for a EmptyBlock element type.
	 */
	private static Sprite sprite;
	
	/**
	 * The static State preset for a EmptyBlock element type.
	 */
	private static State state = State.EMPTY;
	
	
	/**
	 * The EmptyBlock constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 */
	public EmptyBlock(final int x, final int y) {
		super(x,y,sprite,state);
	}
}
