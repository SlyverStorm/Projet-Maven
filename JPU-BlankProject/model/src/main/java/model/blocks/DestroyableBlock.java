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
	 * The static State preset for a DestroyableBlock element type.
	 */
	private static State state = State.BREAKABLE;
	
	
	/**
	 * The DestroyableBlock constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 * @param sprite , the DestroyableBlock associated sprite
	 */
	public DestroyableBlock(final int x, final int y, Sprite sprite) {
		super(x,y,sprite,state);
	}
}
