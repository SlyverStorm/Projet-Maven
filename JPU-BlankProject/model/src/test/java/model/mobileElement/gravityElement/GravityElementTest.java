package model.mobileElement.gravityElement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;

public class GravityElementTest {
	GravityElement gravityElement;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		gravityElement = new RockBall(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGravityElement() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		assertEquals(expectedx, gravityElement.getX());
		assertEquals(expectedy, gravityElement.getY());
		assertEquals(expectedsprite, gravityElement.getSprite());
	}

	@Test
	public void testIsMoveDownPossible() {
		boolean expectedmove = false;
		assertEquals(expectedmove, gravityElement.isMoveDownPossible());
	}

	@Test
	public void testGravityMove() {

	}

}
