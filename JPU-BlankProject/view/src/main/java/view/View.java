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
	
	private ControllerOrder1 keyPressed = null;

	public IBoard getFrame() {
		return frame;
	}

	public void setFrame(IBoard frame) {
		this.frame = frame;
	}

	public IBoulderDashModel1 getModel() {
		return model;
	}

	public void setModel(IBoulderDashModel1 model) {
		this.model = model;
	}
	
	public ControllerOrder1 getKeyPressed() {
		return keyPressed;
	}

	public void setKeyPressed(ControllerOrder1 keyPressed) {
		this.keyPressed = keyPressed;
	}
	
	
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
