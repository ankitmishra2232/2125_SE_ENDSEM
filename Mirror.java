package com.sea.design;

/**
 * @author ankit
 * mirror is added
 */
public class Mirror extends Addons{
	/**
	 * @param wardrobes
	 */
	public Mirror(BasicWardrobes wardrobes) {
		this.wardrobes=wardrobes;
	}
	
	public String getDescription() {
		return wardrobes.getDescription()+"  Mirror added ";
	}
	
	public double TwoDoorcost() {
		return 4000.0 + wardrobes.TwoDoorcost();
	}

	public double ThreeDoorcost() {
		return 4000.0 + wardrobes.ThreeDoorcost();
	}

}
