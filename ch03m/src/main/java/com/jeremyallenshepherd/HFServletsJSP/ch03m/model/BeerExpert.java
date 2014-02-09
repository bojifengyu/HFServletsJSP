package com.jeremyallenshepherd.HFServletsJSP.ch03m.model;

import java.util.*;

/**
 * This class takes a color argument and based on its value returns a {@link java.util.List List} of beer brands  
 * 
 * @author Jeremy Shepherd
 *
 */
public class BeerExpert {

	/**
	 * Decide on a list of beer brands to send back based on the value of the color parameter 
	 * 
	 * @param color the beer color which the user asking advice for
	 * @return List of appropriate beer brands
	 */
	public List<String> getBrands(String color) {

		List<String> brands = new ArrayList<String>();
		if (color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return brands;
	}
}