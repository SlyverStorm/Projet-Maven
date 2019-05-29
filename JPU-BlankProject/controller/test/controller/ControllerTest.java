package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.UserOrder;

public class ControllerTest {
	
	private UserOrder StackOrder;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.StackOrder = UserOrder.Right;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlay() throws InterruptedException{
		
	}

	@Test
	public void testGetStackOrder() {
		final UserOrder expected = UserOrder.Right;
		assertEquals(expected, this.StackOrder);
	}

}
