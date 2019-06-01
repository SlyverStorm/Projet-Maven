package model.blocks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;
import model.State;

public class DestroyableBlockTest {
	DestroyableBlock destroyableBlock;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		destroyableBlock = new DestroyableBlock(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDestroyableBlock() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		State expectedstate = State.BREAKABLE;
		assertEquals(expectedx, destroyableBlock.getX());
		assertEquals(expectedy, destroyableBlock.getY());
		assertEquals(expectedsprite, destroyableBlock.getSprite());
		assertEquals(expectedstate, destroyableBlock.getState());
	}

}
