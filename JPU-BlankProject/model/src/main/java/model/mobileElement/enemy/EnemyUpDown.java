package model.mobileElement.enemy;

import java.io.IOException;

import model.Sprite;

public class EnemyUpDown extends Enemy {
	

	/**
	 * The EnemyUpDown constructor.
	 */
	public EnemyUpDown(final int x, final int y, Sprite sprite) {
		super(x,y,sprite);
	}
	
	/**
	 * Based on the two others methods, it will make the enemy go up or down.
	 * @throws IOException 
	 */
	public void moveUpDown() throws IOException {
		if(this.getDirection() == false) {
			if(this.isMoveUpPossible() == true) {
				this.moveUp();
			}
			else
				this.setDirection(true);
		}
		
		if(this.getDirection() == true) {
			if(this.isMoveDownPossible() == true) {
				this.moveDown();
			}
			else
				this.setDirection(false);
		}
	}
	
	/**
	 * Analyze the State of the upper block, if it's MOVEABLE, it will return true.
	 * 
	 * @return True if Moveable, False if not.
	 */
	public boolean isMoveUpPossible() {
		switch(getElementFromMap(this.getX(),this.getY()-1).getState()) {
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
	 * Analyze the State of the lower block, if it's MOVEABLE, it will return true.
	 * 
	 * @return True if Moveable, False if not.
	 */
	public boolean isMoveDownPossible() {
		switch(getElementFromMap(this.getX(),this.getY()+1).getState()) {
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
