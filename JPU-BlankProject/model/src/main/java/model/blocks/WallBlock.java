package model.blocks;

import model.Sprite;
import model.State;


/**
 * <h1>The WallBlock element class.</h1>
 * 
 * @author Thibaut MAITREPIERRE AND Gabriel RICARD
 *
 */
public class WallBlock extends Blocks {

	/**
	 * Sprite is used to get a specific sprite for WallBlock.
	 * State is used to attribute a state to WallBlock.
	 */
	
	/**
	 * The static Sprite preset for a WallBlock element type.
	 */
	private static Sprite sprite;
	
	/**
	 * The static State preset for a WallBlock element type.
	 */
	private static State state = State.EMPTY;
	
	
	/**
	 * The WallBlock constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 */
	public WallBlock(final int x, final int y) {
		super(x,y,sprite,state);
	}
}
