package model.blocks;

import model.Sprite;
import model.State;

public class WallBlock extends Blocks {

	/**
	 * Sprite is used to get a specific sprite for WallBlock.
	 * State is used to attribute a state to WallBlock.
	 */
	private static Sprite sprite;
	private static State state = State.UNBREAKABLE;
}
