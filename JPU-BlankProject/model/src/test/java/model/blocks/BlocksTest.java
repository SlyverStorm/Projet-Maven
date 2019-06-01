package model.blocks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;

public class BlocksTest {
	Blocks blocks;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		blocks = new EmptyBlock(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBlocks() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		assertEquals(expectedx, blocks.getX());
		assertEquals(expectedy, blocks.getY());
		assertEquals(expectedsprite, blocks.getSprite());
	}

}
