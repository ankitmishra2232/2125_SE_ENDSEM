package com.sea.design;

/**
 * @author ankit
 * added extra self
 */
public class ExtraSelf extends Addons {
	/**
	 * @param wardrobes
	 */
	public ExtraSelf(BasicWardrobes wardrobes) {
		this.wardrobes =wardrobes;
	}

	public String getDescription() {
		return wardrobes.getDescription()+" ExtraSelf added ";
	}

	public double TwoDoorcost() {
		return 500.0 + wardrobes.TwoDoorcost();
	}
	public double ThreeDoorcost() {
		return 500.0 + wardrobes.ThreeDoorcost();
	}

}
