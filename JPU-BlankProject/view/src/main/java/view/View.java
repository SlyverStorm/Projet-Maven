package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.SwingUtilities;

import contract.ControllerOrder1;
import contract.IBoulderDashModel;
import contract.ISquare;
import contract.IView;



/**
 * The View Class, interface between the user and the program.
 *
 * @author Gabriel RICARD
 */
public final class View implements IView, KeyListener, Runnable {

	/** The frame. */
	
	/**
	 * Map known by the view
	 */
	public ISquare[][] viewMap;
	
	/**
	 * KeyPressed UserOrder
	 */
	private ControllerOrder1 keyPressed = null;
	
	/**
	 * Frame height
	 */
	private int frameHeight;
	
	/**
	 * Frame width
	 */
	private int frameWidth;

	/**
	 * The close View;
	 */
	private Rectangle closeView;

	
	/**
	 * View constructor
	 * 
	 * @param model
	 */
	public View(IBoulderDashModel model) {
		viewMap = model.getControllerMap();
        SwingUtilities.invokeLater(this);
        this.setFrameWidth(model.getMaxMapWidth());
        this.setFrameHeight(model.getMaxMapHeight());
	}
	
    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public final void run() {
        final BoardFrame boardFrame = new BoardFrame("BoulderDash");
        boardFrame.setDimension(new Dimension(this.getFrameWidth(), this.getFrameHeight()));
        boardFrame.setDisplayFrame(this.closeView);
        boardFrame.setSize(this.closeView.width * 16, this.closeView.height * 16);
        boardFrame.setHeightLooped(true);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        boardFrame.setFocusTraversalKeysEnabled(false);

        for(int y = 1; y <= this.getFrameHeight(); y++) {
        	for(int x = 1; x <= this.getFrameWidth(); x++) {
        		boardFrame.addSquare(this.viewMap[x][y], x, y);
        		
        		
        	}
        	
        }

        boardFrame.setVisible(true);
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

	public int getFrameHeight() {
		return frameHeight;
	}

	public void setFrameHeight(int frameHeight) {
		this.frameHeight = frameHeight;
	}

	public int getFrameWidth() {
		return frameWidth;
	}

	public void setFrameWidth(int frameWidth) {
		this.frameWidth = frameWidth;
	}


}
