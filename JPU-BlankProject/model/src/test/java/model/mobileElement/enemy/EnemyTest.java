package model.mobileElement.enemy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EnemyTest {
	Enemy enemyUpDown;
	Enemy enemyLeftRight;
	EnemyUpDown move1;
	EnemyLeftRight move2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		enemyUpDown = new Enemy(1,1,move1);
		enemyLeftRight = new Enemy(1,2,move2);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEnemyIntIntEnemyUpDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnemyIntIntEnemyLeftRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDirection() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDirection() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testMovePerform() {
		fail("Not yet implemented");
	}

}
