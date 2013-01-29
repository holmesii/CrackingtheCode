package com.uml.crackingthecodes.datastructure;

import java.util.*;

public class DataStructure {
	
	/**
	 * HashMap for any objects.
	 * @param obj
	 * @return
	 */
	static public HashMap<Integer,Object> buildMap(Object[] obj){
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		for (int i = 0; i < obj.length; i++)
			map.put(i, obj[i]);
		return map;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
