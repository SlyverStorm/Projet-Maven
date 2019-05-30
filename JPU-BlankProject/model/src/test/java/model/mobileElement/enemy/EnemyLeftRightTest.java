package model.mobileElement.enemy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EnemyLeftRightTest {
	EnemyLeftRight enemy;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		enemy = new EnemyLeftRight();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testContructor() {
		
	}

	@Test
	public void testMoveLeftRight() {
		
	}

	@Test
	public void testIsMoveLeftPossible() {
		boolean expected = false;
		assertEquals(expected, this.enemy.isMoveLeftPossible());
	}

	@Test
	public void testIsMoveRightPossible() {
		boolean expected = false;
		assertEquals(expected, this.enemy.isMoveRightPossible());
	}

	@Test
	public void testMoveUpDown() {
		
	}

	@Test
	public void testIsMoveUpPossible() {
		boolean expected = false;
		assertEquals(expected, this.enemy.isMoveUpPossible());
	}

	@Test
	public void testIsMoveDownPossible() {
		boolean expected = false;
		assertEquals(expected, this.enemy.isMoveDownPossible());
	}

}
