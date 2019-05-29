package model.mobileElement.enemy;

public class EnemyUpDown implements MovingEnemy {

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
