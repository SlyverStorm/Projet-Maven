package model;

public class Score extends Element {

	/**
	 * Initialization
	 */
	int score = 0;

	/**
	 * Get the current score value.
	 * 
	 * @return An int equals the score's value.
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
	
}
