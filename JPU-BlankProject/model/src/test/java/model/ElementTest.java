package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.blocks.EmptyBlock;

public class ElementTest {

	Element element;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		element = new EmptyBlock(1,1,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testElement() {
		int expectedx = 1;
		int expectedy = 1;
		Sprite expectedsprite = null;
		State expectedstate = null;
		assertEquals(expectedx, element.getX());
		assertEquals(expectedy, element.getY());
		assertEquals(expectedsprite, element.getSprite());
		/*assertEquals(expectedstate, element.getState());*/
	}

	@Test
	public void testGetX() {
		int expectedx = 1;
		assertEquals(expectedx, element.getX());
	}

	@Test
	public void testSetX() {
		int expectedx = 2;
		element.setX(2);
		assertEquals(expectedx, element.getX());
	}

	@Test
	public void testGetY() {
		int expectedy = 1;
		assertEquals(expectedy, element.getY());
	}

	@Test
	public void testSetY() {
		int expectedy = 2;
		element.setY(2);
		assertEquals(expectedy, element.getY());
	}

	@Test
	public void testGetSprite() {
		Sprite expectedsprite = null;
		assertEquals(expectedsprite, element.getSprite());
	}

	@Test
	public void testSetSprite() {
		Sprite expectedsprite = null;
		element.setSprite(null);
		assertEquals(expectedsprite, element.getSprite());
	}

	/*@Test
	public <image> void testGetImage() {
		image expectedimage = null;
		assertEquals(expectedimage, element.getImage());
	}*/

	/*@Test
	public void testGetState() {
		State expectedstate = null;
		assertEquals(expectedstate, element.getState());
	}*/

	@Test
	public void testSetState() {
		State expectedstate = null;
		element.setState(null);
		assertEquals(expectedstate, element.getState());
	}

}
