package com.sea.design;

/**
 * @author ankit
 * extends addons and return a new added drawer
 */
public class Drawer extends Addons {
	/**
	 * @param wardrobes
	 */
	public Drawer(BasicWardrobes wardrobes) {
		this.wardrobes=wardrobes;
	}


	public String getDescription() {
		return wardrobes.getDescription()+" Drawer added ";
	}
	public double TwoDoorcost() {
		return 2000.0 + wardrobes.TwoDoorcost();
	}
	public double ThreeDoorcost() {
		return 2000.0 + wardrobes.ThreeDoorcost();
	}
}
