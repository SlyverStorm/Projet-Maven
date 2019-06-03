package model.mobileElement.gravityElement;

import java.io.IOException;

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


	@Override
	protected void movePlayerUp() throws IOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void movePlayerRight() throws IOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void movePlayerDown() throws IOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void movePlayerLeft() throws IOException {
		// TODO Auto-generated method stub
		
	}
	

}
