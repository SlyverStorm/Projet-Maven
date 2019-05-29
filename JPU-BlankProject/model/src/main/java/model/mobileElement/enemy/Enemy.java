package model.mobileElement.enemy;

public class Enemy {

	private boolean direction;
	private MovingEnemy move;
	
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
	 * Gets the moving capacity of the Enemy.
	 * 
	 * @return Moving Enemy Move
	 */
	public MovingEnemy getMove() {
		return move;
	}
	
	/**
	 * Sets the moving capacity of the Enemy.
	 * 
	 * @param move
	 */
	public void setMove(MovingEnemy move) {
		this.move = move;
	}
	
}
