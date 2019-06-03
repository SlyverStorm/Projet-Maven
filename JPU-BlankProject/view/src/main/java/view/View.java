package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder1;
import contract.IController1;
import contract.IBoulderDashModel1;
import contract.IView;

/**
 * The View Class, interface between the user and the program.
 *
 * @author Gabriel RICARD
 */
public final class View implements IView {

	/** The frame. */
	private IBoard frame;
	
	/** The model known by the View */
	private IBoulderDashModel1 model;

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
	
}
