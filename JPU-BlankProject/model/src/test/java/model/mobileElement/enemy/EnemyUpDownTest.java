package model.mobileElement.enemy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;

public class EnemyUpDownTest {
	EnemyUpDown enemyUpDownTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMoveUpDown() {
	}

	@Test
	public void testEnemyUpDown() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		assertEquals(expectedx, enemyUpDownTest.getX());
		assertEquals(expectedy, enemyUpDownTest.getY());
		assertEquals(expectedsprite, enemyUpDownTest.getSprite());
	}

	@Test
	public void testIsMoveUpPossible() {
	}

	@Test
	public void testIsMoveDownPossible() {
	}

}
