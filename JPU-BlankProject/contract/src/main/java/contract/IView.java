package contract;

/**
 * The Interface IView.
 *
 * @author Jean-Aymeric Diet
 */
public interface IView {
	
	/**
	 * Get the frame known by the View.
	 * 
	 * @return
	 */
	IBoard getFrame();
	
	/**
	 * The frame setting method.
	 * 
	 * @param frame
	 */
	void setFrame(IBoard frame);
	
	/**
	 * Get the model known by the View.
	 * 
	 * @return
	 */
	IBoulderDashModel getModel();
	
	/**
	 * The model setting method.
	 * 
	 * @param model
	 */
	void setModel(IBoulderDashModel model);
}
