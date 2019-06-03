package model.mobileElement.gravityElement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;

public class DiamondBlockTest {
	DiamondBlock diamondBlock;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		diamondBlock = new DiamondBlock(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDiamondBlock() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		assertEquals(expectedx, diamondBlock.getX());
		assertEquals(expectedy, diamondBlock.getY());
		assertEquals(expectedsprite, diamondBlock.getSprite());
	}

}
