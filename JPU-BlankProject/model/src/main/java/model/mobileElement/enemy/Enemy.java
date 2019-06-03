package model.mobileElement.enemy;

import java.io.IOException;

import model.Sprite;
import model.State;
import model.mobileElement.MobileElement;

/**
 * <h1>The RockBall Class.</h1>
 *
 * @author Thibaut MAITREPIERRE and Gabriel RICARD
 * @version 0.1
 */
public class Enemy extends MobileElement {
	
	/**
	 * Direction of the enemy.
	 */
	private boolean direction = false;
	

	/**
	 * State preset of the enemy.
	 */
	private static State state = State.ENEMY;
	
	
	
	/**
	 * The Enemy moving up and down constructor.
	 * 
	 * @param x, abscissa coordinate of the Enemy
	 * @param y, ordinate coordinate of the Enemy
	 * @param move, the move set of the Enemy
	 */
	public Enemy(final int x, final int y, Sprite sprite) {
		super(x,y,sprite,state);

	}
	
	
	/**
	 * Corresponds to the Enemy direction.
	 * 
	 * @return True or False depending on blocks around the enemy, and also the type of enemy.
	 */
	public boolean getDirection() {
		return direction;
	}
	
	/**
	 * Corresponds to the direction we want to give to the Enemy
	 * 
	 * @param direction Up, Down, Right, Left
	 */
	public void setDirection(boolean direction) {
		this.direction = direction;
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
