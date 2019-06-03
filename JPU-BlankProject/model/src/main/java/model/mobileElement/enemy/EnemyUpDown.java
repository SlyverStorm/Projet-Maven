package model.mobileElement.enemy;

public class EnemyUpDown implements MovingEnemy {
	
	
	private boolean direction = true;
	
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
	

	/**
	 * The EnemyUpDown constructor.
	 */
	public EnemyUpDown() {
		
	}
	
	/**
	 * Based on the two others methods, it will make the enemy go up or down.
	 */
	public void moveUpDown() {

	}
	
	/**
	 * Analyze the State of the upper block, if it's MOVEABLE, it will return true.
	 * 
	 * @return True if Moveable, False if not.
	 */
	public boolean isMoveUpPossible() {
		return false;
		
	}
	
	/**
	 * Analyze the State of the lower block, if it's MOVEABLE, it will return true.
	 * 
	 * @return True if Moveable, False if not.
	 */
	public boolean isMoveDownPossible() {
		return false;
		
	}

	@Override
	public void moveLeftRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMoveLeftPossible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMoveRightPossible() {
		// TODO Auto-generated method stub
		return false;
	}
}
