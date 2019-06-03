package model.mobileElement;

import java.io.IOException;

import model.Sprite;
import model.State;

/**
 * <h1>The Player Class.</h1>
 *
 * @author Gabriel RICARD AND Thibaut MAITREPIERRE
 * @version 0.1
 */
public class Player extends MobileElement {
	

	/**
	 * State preset of the player.
	 */
	private static State state = State.PLAYER;
	
	/**
	 * The player element constructor.
	 * 
	 * @param x , abscissa coordinate of the player
	 * @param y , ordinate coordinate of the player
	 * @param sprite , the Player associated sprite
	 */
	public Player(final int x, final int y, Sprite sprite) {
		super(x,y,sprite,state);
	}
	
	/**
	 * Verify if moving up is possible.
	 * 
	 * @return true if the move is possible or false if the move is not possible
	 */
	public boolean isMoveUpPossible() {
		switch(getElementFromMap(this.getX(),this.getY()+1).getState()) {
		case EMPTY :
			return true;
		case BREAKABLE :
			return true;
		case UNBREAKABLE :
			return false;
		case LOOTABLE :
			return true;
		case ENEMY :
			return false;
		case EXIT:
			return true;
		case PLAYER:
			return false;
		case BALL:
			return false;
		default:
			return false;
		}
	}
	
	/**
	 * Move the player Element to the upper Element
	 * @throws IOException 
	 */
	public void movePlayerUp() throws IOException {
		if (isMoveUpPossible()) {
			this.moveUp();
		}
	}
	
	/**
	 * Verify if moving down is possible.
	 * 
	 * @return true if the move is possible or false if the move is not possible
	 */
	public boolean isMoveDownPossible() {
		switch(getElementFromMap(this.getX(),this.getY()-1).getState()) {
		case EMPTY :
			return true;
		case BREAKABLE :
			return true;
		case UNBREAKABLE :
			return false;
		case LOOTABLE :
			return true;
		case ENEMY :
			return false;
		case EXIT:
			return true;
		case PLAYER:
			return false;
		case BALL:
			return false;
		default:
			return false;
		}
	}
	
	/**
	 * Move the player Element to the lower Element
	 * @throws IOException 
	 */
	public void movePlayerDown() throws IOException {
		if (isMoveDownPossible()) {
			this.moveDown();
		}
	}
	
	/**
	 * Verify if moving left is possible.
	 * 
	 * @return true if the move is possible or false if the move is not possible
	 */
	public boolean isMoveLeftPossible() {
		switch(getElementFromMap(this.getX()-1,this.getY()).getState()) {
		case EMPTY :
			return true;
		case BREAKABLE :
			return true;
		case UNBREAKABLE :
			return false;
		case LOOTABLE :
			return true;
		case ENEMY :
			return false;
		case EXIT:
			return true;
		case PLAYER:
			return false;
		case BALL:
			return false;
		default:
			return false;
		}
	}
	
	/**
	 * Move the player Element to the left Element
	 * @throws IOException 
	 */
	public void movePlayerLeft() throws IOException {
		if (isMoveLeftPossible()) {
			this.moveLeft();
		}
	}
	
	/**
	 * Verify if moving right is possible.
	 * 
	 * @return true if the move is possible or false if the move is not possible
	 */
	public boolean isMoveRightPossible() {
		switch(getElementFromMap(this.getX()+1,this.getY()).getState()) {
		case EMPTY :
			return true;
		case BREAKABLE :
			return true;
		case UNBREAKABLE :
			return false;
		case LOOTABLE :
			return true;
		case ENEMY :
			return false;
		case EXIT:
			return true;
		case PLAYER:
			return false;
		case BALL:
			return false;
		default:
			return false;
		}
	}
	
	/**
	 * Move the player Element to the right Element
	 * @throws IOException 
	 */
	public void movePlayerRight() throws IOException {
		if (isMoveRightPossible()) {
			this.moveRight();
		}
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
