package com.palacio.solution.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.palacio.solution.RemoveDuplicatesLettersService;

class RemoveDuplicateLettersTest {

	@Test
	void removeDuplicateLetters() {
		String input = "AbraCadABraAlakAzam";
		String expected = "AbrCdlkzm";
		String result = RemoveDuplicatesLettersService.removeDuplicateCharactersIgnoreCase(input);
		validateResult(expected, result);
	}

	private void validateResult(String expected, String result) {
		assertEquals(expected, result, "The result does not match");
	}
	
}
