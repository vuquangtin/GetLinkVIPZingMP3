package com.get.link.zingmp3.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleUtils {
	public static List<Integer> shuffle(int max) {
		if (max > 0) {
			Integer[] intArray = new Integer[max];
			for (int i = 0; i < max; i++) {
				intArray[i] = i;
			}
			return shuffle(intArray);
		}
		return null;

	}

	public static List<Integer> nonshuffle(int max) {
		List<Integer> list = null;
		if (max > 0) {
			list = new ArrayList<Integer>();
			for (int i = 0; i < max; i++) {
				list.add(i);
			}

		}
		return list;

	}

	public static List<Integer> shuffle(Integer[] intArray) {
		List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);

		intList.toArray(intArray);

		System.out.println(Arrays.toString(intArray));
		return intList;
	}
}