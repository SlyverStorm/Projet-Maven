package controller;

import static org.junit.Assert.*;

import java.io.IOException;

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
	private UserOrder testGetStackOrder() {
		final String expected = "Right";
		assertEquals(expected, this.StackOrder);
		return StackOrder;
	}
	
	@Test
	private void testSetStackOrder(UserOrder StackOrder) {
		this.StackOrder = StackOrder;
	}
	
	@Test
	private void testClearStackOrder() {
        this.StackOrder = UserOrder.Nop;
	}
	
	@Test
	public void testOrderPerform(UserOrder UserOrder) throws IOException {
		this.testSetStackOrder(UserOrder);
	}

}
