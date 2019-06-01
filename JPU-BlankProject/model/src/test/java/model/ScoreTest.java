package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ScoreTest {
	ScoreTest scoreTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		scoreTest = new ScoreTest();
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testGetScore() {
		int expectedscore = 1;
		assertEquals(expectedscore, scoreTest.testGetScore());
	}

	@Test
	public void testSetScore() {
		int expectedscore = 2;
		scoreTest.testSetScore(2);
		assertEquals(expectedscore, scoreTest.testGetScore());
	}

	@Test
	public void testScore() {
		int expectedscore = 1;
		assertEquals(expectedscore, scoreTest.testGetScore());
	}*/

}
