package model.mobileElement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;

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
		player = new Player(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMovePlayerUp() {
	}

	@Test
	public void testMovePlayerRight() {
	}

	@Test
	public void testMovePlayerDown() {
	}

	@Test
	public void testMovePlayerLeft() {
	}

	@Test
	public void testPlayer() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		assertEquals(expectedx, player.getX());
		assertEquals(expectedy, player.getY());
		assertEquals(expectedsprite, player.getSprite());
		
	}

	@Test
	public void testIsMoveUpPossible() {
	}

	@Test
	public void testIsMoveDownPossible() {
	}

	@Test
	public void testIsMoveLeftPossible() {
	}

	@Test
	public void testIsMoveRightPossible() {
	}

}
