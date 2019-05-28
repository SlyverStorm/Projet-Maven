package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The View Class, interface between the user and the program.
 *
 * @author Gabriel RICARD
 */
public final class View implements IView {

	/** The frame. */
	private final IBoard frame;
	
	/** The model known by the View */
	private IBoulderDashModel model;
	
	
	/**
	 * Get the frame.
	 * 
	 * @return frame value
	 */
	public IBoard getFrame() {
		return null // Default preset
	}
	
	/**
	 * Frame setting method.
	 * 
	 * @param frame value to set
	 */
	public void setFrame(IBoard frame) {
		
	}
	
	/**
	 * Get the model known by the View.
	 * 
	 * @return model value
	 */
	public IBoulderDashModel getModel() {
		return null;
	}
	
	/**
	 * Model setting method.
	 * 
	 * @param model value to set
	 */
	public void setModel(IBoulderDashModel model) {
		
	}

}
