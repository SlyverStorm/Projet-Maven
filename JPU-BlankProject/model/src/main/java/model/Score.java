package model;

import java.io.IOException;

/**
 * <h1>The Score element class.</h1>
 * 
 * @author Thibaut MAITREPIERRE AND Gabriel RICARD
 *
 */
public class Score extends Element {

	/**
	 * Initialization
	 */
	
	/**
	 * Sprite preset for Score element.
	 */
	private static Sprite sprite;
	
	/**
	 * State preset for Score element.
	 */
	private static State state;
	
	/**
	 * Score value is represented by an integer.
	 */
	private int score = 0;

	/**
	 * Get the current score value.
	 * 
	 * @return An integer equals the score's value.
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Set a value to score.
	 * 
	 * @param score Modifies score's value.
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	
	/**
	 * The Score constructor.
	 * 
	 * @param x, abscissa coordinate of the Score element
	 * @param y, ordinate coordinate of the Score element
	 */
	public Score(final int x, final int y) {
		super(x,y,sprite,state);
	}

	@Override
	protected void movePlayerUp() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void movePlayerRight() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void movePlayerDown() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void movePlayerLeft() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}
