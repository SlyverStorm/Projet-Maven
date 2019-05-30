package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


/**
 * <h1>The Sprite Class.</h1>
 *
 * @author Gabriel RICARD
 * @version 0.2
 */
public class Sprite {
	
	   /** The image. */
    private BufferedImage   image;

    /** The image name. */
    private String  imageName;

    /** The console image. */
    private char    consoleImage;

    /** The is image loaded. */
    private boolean imageLoaded;

    /**
     * Instantiates a new sprite.
     *
     * @param character
     *            the character
     * @param imageName
     *            the image name
     * @throws IOException 
     */
    public Sprite(final char character, final String imageName) throws IOException {
        this.setConsoleImage(character);
        this.setImageName(imageName);
        this.loadImage(character);
    }

    /**
     * Instantiates a new sprite.
     *
     * @param character
     *            the character
     * @throws IOException 
     */
    public Sprite(final char character) throws IOException {
        this(character, "noimage.jpg");
        this.loadImage(character);
    }

    /**
     * Gets the image.
     *
     * @return the image
     */
    public final BufferedImage getImage() {
        return this.image;
    }

    /**
     * Loads image.
     *
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public final void loadImage() throws IOException {
        this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
    }
    
    /**
     * Load a specific image for each respective character.
     * 
     * @param character
     * @throws IOException
     */
    public final void loadImage(final char character) throws IOException {
    	switch (character) {
    		case 'w' : //WallBlock
    			this.setImage(ImageIO.read(new File("images/74359.png")));
    			this.setImage(getImage().getSubimage(1,1,16,16));
    		break;
    		case 'd' : //DestroyableBlock
    			this.setImage(ImageIO.read(new File("images/74359.png")));
    			this.setImage(getImage().getSubimage(17,1,32,16));
    		break;
    		case 'e' : //EmptyBlock
    			this.setImage(ImageIO.read(new File("images/74359.png")));
    			this.setImage(getImage().getSubimage(33,1,48,16));
    		break;
    		case 'r' : //RockBall
    			this.setImage(ImageIO.read(new File("images/74359.png")));
    			this.setImage(getImage().getSubimage(49,1,64,16));
    		break;
    		case 'm' : //DiamondBlock
    			this.setImage(ImageIO.read(new File("images/74359.png")));
    			this.setImage(getImage().getSubimage(65,1,80,16));
    		break;
    		case 'x' : //ExitBlock
    			this.setImage(ImageIO.read(new File("images/74359.png")));
    			this.setImage(getImage().getSubimage(97,1,112,16));
    		break;
    		case 'o' : //Enemy
    			this.setImage(ImageIO.read(new File("images/74359.png")));
    			this.setImage(getImage().getSubimage(1,1,16,16));
    		break;
    		case 'p' : //Player
    			this.setImage(ImageIO.read(new File("images/74336.png")));
    			this.setImage(getImage().getSubimage(1,1,16,16));
    		break;

    	}
    }

    /**
     * Gets the console image.
     *
     * @return the consoleImage
     */
    public final char getConsoleImage() {
        return this.consoleImage;
    }

    /**
     * Sets the image.
     *
     * @param image
     *            the new image
     */
    private void setImage(final BufferedImage image) {
        this.image = image;
    }

    /**
     * Sets the console image.
     *
     * @param consoleImage
     *            the consoleImage to set
     */
    private void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
    }

    /**
     * Gets the image name.
     *
     * @return the imageName
     */
    public final String getImageName() {
        return this.imageName;
    }

    /**
     * Sets the image name.
     *
     * @param imageName
     *            the imageName to set
     */
    private void setImageName(final String imageName) {
        this.imageName = imageName;
    }

    /**
     * Checks if is image loaded.
     *
     * @return true, if is image loaded
     */
    public final boolean isImageLoaded() {
        return this.imageLoaded;
    }

    /**
     * Sets the image loaded.
     *
     * @param isImageLoaded
     *            the new image loaded
     */
    public final void setImageLoaded(final boolean isImageLoaded) {
        this.imageLoaded = isImageLoaded;
    }

}
