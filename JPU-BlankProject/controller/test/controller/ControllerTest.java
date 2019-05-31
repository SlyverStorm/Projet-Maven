package controller;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.UserOrder;

public class ControllerTest {
	
	private UserOrder StackOrder;
	private Controller Controller;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.StackOrder = UserOrder.Right;
        Model Model = mock(Model.class);
        when(Model.getPlayer().isAlive()).thenReturn();
        // Nous pouvons à présent instancier le client :
        this.Controller = new Controller(Model);
	}

	private Model mock(Class<Model> class1) {
		// TODO Auto-generated method stub
		return null;
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
	public void testGetStackOrder() {
		final UserOrder expected = UserOrder.Right;
		assertEquals(expected, this.StackOrder);
	}

}
