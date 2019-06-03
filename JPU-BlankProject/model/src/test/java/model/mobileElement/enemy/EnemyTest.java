package model.mobileElement.enemy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;
import model.State;

public class EnemyTest {
	Enemy enemyTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		enemyTest = new Enemy(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEnemy() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		State expectedstate = State.ENEMY;
		assertEquals(expectedx, enemyTest.getX());
		assertEquals(expectedy, enemyTest.getY());
		assertEquals(expectedsprite, enemyTest.getSprite());
		assertEquals(expectedstate, enemyTest.getState());
	}

	@Test
	public void testGetDirection() {
		boolean expecteddirection = false;
		assertEquals(expecteddirection, enemyTest.getDirection());
	}

	@Test
	public void testSetDirection() {
		boolean expecteddirection = true;
		enemyTest.setDirection(true);
		assertEquals(expecteddirection, enemyTest.getDirection());
	}

}
