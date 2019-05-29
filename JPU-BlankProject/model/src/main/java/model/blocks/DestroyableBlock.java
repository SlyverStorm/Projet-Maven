package model.blocks;

import model.Sprite;
import model.State;

public class DestroyableBlock extends Blocks {

	/**
	 * Sprite is used to get a specific sprite for DestroyableBlock.
	 * State is used to attribute a state to DestroyableBlock.
	 */
	private static Sprite sprite;
	private static State state = State.BREAKABLE;
}
