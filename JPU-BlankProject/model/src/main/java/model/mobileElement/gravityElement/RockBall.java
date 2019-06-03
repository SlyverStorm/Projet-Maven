package model.mobileElement.gravityElement;

import java.io.IOException;

import model.Sprite;
import model.State;


/**
 * <h1>The RockBall Class.</h1>
 *
 * @author Gabriel RICARD
 * @version 0.1
 */
public class RockBall extends GravityElement {
	
	
	/**
	 * The State preset for a RockBall Element.
	 */
	private static State state = State.BALL;
	


	/**
	 * The RockBall constructor.
	 * 
	 * @param x, The sprite associated with the Element
	 * @param y, The state of the Element
	 * @param sprite , The RockBall associated Sprite
	 * @throws IOException
	 */
	public RockBall(final int x, final int y, Sprite sprite) throws IOException {
		
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



	@Override
	protected void moveUpDown() {
		// TODO Auto-generated method stub
		
	}



	@Override
	protected void moveLeftRight() {
		// TODO Auto-generated method stub
		
	}
}
