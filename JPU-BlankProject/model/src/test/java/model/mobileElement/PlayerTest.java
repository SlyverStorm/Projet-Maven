package model.mobileElement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayerTest {
	
	Player player;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		player = new Player(1,1);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testIsMoveUpPossible() {
		boolean expected = false;
		assertEquals(expected, this.player.isMoveUpPossible());
	}

	@Test
	public void testMovePlayerUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsMoveDownPossible() {
		boolean expected = false;
		assertEquals(expected, this.player.isMoveDownPossible());
	}

	@Test
	public void testMovePlayerDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsMoveLeftPossible() {
		boolean expected = false;
		assertEquals(expected, this.player.isMoveLeftPossible());
	}

	@Test
	public void testMovePlayerLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsMoveRightPossible() {
		boolean expected = false;
		assertEquals(expected, this.player.isMoveRightPossible());
	}

	@Test
	public void testMovePlayerRight() {
		fail("Not yet implemented");
	}

}
