package model;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

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
 * @author Gabriel RICARD AND Thibaut MAITREPIERRE
 */
public final class BoulderDashModel extends Observable implements IModel, Observer {

	/**
	 * The double entry Element map.
	 */
	public Element[][] controllerMap;
	
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
	 * The maximum height the map can have.
	 */
	private int maxMapHeight;
	
	/**
	 * The maximum width the map can have.
	 */
	private int maxMapWidth;
	
	
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
	 * Get the maximum map width.
	 * @return
	 */
	public int getMaxMapWidth() {
		return maxMapWidth;
	}

	/**
	 * Set the maximum map width.
	 * @param maxMapWidth
	 */
	public void setMaxMapWidth(int maxMapWidth) {
		this.maxMapWidth = maxMapWidth;
	}
	
	/**
	 * Get the maximum map height.
	 * @return
	 */
	public int getMaxMapHeight() {
		return maxMapHeight;
	}

	/**
	 * Set the maximum map height.s
	 * @param maxMapHeight
	 */
	public void setMaxMapHeight(int maxMapHeight) {
		this.maxMapHeight = maxMapHeight;
	}


	
	
	/**
	 * It will swap a sprite with specific coordinates, to the right (x+1).
	 * @param x
	 * @param y
	 * @throws IOException
	 */
	public void switchElementToTheRight(final int x, final int y) throws IOException {
		controllerMap[x+1][y] = controllerMap[x][y];
		controllerMap[x+1][y].setX(x+1);
		Sprite sprite = new Sprite('-',"EmptyBlockImage");
		controllerMap[x][y] = new EmptyBlock(x,y,sprite);
	}
	
	/**
	 * It will swap a sprite with specific coordinates, to the left (x-1).
	 * @param x
	 * @param y
	 * @throws IOException
	 */
	public void switchElementToTheLeft(final int x, final int y) throws IOException {
		controllerMap[x-1][y] = controllerMap[x][y];
		controllerMap[x-1][y].setX(x-1);
		Sprite sprite = new Sprite('-',"EmptyBlockImage");
		controllerMap[x][y] = new EmptyBlock(x,y,sprite);
	}
	
	/**
	 * It will swap a sprite with specific coordinates up side (y+1).
	 * @param x
	 * @param y
	 * @throws IOException
	 */
	public void switchElementToTheUp(final int x, final int y) throws IOException {
		controllerMap[x][y+1] = controllerMap[x][y];
		controllerMap[x][y+1].setY(y+1);
		Sprite sprite = new Sprite('-',"EmptyBlockImage");
		controllerMap[x][y] = new EmptyBlock(x,y,sprite);
	}
	
	/**
	 * It will swap a sprite with specific coordinates down side (y-1).
	 * @param x
	 * @param y
	 * @throws IOException
	 */
	public void switchElementToTheDown(final int x, final int y) throws IOException {
		controllerMap[x][y-1] = controllerMap[x][y];
		controllerMap[x][y-1].setX(y-1);
		Sprite sprite = new Sprite('-',"EmptyBlockImage");
		controllerMap[x][y] = new EmptyBlock(x,y,sprite);
	}
	
	/**
	 * Check the state of the right side block (x+1).
	 * @param x
	 * @param y
	 * @return
	 */
	public State checkBlockStateRight(final int x, final int y) {
		return controllerMap[x+1][y].getState();
	}
	
	/**
	 * Check the state of the left side block (x-1).
	 * @param x
	 * @param y
	 * @return
	 */
	public State checkBlockStateLeft(final int x, final int y) {
		return controllerMap[x-1][y].getState();
	}
	
	/**
	 * Check the state of the up side block (y+1).
	 * @param x
	 * @param y
	 * @return
	 */
	public State checkBlockStateUp(final int x, final int y) {
		return controllerMap[x][y+1].getState();
	}
	
