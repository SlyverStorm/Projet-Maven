package model.blocks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;
import model.State;

public class WallBlockTest {
	WallBlock wallBlock;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		wallBlock = new WallBlock(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWallBlock() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		State expectedstate = State.UNBREAKABLE;
		assertEquals(expectedx, wallBlock.getX());
		assertEquals(expectedy, wallBlock.getY());
		assertEquals(expectedsprite, wallBlock.getSprite());
		/*assertEquals(expectedstate, wallBlock.getState());*/
	}

}
