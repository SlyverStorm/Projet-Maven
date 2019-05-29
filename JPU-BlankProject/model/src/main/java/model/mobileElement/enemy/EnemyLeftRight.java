package model.mobileElement.enemy;

public class EnemyLeftRight implements MovingEnemy {

	
	/**
	 * The EnemyLeftRight constructor.
	 */
	public EnemyLeftRight() {
		
	}
	
	/**
	 * Based on the two others methods, it will make the enemy go up or down.
	 */
	public void moveLeftRight() {
		
	}
	
	/**
	 * Analyze the State of the block on the left side.
	 * 
	 * @return True if Moveable, False if not.
	 */
	public boolean isMoveLeftPossible() {
		return false;
		
	}
	
	/**
	 * Analyze the State of the block on the right side.
	 * 
	 * @return True if Moveable, False if not.
	 */
	public boolean isMoveRightPossible() {
		return false;
		
	}

	@Override
	public void moveUpDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMoveUpPossible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMoveDownPossible() {
		// TODO Auto-generated method stub
		return false;
	}
}