	/**
	 * Check the state of the down side block (y-1).
	 * @param x
	 * @param y
	 * @return
	 */
	public State checkBlockStateDown(final int x, final int y) {
		return controllerMap[x][y-1].getState();
	}
	
	
	/**
	 * BoulderDashModel constructor.
	 * 
	 * @param map , our map String to translate in an Element[][]
	 * @throws IOException 
	 */
	public BoulderDashModel(final String map) throws IOException {
		
		boolean isMapCheckFinished = true;
		boolean isMapCheckFinishedMax = true;
		
		int stringPositionMax = 1;
		int maxX = 0;
		int maxY = 0;
		
		int stringPosition = 1;
		int x = 1;
		int y = 1;
		
		while(isMapCheckFinishedMax) {
			switch(map.charAt(stringPositionMax)) {
			case ('/') :
				maxX++;
				stringPositionMax++;
				break;
			case('@') :
				maxX++;
				stringPositionMax++;
				break;
			case('-') :
				maxX++;
				stringPositionMax++;
				break;
			case('o') :
				maxX++;
				stringPositionMax++;
				break;
			case('D') :
				maxX++;
				stringPositionMax++;
				break;
			case('X') :
				maxX++;
				stringPositionMax++;
				break;
			case('1') :
				maxX++;
				stringPositionMax++;
				break;
			case('2') :
				maxX++;
				stringPositionMax++;
				break;
			case('P') :
				maxX++;
				stringPositionMax++;
				break;
			case (' ') :
				maxX = 0;
				maxY++;
				stringPositionMax++;
				break;
			case ('f') :
				this.setMaxMapHeight(maxX);
				this.setMaxMapWidth(maxY);
				isMapCheckFinishedMax = false;
				break;
			}
		}
		
		
		while(isMapCheckFinished) {
			
			Sprite wallBlockSprite = new Sprite('/',"WallBlockImage");
			Sprite destroyableBlockSprite = new Sprite('@',"DestroyableBlockImage");
			Sprite emptyBlockSprite = new Sprite('-',"EmptyBlockImage");
			Sprite rockBallSprite = new Sprite('o',"RockBallImage");
			Sprite diamondBlockSprite = new Sprite('D',"DiamondBlockImage");
			Sprite exitBlockSprite = new Sprite('X',"ExitBlockImage");
			Sprite enemySprite = new Sprite('#',"EnemyImage");
			Sprite playerSprite = new Sprite('P',"PlayerImage");
			
			
			switch(map.charAt(stringPosition)) {
			case ('/') :
				this.controllerMap[x][y] = new WallBlock(x,y,wallBlockSprite);
				x++;
				break;
			case('@') :
				this.controllerMap[x][y] = new DestroyableBlock(x,y,destroyableBlockSprite);
				x++;
				break;
			case('-') :
				this.controllerMap[x][y] = new EmptyBlock(x,y,emptyBlockSprite);
				x++;
				break;
			case('o') :
				this.controllerMap[x][y] = new RockBall(x,y,rockBallSprite);
				x++;
				break;
			case('D') :
				this.controllerMap[x][y] = new DiamondBlock(x,y,diamondBlockSprite);
				x++;
				break;
			case('X') :
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
				break;
			case('P') :
				this.controllerMap[x][y] = new Player(x,y,playerSprite);
				this.setPlayerX(x);
				this.setPlayerY(y);
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
		
		assignNewMap();
			
	}
	
	/**
	 * Travels the whole map by ordinates (i1) and abscissa (i2). In the end, it returns a new map which is set in controllerMap.
	 */
	public void assignNewMap() {
		for(int i1 = 1; i1 < this.getMaxMapHeight() + 1; i1++) {
			for(int i2 = 1; i2 < this.getMaxMapWidth() +1; i2++) {
				this.getElementFromMap(i2, i1).setMap(controllerMap);
			}
		}
	}
	
	
	
	
	
	// Move methods
	
	/**
	 * PlayerMoveUpPerform method
	 * 
	 * @throws IOException
	 */
	public void playerMoveUpPerform() throws IOException {
		controllerMap[getPlayerX()][getPlayerY()].movePlayerUp();
		this.controllerMap = controllerMap[getPlayerX()][getPlayerY()].getMap();
		this.setPlayerY(getPlayerY()-1);
		this.assignNewMap();
	}
	
	/**
	 * PlayerMoveDownPerform method
	 * 
	 * @throws IOException
	 */
	public void playerMoveDownPerform() throws IOException {
		controllerMap[getPlayerX()][getPlayerY()].movePlayerDown();
		this.controllerMap = controllerMap[getPlayerX()][getPlayerY()].getMap();
		this.setPlayerY(getPlayerY()+1);
		this.assignNewMap();
	}
	
	
	/**
	 * PlayerMoveRightPerform method
	 * 
	 * @throws IOException
	 */
	public void playerMoveRightPerform() throws IOException {
		controllerMap[getPlayerX()][getPlayerY()].movePlayerRight();
		this.controllerMap = controllerMap[getPlayerX()][getPlayerY()].getMap();
		this.setPlayerX(getPlayerX()+1);
		this.assignNewMap();
	}
	
	
	/**
	 * PlayerMoveLeftPerform method
	 * 
	 * @throws IOException
	 */
	public void playerMoveLeftPerform() throws IOException {
		controllerMap[getPlayerX()][getPlayerY()].movePlayerLeft();
		this.controllerMap = controllerMap[getPlayerX()][getPlayerY()].getMap();
		this.setPlayerX(getPlayerX()-1);
		this.assignNewMap();
	} 
	
	
	
	


	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public contract.HelloWorld getHelloWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadHelloWorld(String code) {
		// TODO Auto-generated method stub
		
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
