package model.mobileElement.enemy;

/**
 * 
 * @author MAITREPIERRE Thibaut
 *
 * We use this interface to make accessible every methods of Up/Down and Right/Left Enemy.
 */
public interface MovingEnemy {

	public void moveUpDown();
	public void moveLeftRight();
	public boolean isMoveUpPossible();
	public boolean isMoveDownPossible();
	public boolean isMoveLeftPossible();
	public boolean isMoveRightPossible();
}
