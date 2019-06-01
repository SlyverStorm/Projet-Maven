package model.blocks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;
import model.State;

public class ExitBlockTest {
	ExitBlock exitBlock;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		exitBlock = new ExitBlock(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExitBlock() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		State expectedstate = State.EXIT;
		assertEquals(expectedx, exitBlock.getX());
		assertEquals(expectedy, exitBlock.getY());
		assertEquals(expectedsprite, exitBlock.getSprite());
		/*assertEquals(expectedstate, exitBlock.getState());*/
	}

}
