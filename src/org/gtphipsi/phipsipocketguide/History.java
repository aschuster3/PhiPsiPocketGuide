package org.gtphipsi.phipsipocketguide;

import java.util.ArrayList;
import java.util.List;

public class History {
	
	public static final String FOUNDERS = "William Henry Letterman and Charles Page Thomas Moore";
	public static final String LOCATION = "Canonsburg, Pennsylvania, at Jefferson College";
	public static final String FLOWER = "Jaquminot Rose";
	public static final String COLORS_CURR = "Cardinal Red and Hunter Green";
	public static final String COLORS_PAST = "Pink and Lavendar";
	
	public static List<String> histList() {
		ArrayList<String> histList = new ArrayList<String>();
		
		histList.add("Fraternity Founding");
		histList.add("Official Colors");
		histList.add("Georgia Beta History");
		histList.add("Governing Positions");
		
		return histList;
	}
	
}

