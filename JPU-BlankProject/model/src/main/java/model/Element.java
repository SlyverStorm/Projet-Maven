package model;

import java.awt.Image;

/**
 * <h1>The Element Class.</h1>
 *
 * @author Thibaut MAITREPIERRE and Gabriel RICARD
 * @version 0.1
 */
public abstract class Element implements ISquare {
	
	/**
	 * Initialization
	 */
	
	
	/**
	 * abscissa position of the Element.
	 */
	private int x;
	
	/**
	 * ordinate position of the Element.
	 */
	private int y;
	
	/**
	 * Element associated Sprite.
	 */
	private Sprite image;
	
	/**
	 * Special State of the Element.
	 */
	private State state;
	
	
	/**
	 * Element constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 * @param image, The sprite associated with the Element
	 * @param state, The state of the Element
	 */
	public Element(final int x, final int y, Sprite image, State state) {
		this.x = x;
		this.y = y;
		this.image = image;
		this.state = state;
	}
	
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
	public Sprite getSprite() {
		return image;
	}
	/**
	 * Set an Image on the SpriteBoard.
	 * 
	 * @param image Is an Image according to the object.
	 */
	public void setSprite(Sprite image) {
		this.image = image;
	}
	
	/**
	 * Get the Image in the image Sprite object.
	 * 
	 * @return image in the Sprite object
	 */
	public Image getImage() {
		return this.image.getImage();
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