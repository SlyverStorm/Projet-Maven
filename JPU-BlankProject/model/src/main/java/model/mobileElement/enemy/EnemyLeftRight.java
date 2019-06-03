package model.mobileElement.enemy;

import java.io.IOException;

import model.Sprite;

public class EnemyLeftRight extends Enemy {

	
	/**
	 * The EnemyLeftRight constructor.
	 */
	public EnemyLeftRight(final int x, final int y, Sprite sprite) {
		super(x,y,sprite);
	}
	
	/**
	 * Based on the two others methods, it will make the enemy go up or down.
	 * @throws IOException 
	 */
	public void moveLeftRight() throws IOException {
		if(this.getDirection() == false) {
			if(this.isMoveLeftPossible() == true) {
				this.moveRight();
			}
			else
				this.setDirection(true);
		}
		
		if(this.getDirection() == true) {
			if(this.isMoveRightPossible() == true) {
				this.moveRight();
			}
			else
				this.setDirection(false);
		}

	}
	
	/**
	 * Analyze the State of the block on the left side.
	 * 
	 * @return True if Moveable, False if not.
	 */
	public boolean isMoveLeftPossible() {
		switch(getElementFromMap(this.getX()-1,this.getY()).getState()) {
		case EMPTY :
			return true;
		case BREAKABLE :
			return false;
		case UNBREAKABLE :
			return false;
		case LOOTABLE :
			return false;
		case ENEMY :
			return false;
		case EXIT:
			return false;
		case PLAYER:
			return false;
		default:
			return false;
		}
		
	}
	
	/**
	 * Analyze the State of the block on the right side.
	 * 
	 * @return True if Moveable, False if not.
	 */
	public boolean isMoveRightPossible() {
		switch(getElementFromMap(this.getX()+1,this.getY()).getState()) {
		case EMPTY :
			return true;
		case BREAKABLE :
			return false;
		case UNBREAKABLE :
			return false;
		case LOOTABLE :
			return false;
		case ENEMY :
			return false;
		case EXIT:
			return false;
		case PLAYER:
			return false;
		default:
			return false;
		}
		
	}
}
