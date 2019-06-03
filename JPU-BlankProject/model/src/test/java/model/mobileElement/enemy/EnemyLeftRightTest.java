package model.mobileElement.enemy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;
import model.State;

public class EnemyLeftRightTest {
	EnemyLeftRight enemyLeftRightTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		enemyLeftRightTest = new EnemyLeftRight(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMoveLeftRight() {
	}

	@Test
	public void testEnemyLeftRight() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		assertEquals(expectedx, enemyLeftRightTest.getX());
		assertEquals(expectedy, enemyLeftRightTest.getY());
		assertEquals(expectedsprite, enemyLeftRightTest.getSprite());
	}

	@Test
	public void testIsMoveLeftPossible() {
	}

	@Test
	public void testIsMoveRightPossible() {
	}

}
