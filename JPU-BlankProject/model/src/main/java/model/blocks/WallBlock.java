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
	 * The static State preset for a WallBlock element type.
	 */
	private static State state = State.EMPTY;
	
	
	/**
	 * The WallBlock constructor.
	 * 
	 * @param x , abscissa coordinate of the Element
	 * @param y , ordinate coordinate of the Element
	 * @param sprite , the WallBlock associated sprite
	 */
	public WallBlock(final int x, final int y, Sprite sprite) {
		super(x,y,sprite,state);
	}
}
