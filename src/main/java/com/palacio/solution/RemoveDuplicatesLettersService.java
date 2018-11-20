package com.palacio.solution;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesLettersService {

	public static String removeDuplicateCharactersIgnoreCase(String input) {
		char[] letters = input.toCharArray();
		Set<Character> uniqueLettersFound = new HashSet<Character>();
		String result = "";
		for (Character current : letters) {
			if(!uniqueLettersFound.contains(Character.toLowerCase(current)) && !uniqueLettersFound.contains(Character.toUpperCase(current))) {
				result = result + current;
				uniqueLettersFound.add(current);
			}
		}
		return result;
	}
}
