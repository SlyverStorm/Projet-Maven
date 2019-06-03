package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ScoreTest {
	Score scoreTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		scoreTest = new Score(0, 0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetScore() {
		int expectedscore = 0;
		assertEquals(expectedscore, scoreTest.getScore());
	}

	@Test
	public void testSetScore() {
		int expectedscore = 2;
		scoreTest.setScore(2);
		assertEquals(expectedscore, scoreTest.getScore());
	}

	@Test
	public void testScore() {
		int expectedscore = 0;
		assertEquals(expectedscore, scoreTest.getScore());
	}

}
