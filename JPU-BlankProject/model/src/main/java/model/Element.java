package model;

public abstract class Element {
	
	/**
	 * Initialization
	 */
	private int x;
	private int y;
	private Sprite image;
	private State state;
	
	/**
	 * Get x value, to obtain the object position on the abscissa.
	 * 
	 * @return Return a x value detailing the abscissa of a certain object.
	 */
	public int getX() {
		return x;
	}
	/**
	 * Set a value for x, to modify abscissa.
	 * 
	 * @param x Set a x value modifying abscissa.
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Get y value, to obtain the object position on the ordinate.
	 * 
	 * @return Return a y value detailing the ordinate of a certain object.
	 */
	public int getY() {
		return y;
	}
	/**
	 * Set a value for y, to modify ordinate.
	 * 
	 * @param y Set a y value modifying ordinate.
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Get an Image on the SpriteBoard.
	 * 
	 * @return An Image according to the object.
	 */
	public Sprite getImage() {
		return image;
	}
	/**
	 * Set an Image on the SpriteBoard.
	 * 
	 * @param image Is an Image according to the object.
	 */
	public void setImage(Sprite image) {
		this.image = image;
	}
	
	/**
	 * Get the State of an object.
	 * 
	 * @return The state of an object.
	 */
	public State getState() {
		return state;
	}
	/**
	 * Set the State of an object.
	 * 
	 * @param state Specifies the State of an object.
	 */
	public void setState(State state) {
		this.state = state;
	}

}
