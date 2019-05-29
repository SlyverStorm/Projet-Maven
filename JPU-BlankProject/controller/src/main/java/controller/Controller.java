package controller;

import contract.UserOrder;

import java.io.IOException;

import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 *
 * @author Antoine Baudusseau
 */
public final class Controller implements IController {

	/** The Constant speed. */
	int speed = 300;
	
	/** The view. */
	private IView view;
	
	/** The model. */
	private IModel model;
	
	/** The stack order. */
	private UserOrder StackOrder;

	/**
	 * Launch game process.
	 */
	public void play() {
		this.getModel().loadControllerMap();
		while (this.getModel().getPlayer().isAlive()) {
			Thread.sleep(speed);
			switch (this.getStackOrder()) {
			case Right:
				this.getModel().getPlayer().movePlayerRight();
				break;
			case Left:
				this.getModel().getPlayer().movePlayerLeft();
				break;
			case Up:
				this.getModel().getPlayer().movePlayerUp();
				break;
			case Down:
				this.getModel().getPlayer().movePlayerDown();
				break;
			case Nop:
			default:
				this.getModel().getPlayer().doNothing();
				break;
			}
			this.clearStackOrder();
			this.getView().followPlayer();
		}
		switch (this.getModel().getPlayer().isAlive()) {
			
		}
	}

	/**
	 * Instantiates a new controller.
	 *
	 * @param view  the view
	 * @param model the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
		this.clearStackOrder();
	}

	/**
	 * Get the view.
	 */
	private IView getView() {
		return view;
	}

	/**
	 * Set the view.
	 *
	 * @param pview the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Get the model.
	 */
	private IModel getModel() {
		return model;
	}

	/**
	 * Set the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Get the order.
	 */
	private UserOrder getStackOrder() {
		return StackOrder;
	}

	/**
	 * Set the order.
	 *
	 * @param StackOrder the new order
	 */
	private void setStackOrder(final UserOrder StackOrder) {
		this.StackOrder = StackOrder;
	}

	/**
	 * Clear the order.
	 */
	private void clearStackOrder() {
		this.StackOrder = UserOrder.Nop;
	}

	/**
	 * Order perform.
	 *
	 * @param UserOrder the user order
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.UserOrder)
	 */
	public void orderPerform(final UserOrder UserOrder) throws IOException {
		this.setStackOrder(UserOrder);
	}
}
