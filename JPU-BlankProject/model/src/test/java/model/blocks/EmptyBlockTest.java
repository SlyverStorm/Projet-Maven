package model.blocks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;
import model.State;

public class EmptyBlockTest {
	EmptyBlock emptyBlock;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		emptyBlock = new EmptyBlock(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmptyBlock() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		State expectedstate = State.EMPTY;
		assertEquals(expectedx, emptyBlock.getX());
		assertEquals(expectedy, emptyBlock.getY());
		assertEquals(expectedsprite, emptyBlock.getSprite());
		assertEquals(expectedstate, emptyBlock.getState());
	}

}
