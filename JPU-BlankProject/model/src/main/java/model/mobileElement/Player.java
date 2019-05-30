package model.mobileElement;

import model.Sprite;
import model.State;

/**
 * <h1>The Player Class.</h1>
 *
 * @author Gabriel RICARD
 * @version 0.1
 */
public class Player extends MobileElement{
	
	/**
	 * Sprite preset of the player.
	 */
	private static Sprite sprite;
	
	/**
	 * State preset of the player.
	 */
	private static State state = State.PLAYER;
	
	/**
	 * Verify if moving up is possible.
	 * 
	 * @return true if the move is possible or false if the move is not possible
	 */
	public boolean isMoveUpPossible() {
		return false;
	}
	
	/**
	 * Move the player Element to the upper Element
	 */
	public void movePlayerUp() {
		
	}
	
	/**
	 * Verify if moving down is possible.
	 * 
	 * @return true if the move is possible or false if the move is not possible
	 */
	public boolean isMoveDownPossible() {
		return false;
	}
	
	/**
	 * Move the player Element to the lower Element
	 */
	public boolean movePlayerDown() {
		return false;
	}
	
	/**
	 * Verify if moving left is possible.
	 * 
	 * @return true if the move is possible or false if the move is not possible
	 */
	public boolean isMoveLeftPossible() {
		return false;
	}
	
	/**
	 * Move the player Element to the left Element
	 */
	public void movePlayerLeft() {
		
	}
	
	/**
	 * Verify if moving right is possible.
	 * 
	 * @return true if the move is possible or false if the move is not possible
	 */
	public boolean isMoveRightPossible() {
		return false;
	}
	
	/**
	 * Move the player Element to the right Element
	 */
	public void movePlayerRight() {
		
	}
	
	/**
	 * The player element constructor.
	 * 
	 * @param x , abscissa coordinate of the player
	 * @param y , ordinate coordinate of the player
	 */
	public Player(final int x, final int y) {
		super(x,y,sprite,state);
	}

}
