package model.mobileElement;

import java.io.IOException;

import model.BoulderDashModel;
import model.Element;
import model.Sprite;
import model.State;
import model.blocks.*;

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
	 * @throws IOException 
	 */
	protected void moveUp() throws IOException {
		Sprite emptyBlockSprite = new Sprite('-',"EmptyBlockImage");
		EmptyBlock empty = new EmptyBlock(this.getX(),this.getY(),emptyBlockSprite);
		setElementToMap(getElementFromMap(this.getX(),this.getY()),this.getX(), this.getY()+1);
		getElementFromMap(this.getX(), this.getY()).setY(this.getY()+1);
		setElementToMap(empty,this.getX(), this.getY());
	}
	
	/**
	 * Move the Element to the lower Element (x, y-1) and replace old Element by an Empty Element.
	 * 
	 * @param movingElement is the type of Element which is moving
	 * @throws IOException 
	 */
	protected void moveDown() throws IOException {
		Sprite emptyBlockSprite = new Sprite('-',"EmptyBlockImage");
		EmptyBlock empty = new EmptyBlock(this.getX(),this.getY(),emptyBlockSprite);
		setElementToMap(getElementFromMap(this.getX(),this.getY()),this.getX(), this.getY()-1);
		getElementFromMap(this.getX(), this.getY()).setY(this.getY()-1);
		setElementToMap(empty,this.getX(), this.getY());
	}
	
	/**
	 * Move the Element to the upper Element (x, y+1) and replace old Element by an Empty Element.
	 * 
	 * @param movingElement is the type of Element which is moving
	 * @throws IOException 
	 */
	protected void moveRight() throws IOException {
		Sprite emptyBlockSprite = new Sprite('-',"EmptyBlockImage");
		EmptyBlock empty = new EmptyBlock(this.getX(),this.getY(),emptyBlockSprite);
		setElementToMap(getElementFromMap(this.getX(),this.getY()),this.getX()+1, this.getY());
		getElementFromMap(this.getX(), this.getY()).setY(this.getX()+1);
		setElementToMap(empty,this.getX(), this.getY());
		
	}
	
	/**
	 * Move the Element to the upper Element (x, y+1) and replace old Element by an Empty Element.
	 * 
	 * @param movingElement is the type of Element which is moving
	 * @throws IOException 
	 */
	protected void moveLeft() throws IOException {
		Sprite emptyBlockSprite = new Sprite('-',"EmptyBlockImage");
		EmptyBlock empty = new EmptyBlock(this.getX(),this.getY(),emptyBlockSprite);
		setElementToMap(getElementFromMap(this.getX(),this.getY()),this.getX()-1, this.getY());
		getElementFromMap(this.getX(), this.getY()).setY(this.getX()-1);
		setElementToMap(empty,this.getX(), this.getY());
	}
	


}
