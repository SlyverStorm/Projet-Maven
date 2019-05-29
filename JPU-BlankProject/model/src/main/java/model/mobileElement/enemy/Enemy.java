package model.mobileElement.enemy;

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
	private boolean direction;
	
	/**
	 * Move set of the enemy.
	 */
	private MovingEnemy move;
	
	/**
	 * Sprite preset of the enemy.
	 */
	private static Sprite sprite;
	
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
	public Enemy(final int x, final int y, EnemyUpDown move) {
		super(x,y,sprite,state);
		this.move = move;
	}
	
	
	/**
	 * The Enemy moving to the left and to the right constructor.
	 * 
	 * @param x, abscissa coordinate of the Enemy
	 * @param y, ordinate coordinate of the Enemy
	 * @param move, the move set of the Enemy
	 */
	public Enemy(final int x, final int y, EnemyLeftRight move) {
		super(x,y,sprite,state);
		this.move = move;
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
