package com.sea.design;

/**
 * @author ankit
 * added new Locker
 *
 */
public class Locker extends Addons {
	/**
	 * @param wardrobes
	 */
	public Locker(BasicWardrobes wardrobes) {
		this.wardrobes=wardrobes;
	}
	public String getDescription() {
		return wardrobes.getDescription()+" Locker added ";
	}
	public double TwoDoorcost() {
		return 5000.0 + wardrobes.TwoDoorcost();
	}

	public double ThreeDoorcost() {
		return 5000.0 + wardrobes.ThreeDoorcost();
	}

}
