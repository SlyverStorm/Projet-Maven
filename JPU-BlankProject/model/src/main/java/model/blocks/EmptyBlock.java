package model.blocks;

import model.Sprite;
import model.State;

public class EmptyBlock extends Blocks {

	/**
	 * Sprite is used to get a specific sprite for EmptyBlock.
	 * State is used to attribute a state to the EmptyBlock.
	 */
	private static Sprite sprite;
	private static State state = State.EMPTY;
}
