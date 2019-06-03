package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoulderDashModelTest {
	
	BoulderDashModel boulderDashModelTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String testString = "/@-";
        this.boulderDashModelTest = new BoulderDashModel(testString);
	}

	@After
	public void tearDown() throws Exception {
	}

    @Test
    public void testGetControllerMap() {
    	Element[][] expected = null;
    	Assert.assertEquals(expected,this.boulderDashModelTest.getControllerMap());
    }
    
    @Test
    public void testSetControllerMap() {
    	Element[][] expected =null;
    	this.boulderDashModelTest.setControllerMap(expected);
    	Assert.assertEquals(expected,this.boulderDashModelTest.getControllerMap());
    }
    
    @Test
    public void testGetElementFromMap() {
    	Element expected = null;
    	Assert.assertEquals(expected,this.boulderDashModelTest.getElementFromMap(1, 1));
    }
    
    @Test
    public void testSetElementToMap() {
    	Element expected = null;
    	this.boulderDashModelTest.setElementToMap(expected, 1, 1);
    	Assert.assertEquals(expected, this.boulderDashModelTest);
    }
    
    @Test
    public void testGetPlayerX() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.boulderDashModelTest.getPlayerX());
    }
    
    @Test
    public void testSetPlayerX() {
    	int expected = 1;
    	this.boulderDashModelTest.setPlayerX(expected);
    	Assert.assertEquals(expected, this.boulderDashModelTest.getPlayerX());
    }
    
    @Test
    public void testGetPLayerY() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.boulderDashModelTest.getPlayerY());
    }
    
    @Test
    public void testSetPlayerY() {
    	int expected = 1;
    	this.boulderDashModelTest.setPlayerY(expected);
    	Assert.assertEquals(expected, this.boulderDashModelTest.getPlayerY());
    }
    
    @Test
    public void testGetExitX() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.boulderDashModelTest.getExitX());
    }
    
    @Test
    public void testSetExitX() {
    	int expected = 1;
    	this.boulderDashModelTest.setExitX(expected);
    	Assert.assertEquals(expected, this.boulderDashModelTest.getExitX());
    }
    
    @Test
    public void testGetExitY() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.boulderDashModelTest.getExitY());
    }
    
    @Test
    public void testSetExitY() {
    	int expected = 1;
    	this.boulderDashModelTest.setExitY(expected);
    	Assert.assertEquals(expected, this.boulderDashModelTest.getExitY());
    }

	@Test
	public void testGetMaxMapWidth() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.boulderDashModelTest.getMaxMapWidth());
	}

	@Test
	public void testSetMaxMapWidth() {
    	int expected = 1;
    	this.boulderDashModelTest.setMaxMapWidth(expected);
    	Assert.assertEquals(expected, this.boulderDashModelTest.getMaxMapWidth());
	}

	@Test
	public void testGetMaxMapHeight() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.boulderDashModelTest.getMaxMapHeight());
	}

	@Test
	public void testSetMaxMapHeight() {
    	int expected = 1;
    	this.boulderDashModelTest.setMaxMapHeight(expected);
    	Assert.assertEquals(expected, this.boulderDashModelTest.getMaxMapHeight());
	}

	@Test
	public void testSwitchElementToTheRight() {
		
	}

	@Test
	public void testSwitchElementToTheLeft() {
		
	}

	@Test
	public void testSwitchElementToTheUp() {
		
	}

	@Test
	public void testSwitchElementToTheDown() {
		
	}

	@Test
	public void testCheckBlockStateRight() {
		
	}

	@Test
	public void testCheckBlockStateLeft() {
		
	}

	@Test
	public void testCheckBlockStateUp() {
		
	}

	@Test
	public void testCheckBlockStateDown() {
		
	}

	@Test
	public void testBoulderDashModel() {
		int expectedStringPositionMax = 1;
		int expectedMaxX = 0;
		int expectedMaxY = 0;
		int expectedStringPosition = 1;
		int expectedX = 1;
		int expectedY = 1;
		assertEquals(expectedStringPositionMax, BoulderDashModel.getBoulderDashModel());
	}

	@Test
	public void testAssignNewMap() {
		int i1 = 5;
		int i2 = 5;
		Assert.assertEquals(testGetElementFromMap(i2, i1), testGetControllerMap());
	}

	@Test
	public void testPlayerMoveUpPerform() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlayerMoveDownPerform() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlayerMoveRightPerform() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlayerMoveLeftPerform() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnemyMovePerformer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGravityElementMovePerformer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetObservable() {

	}

	@Test
	public void testGetHelloWorld() {

	}

	@Test
	public void testLoadHelloWorld() {

	}

}
