package model.blocks;

import model.Sprite;
import model.State;


/**
 * <h1>The ExitBlock element class.</h1>
 * 
 * @author Thibaut MAITREPIERRE AND Gabriel RICARD
 *
 */
public class ExitBlock extends Blocks {

	/**
	 * Sprite is used to get a specific sprite for ExitBlock.
	 * State is used to attribute a state to ExitBlock.
	 */
	
	/**
	 * The static Sprite preset for a ExitBlock element type.
	 */
	private static Sprite sprite;
	
	/**
	 * The static State preset for a ExitBlock element type.
	 */
	private static State state = State.EMPTY;
	
	
	/**
	 * The ExitBlock constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 */
	public ExitBlock(final int x, final int y) {
		super(x,y,sprite,state);
	}
}
