package com.palacio.solution.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.palacio.solution.LongestOneChainService;

class LongestOneChainSizeTest {

	@Test
	void getLongestSizeInTheMidle() {
		Integer expected = 3;
		Integer[] originalArray = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0 };
		validateExecutionOutput(expected, originalArray);
	}

	@Test
	void getLongestSizeInTheBeggining() {
		Integer expected = 4;
		Integer[] originalArray = { 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0 };
		validateExecutionOutput(expected, originalArray);
	}

	@Test
	void getLongestSizeInTheEnd() {
		Integer expected = 5;
		Integer[] originalArray = { 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
		validateExecutionOutput(expected, originalArray);
	}

	@Test
	void getLongestSizeJustZeros() {
		Integer expected = 0;
		Integer[] originalArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		validateExecutionOutput(expected, originalArray);
	}

	@Test
	void getLongestSizeJustOnes() {
		Integer expected = 10;
		Integer[] originalArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		validateExecutionOutput(expected, originalArray);
	}

	@Test
	void getLongestSizeNullInput() {
		Integer expected = 4;
		Integer[] originalArray = null;
		Executable codeToExecute = () -> validateExecutionOutput(expected, originalArray);
		assertThrows(NullPointerException.class, codeToExecute, "NullPointer Expected");
	}

	@Test
	void getLongestSizeEmptyInput() {
		Integer expected = 0;
		Integer[] originalArray = {};
		validateExecutionOutput(expected, originalArray);
	}

	private void validateExecutionOutput(Integer expected, Integer[] originalArray) {
		Integer actual = executeSearch(originalArray);
		assertEquals(expected, actual, "The expected size don't match.");
	}

	private Integer executeSearch(Integer[] originalArray) {
		Integer actual = LongestOneChainService.getLongestOneChainSize(originalArray);
		return actual;
	}

}
