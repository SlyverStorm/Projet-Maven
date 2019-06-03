package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.SwingUtilities;

import contract.ControllerOrder1;
import contract.IController1;
import contract.IBoulderDashModel1;
import contract.IView;
import contract.ControllerOrder1;

/**
 * The View Class, interface between the user and the program.
 *
 * @author Gabriel RICARD
 */
public final class View implements IView, KeyListener {

	/** The frame. */
	private IBoard frame;
	
	/** The model known by the View */
	private IBoulderDashModel1 model;
	
	/**
	 * KeyPressed UserOrder
	 */
	private ControllerOrder1 keyPressed = null;

	/**
	 * get the frame in the View
	 * 
	 * @return the view frame
	 */
	public IBoard getFrame() {
		return frame;
	}
	
	/**
	 * Set a frame to the View
	 * 
	 * @param frame , frame to set
	 * 
	 */
	public void setFrame(IBoard frame) {
		this.frame = frame;
	}
	
	
	/**
	 * Model known by the View
	 * 
	 * @return the model
	 */
	public IBoulderDashModel1 getModel() {
		return model;
	}
	
	/**
	 * Set the model in the View
	 * 
	 * @param model , model to set
	 */
	public void setModel(IBoulderDashModel1 model) {
		this.model = model;
	}
	
	
	/**
	 * get the Key order
	 * 
	 * @return key pressed
	 */
	public ControllerOrder1 getKeyPressed() {
		return keyPressed;
	}

	
	/**
	 * set a keyPressed
	 * 
	 * @param keyPressed
	 */
	public void setKeyPressed(ControllerOrder1 keyPressed) {
		this.keyPressed = keyPressed;
	}
	
	
	/**
	 * KeyListener when a key is pressed
	 * 
	 * @param e , KeyEvent 
	 */
	public void keyPressed(KeyEvent e) {

	    int key = e.getKeyCode();

	    if (key == KeyEvent.VK_LEFT) {
	        setKeyPressed(ControllerOrder1.LEFT);
	    }

	    if (key == KeyEvent.VK_RIGHT) {
	        setKeyPressed(ControllerOrder1.RIGHT);
	    }

	    if (key == KeyEvent.VK_UP) {
	        setKeyPressed(ControllerOrder1.UP);
	    }

	    if (key == KeyEvent.VK_DOWN) {
	        setKeyPressed(ControllerOrder1.DOWN);
	    }
	    	
	}

	/**
	 * KeyListener when a key is release
	 * 
	 * @param e , KeyEvent
	 */
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

	    if (key == KeyEvent.VK_LEFT) {
	        setKeyPressed(null);
	    }

	    if (key == KeyEvent.VK_RIGHT) {
	        setKeyPressed(null);
	    }

	    if (key == KeyEvent.VK_UP) {
	        setKeyPressed(null);
	    }

	    if (key == KeyEvent.VK_DOWN) {
	        setKeyPressed(null);
	    }
	    	
	}
		

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
