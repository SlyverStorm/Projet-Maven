package entity;

/**
 * The Class Map
 *
 * @author Thibaut MAITREPIERRE
 */
public class Map {

	/**
	 * Map ID
	 */
	private int	id;

	/**
	 * Map STRING
	 */
	private String map;

	/**
	 * Instantiates a new map.
	 *
	 * @param id
	 *          the id
	 * @param map
	 *          the map
	 */
	public Map(final int id, final String map) {
		this.setId(id);
		this.setMap(map);
	}

	/**
	 * Instantiates a new map.
	 */
	public Map() {
		this(0, "");
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public String getMap() {
		return this.map;
	}

	/**
	 * Sets the message.
	 *
	 * @param map
	 *          the new map
	 */
	public void setMap(final String map) {
		this.map = map;
	}

}
