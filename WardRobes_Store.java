package com.sea.design;

/**
 * @author ankit
 * wardrob store main app
 *
 */
public class WardRobes_Store {

	public static void main(String[] args) {
		
		System.out.println("WARDROB STORE");
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		
		BasicWardrobes wardrobes = new RealWood();
		wardrobes = new ExtraSelf(wardrobes);
		wardrobes =new Drawer(wardrobes);
		wardrobes =new Mirror(wardrobes);
		wardrobes =new Locker(wardrobes);
		System.out.println(wardrobes.getDescription() + " rupp " + wardrobes.TwoDoorcost());

	}

}
