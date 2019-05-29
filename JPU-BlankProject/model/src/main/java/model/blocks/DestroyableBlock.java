package model.blocks;

import model.Sprite;
import model.State;


/**
 * <h1>The DestroyableBlock element class.</h1>
 * 
 * @author Thibaut MAITREPIERRE AND Gabriel RICARD
 *
 */
public class DestroyableBlock extends Blocks {

	/**
	 * Sprite is used to get a specific sprite for DestroyableBlock.
	 * State is used to attribute a state to DestroyableBlock.
	 */
	
	/**
	 * The static Sprite preset for a DestroyableBlock element type.
	 */
	private static Sprite sprite;
	
	/**
	 * The static State preset for a DestroyableBlock element type.
	 */
	private static State state = State.BREAKABLE;
	
	
	/**
	 * The DestroyableBlock constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 */
	public DestroyableBlock(final int x, final int y) {
		super(x,y,sprite,state);
	}
}
