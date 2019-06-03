package model.blocks;

import java.io.IOException;

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
	 * The static State preset for a ExitBlock element type.
	 */
	private static State state = State.UNBREAKABLE;
	
	
	/**
	 * The ExitBlock constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 * @param sprite , the ExitBlock associated sprite
	 */
	public ExitBlock(final int x, final int y, Sprite sprite) {
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
