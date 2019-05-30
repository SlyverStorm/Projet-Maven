package model.mobileElement.enemy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EnemyUpDownTest {
	EnemyUpDown enemy;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		enemy = new EnemyUpDown();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testConstructor() {
		
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

	
	//Excluded part always return false for boolean method or do nothing for void method
	
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

}
