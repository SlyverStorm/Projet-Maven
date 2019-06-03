/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {
    private BoulderDashModel model;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    	String testString = "lul";
        this.model = new BoulderDashModel(testString);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetMessage() {
        Assert.assertEquals("", this.model.getHelloWorld().getMessage());
    }

    /**
     * Test method for {@link model.BoulderDashModel#loadHelloWorld(java.lang.String)}.
     */
    @Test
    public void testGetMessageString() {
        this.model.loadHelloWorld("GB");
        Assert.assertEquals("Hello world", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("FR");
        Assert.assertEquals("Bonjour le monde", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("DE");
        Assert.assertEquals("Hallo Welt", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("ID");
        Assert.assertEquals("Salamat pagi dunia", this.model.getHelloWorld().getMessage());
    }
    
    @Test
    public void testGetControllerMap() {
    	Element[][] expected = null;
    	Assert.assertEquals(expected,this.model.getControllerMap());
    }
    
    @Test
    public void testSetControllerMap() {
    	Element[][] expected =null;
    	this.model.setControllerMap(expected);
    	Assert.assertEquals(expected,this.model.getControllerMap());
    }
    
    @Test
    public void testGetElementFromMap() {
    	Element expected = null;
    	Assert.assertEquals(expected,this.model.getElementFromMap(1, 1));
    }
    
    @Test
    public void testSetElementToMap() {
    	Element expected = null;
    	this.model.setElementToMap(expected, 1, 1);
    	Assert.assertEquals(expected, this.model);
    }
    
    @Test
    public void testGetPlayerX() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.model.getPlayerX());
    }
    
    @Test
    public void testSetPlayerX() {
    	int expected = 1;
    	this.model.setPlayerX(expected);
    	Assert.assertEquals(expected, this.model.getPlayerX());
    }
    
    @Test
    public void testGetPLayerY() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.model.getPlayerY());
    }
    
    @Test
    public void testSetPlayerY() {
    	int expected = 1;
    	this.model.setPlayerY(expected);
    	Assert.assertEquals(expected, this.model.getPlayerY());
    }
    
    @Test
    public void testGetExitX() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.model.getExitX());
    }
    
    @Test
    public void testSetExitX() {
    	int expected = 1;
    	this.model.setExitX(expected);
    	Assert.assertEquals(expected, this.model.getExitX());
    }
    
    @Test
    public void testGetExitY() {
    	int expected = 1;
    	Assert.assertEquals(expected, this.model.getExitY());
    }
    
    @Test
    public void testSetExitY() {
    	int expected = 1;
    	this.model.setExitY(expected);
    	Assert.assertEquals(expected, this.model.getExitY());
    }
    
    @Test
    public void testConstructor() {
    	
    }
}
