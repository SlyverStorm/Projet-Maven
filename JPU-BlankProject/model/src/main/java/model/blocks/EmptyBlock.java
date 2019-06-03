package model.blocks;

import java.io.IOException;

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
	 * The static State preset for a EmptyBlock element type.
	 */
	private static State state = State.EMPTY;
	
	
	/**
	 * The EmptyBlock constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 * @param sprite , the EmptyBlock associated sprite
	 */
	public EmptyBlock(final int x, final int y, Sprite sprite) {
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
	protected void moveUpDown() throws IOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void moveLeftRight() throws IOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void gravityMove() throws IOException {
		// TODO Auto-generated method stub
		
	}
}
