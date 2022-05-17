package com.sea.design;

/**
 * @author ankit
 * added Extra rod
 *
 */
public class ExtraHangingRod extends Addons {
	/**
	 * @param wardrobes
	 */
	public ExtraHangingRod(BasicWardrobes wardrobes) {
		this.wardrobes=wardrobes;
	}

	public String getDescription() {
		return wardrobes.getDescription()+" Extra Hanging Rod added ";
	}
	public double TwoDoorcost() {
		return 500.0 + wardrobes.TwoDoorcost();
	}
	public double ThreeDoorcost() {
		return 500.0 + wardrobes.ThreeDoorcost();
	}
}
