package contract;

public interface IBoulderDashModel {

	ISquare[][] getControllerMap();

	int getMaxMapWidth();

	int getMaxMapHeight();
	
	int getPlayerX();
	
	int getPlayerY();
	
	void enemyMovePerformer();
	
	void gravityElementMovePerformer();
	
	

}
