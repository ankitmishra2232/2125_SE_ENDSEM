package com.sea.design;

/**
 * @author ankit
 * creates the abstract class
 *
 */
public abstract class BasicWardrobes {
	String description = " new Wardrobes ";
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return
	 * for two door
	 */
	public abstract double TwoDoorcost();
	/**
	 * @return
	 * for three door
	 */
	public abstract double ThreeDoorcost();

}
