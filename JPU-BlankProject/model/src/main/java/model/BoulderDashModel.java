package model;

import java.io.File;
import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.HelloWorld;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class BoulderDashModel extends Observable implements IModel {

	
	private Element[][] controllerMap;
	

	public Element[][] getControllerMap() {
		return controllerMap;
	}

	public void setControllerMap(Element[][] controllerMap) {
		this.controllerMap = controllerMap;
	}
	
	public void setElementToMap(Element element, final int x, final int y) {
		controllerMap[x][y] = element;
	}
	
	public BoulderDashModel(File fileName) {
		
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
