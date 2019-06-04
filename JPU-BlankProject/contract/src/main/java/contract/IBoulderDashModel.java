package contract;

import java.io.IOException;

import model.Element;

public interface IBoulderDashModel {

	ISquare[][] getControllerMap();

	int getMaxMapWidth();

	int getMaxMapHeight();
	
	int getPlayerX();
	
	int getPlayerY();
	
	void enemyMovePerformer() throws IOException;
	
	void gravityElementMovePerformer() throws IOException;

	Object getElementFromMap(int j, int i);
	
	Element getElementFromMap();
	
	void playerMoveRightPerform() throws IOException;
	
	void playerMoveLeftPerform() throws IOException;
	
	void playerMoveUpPerform() throws IOException;
	
	void playerMoveDownPerform() throws IOException;
	
	

}
