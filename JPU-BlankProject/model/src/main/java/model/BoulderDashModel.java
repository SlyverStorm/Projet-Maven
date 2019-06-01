package model;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.HelloWorld;
import model.Sprite;
import model.blocks.DestroyableBlock;
import model.blocks.EmptyBlock;
import model.blocks.ExitBlock;
import model.blocks.WallBlock;
import model.mobileElement.Player;
import model.mobileElement.enemy.Enemy;
import model.mobileElement.enemy.EnemyLeftRight;
import model.mobileElement.enemy.EnemyUpDown;
import model.mobileElement.gravityElement.DiamondBlock;
import model.mobileElement.gravityElement.RockBall;


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
	 * @throws IOException 
	 */
	public BoulderDashModel(final String map) throws IOException {
		
		boolean isMapCheckFinished = true;
		int stringPosition = 1;
		int x = 1;
		int y = 1;
		
		while(isMapCheckFinished) {
			
			Sprite wallBlockSprite = new Sprite('w',"WallBlockImage");
			Sprite destroyableBlockSprite = new Sprite('d',"DestroyableBlockImage");
			Sprite emptyBlockSprite = new Sprite('e',"EmptyBlockImage");
			Sprite rockBallSprite = new Sprite('r',"RockBallImage");
			Sprite diamondBlockSprite = new Sprite('m',"DiamondBlockImage");
			Sprite exitBlockSprite = new Sprite('x',"ExitBlockImage");
			Sprite enemySprite = new Sprite('o',"EnemyImage");
			Sprite playerSprite = new Sprite('p',"PlayerImage");
			
			
			switch(map.charAt(stringPosition)) {
			case ('w') :
				this.controllerMap[x][y] = new WallBlock(x,y,wallBlockSprite);
				x++;
				break;
			case('d') :
				this.controllerMap[x][y] = new DestroyableBlock(x,y,destroyableBlockSprite);
				x++;
				break;
			case('e') :
				this.controllerMap[x][y] = new EmptyBlock(x,y,emptyBlockSprite);
				x++;
				break;
			case('r') :
				this.controllerMap[x][y] = new RockBall(x,y,rockBallSprite);
				x++;
				break;
			case('m') :
				this.controllerMap[x][y] = new DiamondBlock(x,y,diamondBlockSprite);
				x++;
				break;
			case('x') :
				this.controllerMap[x][y] = new ExitBlock(x,y,exitBlockSprite);
				x++;
				break;
			case('1') :
				EnemyUpDown moveUD = new EnemyUpDown();
				this.controllerMap[x][y] = new Enemy(x,y,enemySprite,moveUD);
				x++;
				break;
			case('2') :
				EnemyLeftRight moveLR = new EnemyLeftRight();
				this.controllerMap[x][y] = new Enemy(x,y,enemySprite,moveLR);
				x++;
			case('p') :
				this.controllerMap[x][y] = new Player(x,y,playerSprite);
				x++;
				break;
			case(' ') :
				x = 1;
				y++;
				break;
			case('f') :
				isMapCheckFinished = false;
				break;
			}
			stringPosition++;
		}
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
