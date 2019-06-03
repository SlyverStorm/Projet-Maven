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
	
	int maxHeight = 0;
	
	int maxWidth = 0;
	
	int i = 0;
	
	int j = 0;
	
	String map = "aaaaag";
	
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
		NbrDiamondI = 5;
		NbrDiamondC = 3;
		maxHeight = 5;
		maxWidth = 6;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlay() throws InterruptedException{
	
	}
	
	@Test
	public void testMobileElement() {
		for (i = 0; i <= maxHeight; i++) {
			for (j = 0; j <= maxWidth; j++) {
				this.testCountC();
				this.testScoreIncrease();
			}
		}
	}
	
	@Test
	public void testCountI() {
		 NbrDiamondI = 0;
		 char searchLet = map.charAt(0);
		 for (int i=0; i < map.length(); i++)
		 {
			 char ch = map.charAt(i);
			 if (searchLet == ch) {
			 NbrDiamondI++;
			 }
		 }
	}
	
	@Test
	public void testCountC() {
		 NbrDiamondC = 0;
		 char searchLet = map.charAt(0);
		 for (int i=0; i < map.length(); i++)
		 {
			 char ch = map.charAt(i);
			 if (searchLet == ch) {
			 NbrDiamondC++;
			 }
		 }
	}
	
	@Test
	public void testScoreIncrease() {
		int expected = 2;
		assertEquals(expected,NbrDiamondI-NbrDiamondC);
	}
	
	@Test
	public void testGetStackOrder() {
		final UserOrder expected = UserOrder.Right;
		assertEquals(expected, this.StackOrder);
	}

}
