package controller;

import contract.UserOrder;

import java.io.IOException;
import java.util.Observer;

import contract.IController;
import contract.IBoulderDashModel;
import contract.IView;

/**
 * The Class Controller.
 *
 * @author Antoine Baudusseau
 */
/**
 * @author user
 *
 */
public final class Controller implements IController {

	/** The Constant speed. */
	int speed = 300;
	
	/** The score of the player. */
	int score = 0;
	
	/** The number of diamonds on the map at the beginning of the game. */
	int NbrDiamondI = 0;
	
	
	/** The view. */
	private IView view;
	
	/** The model. */
	private IBoulderDashModel model;
	
	/** The stack order. */
	private UserOrder StackOrder;

	/**
	 * Launch game process.
	 */
	public void play() {
		this.CountI();
		while (CountW()) {
			
			
			
			Thread.sleep(this.speed);
			
			
			
			
			switch (this.getStackOrder()) {
			case Right:
				this.getModel().getElementFromMap(getPlayerX(), getPlayerY()).playerMoveRightPerform();
				break;
			case Left:
				this.getModel().getElementFromMap(getPlayerX(), getPlayerY()).playerMoveLeftPerform();
				break;
			case Up:
				this.getModel().getElementFromMap(getPlayerX(), getPlayerY()).playerMoveUpPerform();
				break;
			case Down:
				this.getModel().getElementFromMap(getPlayerX(), getPlayerY()).playerMoveDownPerform();
				break;
			}
			
			getModel().enemyMovePerformer();
			
			getModel().gravityElementMovePerformer();
			
			
			
			this.clearStackOrder();
			
			getView().getFrame().getBoardPanel().repaint;
		}
		
		System.out.println("GAME OVER !!!");
		
	}
		

	

	
	/**
	 * Count the number of diamonds on the map at the beginning of the game.
	 *
	 * @param model the model
	 */
	public void CountI() {
		for (int i; i <= this.getModel().maxMapHeight; i++) {
			for (int j; j <= this.getModel().maxMapWidth; j++) {
				if (this.getModel().getElementFromMap(j,i).getState == State.LOOTABLE) {
					NbrDiamondI ++;
				}
			}
		}
	}
	
	/**
	 * Count the current number of diamonds on the map.
	 *
	 * @param model the model
	 */
	public int CountC() {
		int NbrDiamondC = 0;
		for (int i; i <= this.getModel().maxMapHeight; i++) {
			for (int j; j <= this.getModel().maxMapWidth; j++) {
				if (this.getModel().getElementFromMap(j,i).getState == State.LOOTABLE) {
					NbrDiamondC ++;
				}
			}
		}
		return NbrDiamondC;
		
	}
	
	/**
	 * Return false when all the diamond where taken by the player.
	 * 
	 * @return
	 */
	public boolean CountW() {
		if (CountC() == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 * Calculation of the player's score.
	 *
	 * @param NbrDiamondI The number of diamond on the map at the beginning of the game
	 * @param NbrDiamondC The current number of diamond on the map
	 */
	public void ScoreIncrease(int NbrDiamondI, int NbrDiamondC) {
		score = NbrDiamondI - NbrDiamondC;
	}
	
	/**
	 * Instantiates a new controller.
	 *
	 * @param view  the view
	 * @param model the model
	 */
	public Controller(final IView view, final IBoulderDashModel model) {
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
	private IBoulderDashModel getModel() {
		return model;
	}

	/**
	 * Set the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IBoulderDashModel model) {
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
	public void orderPerform(final UserOrder UserOrder) {
		this.setStackOrder(UserOrder);
	}
}
