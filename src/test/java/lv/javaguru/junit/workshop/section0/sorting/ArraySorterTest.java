package lv.javaguru.junit.workshop.section0.sorting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySorterTest {

    private ArraySorter arraySorter = new ArraySorter();

    @Test
    public void test1() {
        int[] arr = {};
        int[] result = arraySorter.sort(arr);
        assertEquals(result.length, 0);
    }

    @Test
    public void test2() {
        int[] arr = {1};
        int[] result = arraySorter.sort(arr);
        assertEquals(result.length, 1);
        assertEquals(result[0], 1);
    }

    @Test
    public void test3() {
        int[] arr = {2, 1};
        int[] result = arraySorter.sort(arr);
        assertEquals(result.length, 2);
        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
    }

/*
    public int[] createArrayWithRandomNumbers(int size) {

    }
*/

}