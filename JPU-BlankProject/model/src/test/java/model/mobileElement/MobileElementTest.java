package model.mobileElement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;
import model.State;

public class MobileElementTest {
	MobileElement mobileElementTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mobileElementTest = new Player(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMobileElement() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		assertEquals(expectedx, mobileElementTest.getX());
		assertEquals(expectedy, mobileElementTest.getY());
		assertEquals(expectedsprite, mobileElementTest.getSprite());
	}

	@Test
	public void testMoveUp() {
	}

	@Test
	public void testMoveDown() {
	}

	@Test
	public void testMoveRight() {
	}

	@Test
	public void testMoveLeft() {
	}

}
