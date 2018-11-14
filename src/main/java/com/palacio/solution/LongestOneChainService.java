package com.palacio.solution;

public class LongestOneChainService {

	public static Integer getLongestOneChainSize(Integer[] originalArray) {
		Integer longestOneChainSize = 0;
		Integer currentOneChainSize = 0;
		for (int currentPosition = 0; currentPosition < originalArray.length; currentPosition++) {
			if (originalArray[currentPosition] == 1) {
				currentOneChainSize++;
				if (currentOneChainSize > longestOneChainSize) {
					longestOneChainSize = currentOneChainSize;
				}
			} else {
				currentOneChainSize = 0;
			}
		}
		return longestOneChainSize;
	}
}
