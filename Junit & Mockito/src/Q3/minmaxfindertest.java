package Q3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


	class MinmaxFinderTest {

	    @org.junit.jupiter.api.Test
	    void findMinMax() {
	        assertAll(
	                () -> assertArrayEquals(new int[]{0, 34}, Minmaxfinder.findMinMax(new int[]{0, 1, 2, 34, 5, 6})),
	                () -> assertArrayEquals(new int[]{1, 10}, Minmaxfinder.findMinMax(new int[]{1, 2, 10, 5, 6})),
	                () -> assertArrayEquals(new int[]{2, 100}, Minmaxfinder.findMinMax(new int[]{ 100, 2, 34, 5, 6})));
	    }

	    @org.junit.jupiter.api.Test
	    void findMinMax2() {
	        assertAll(
	                () -> assertEquals("Min is 0 Max is 34", Minmaxfinder.findMinMax2(new int[]{0, 1, 2, 34, 5, 6})),
	                () -> assertEquals("Min is 1 Max is 10", Minmaxfinder.findMinMax2(new int[]{1, 2, 10, 5, 6})),
	                () -> assertEquals("Min is 2 Max is 100", Minmaxfinder.findMinMax2(new int[]{ 100, 2, 34, 5, 6})));
	    }
	}
	