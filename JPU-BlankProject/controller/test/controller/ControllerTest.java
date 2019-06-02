package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
import contract.IView;
import contract.UserOrder;

public class ControllerTest {
	
	int score = 0;
	
	int NbrDiamondI = 0;
	
	int NbrDiamondC = 0;
	
	private IView view;
	
	private IModel model;
	
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
	public void testMobileElement() {
		
	}
	
	@Test
	public void testCountI() {
		
	}
	
	@Test
	public void testCountC() {
	}
	
	@Test
	public void testScoreIncrease() {
		assertEquals(2,NbrDiamondI-NbrDiamondC);
	}
	
	@Test
	public void testGetStackOrder() {
		final UserOrder expected = UserOrder.Right;
		assertEquals(expected, this.StackOrder);
	}

}
