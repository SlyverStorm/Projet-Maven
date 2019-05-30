package model;

import java.io.File;
import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.HelloWorld;

/**
 * The BoulderDash game Model class.
 *
 * @author Gabriel RICARD
 */
public final class BoulderDashModel extends Observable implements IModel {

	/**
	 * The double entry Element map.
	 */
	private Element[][] controllerMap;
	
	/**
	 * The player abscissa coordinate.
	 */
	private int playerX;
	
	/**
	 * The player ordinate coordinate.
	 */
	private int playerY;
	
	/**
	 * The exit abscissa coordinate.
	 */
	private int exitX;
	
	/**
	 * The exit ordinate coordinate.
	 */
	private int exitY;
	
	
	
	
	/**
	 * Get the map.
	 * 
	 * @return the map
	 */
	public Element[][] getControllerMap() {
		return controllerMap;
	}
	
	/**
	 * Set the map.
	 * 
	 * @param controllerMap , new map to assign
	 */
	public void setControllerMap(Element[][] controllerMap) {
		this.controllerMap = controllerMap;
	}
	
	/**
	 * Get an element from the double entry Element table.
	 * 
	 * @param x , abscissa of the element
	 * @param y , ordinate of the element
	 * @return the Element you're looking for
	 */
	public Element getElementFromMap(final int x, final int y) {
		return controllerMap[x][y];
	}
	/**
	 * Set an Element on the map.
	 * 
	 * @param element , element to set
	 * @param x , abscissa coordinate of the element to set
	 * @param y , ordinate coordinate of the element to set
	 */
	public void setElementToMap(Element element, final int x, final int y) {
		controllerMap[x][y] = element;
	}
	
	/**
	 * Get the player abscissa coordinate.
	 * 
	 * @return player abscissa coordinate
	 */
	public int getPlayerX() {
		return playerX;
	}
	
	/**
	 * Set the player abscissa coordinate.
	 * 
	 * @param playerX , abscissa coordinate to set
	 */
	public void setPlayerX(int playerX) {
		this.playerX = playerX;
	}

	/**
	 * Get the player ordinate coordinate.
	 * 
	 * @return player ordinate coordinate
	 */
	public int getPlayerY() {
		return playerY;
	}
	
	/**
	 * Set the player ordinate coordinate.
	 * 
	 * @param playerY , ordinate coordinate to set
	 */
	public void setPlayerY(int playerY) {
		this.playerY = playerY;
	}
	
	/**
	 * Get the exit abscissa coordinate.
	 * 
	 * @return player abscissa coordinate
	 */
	public int getExitX() {
		return exitX;
	}

	/**
	 * Set the exit abscissa coordinate.
	 * 
	 * @param exitX , abscissa coordinate to set
	 */
	public void setExitX(int exitX) {
		this.exitX = exitX;
	}
	
	/**
	 * Get the exit ordinate coordinate.
	 * 
	 * @return exit ordinate coordinate
	 */
	public int getExitY() {
		return exitY;
	}
	
	/**
	 * Set the exit ordinate coordinate.
	 * 
	 * @param exitX , ordinate coordinate to set
	 */
	public void setExitY(int exitY) {
		this.exitY = exitY;
	}
	
	
	/**
	 * Our model constructor.
	 * 
	 * @param map , our map String to translate in an Element[][]
	 */
	public BoulderDashModel(final String map) {
		
	}

	
	/**
	 * Pour plus tard.
	 */
	@Override
	public HelloWorld getHelloWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadHelloWorld(String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		//Database process :
	
	
	/**
	/** The helloWorld. */
	//private HelloWorld helloWorld;

	/**
	 * Instantiates a new model.
	 */
	//public BoulderDashModel() {
		//this.helloWorld = new HelloWorld();
	//}

	/**
     * Gets the hello world.
     *
     * @return the hello world
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	//public HelloWorld getHelloWorld() {
		//return this.helloWorld;
	//}

	/**
     * Sets the hello world.
     *
     * @param helloWorld
     *            the new hello world
     */
	//private void setHelloWorld(final HelloWorld helloWorld) {
		//this.helloWorld = helloWorld;
		//this.setChanged();
		//this.notifyObservers();
	//}

	/**
     * Load hello world.
     *
     * @param code
     *            the code
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	//public void loadHelloWorld(final String code) {
		//try {
			//final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			//this.setHelloWorld(daoHelloWorld.find(code));
		//} catch (final SQLException e) {
			//e.printStackTrace();
		//}
	//}

	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	//public Observable getObservable() {
		//return this;
	//}
	
}
