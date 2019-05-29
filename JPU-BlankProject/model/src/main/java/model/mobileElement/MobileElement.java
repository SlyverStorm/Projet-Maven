package model.mobileElement;

import model.Element;
import model.Sprite;
import model.State;

/**
 * <h1>The MobileElement Class.</h1>
 *
 * @author Gabriel RICARD
 * @version 0.1
 */
public abstract class MobileElement extends Element {
	
	
	/**
	 * The MobileElement constructor.
	 * 
	 * @param x, abscissa coordinate of the Element
	 * @param y, ordinate coordinate of the Element
	 * @param sprite, The sprite associated with the Element
	 * @param state, The state of the Element
	 */
	public MobileElement(final int x, final int y, Sprite sprite, State state) {
		super(x,y,sprite,state);
	}
	
	/**
	 * Move the Element to the upper Element (x, y+1) and replace old Element by an Empty Element.
	 * 
	 * @param movingElement is the type of Element which is moving
	 */
	protected void MoveUp(MobileElement movingElement) {
		
	}
	
	/**
	 * Move the Element to the lower Element (x, y-1) and replace old Element by an Empty Element.
	 * 
	 * @param movingElement is the type of Element which is moving
	 */
	protected void MoveDown(MobileElement movingElement) {
		
	}
	
	/**
	 * Move the Element to the upper Element (x, y+1) and replace old Element by an Empty Element.
	 * 
	 * @param movingElement is the type of Element which is moving
	 */
	protected void MoveRight(MobileElement movingElement) {
		
	}
	
	/**
	 * Move the Element to the upper Element (x, y+1) and replace old Element by an Empty Element.
	 * 
	 * @param movingElement is the type of Element which is moving
	 */
	protected void MoveLeft(MobileElement movingElement) {
		
	}
	

}
