package lv.javaguru.junit.workshop.section0;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {

    private ArraySorter arraySorter = new ArraySorter();

    @Test
    public void test_sorter1() {
        int[] arr = {1};
        int[] result = arraySorter.sort(arr);
        assertEquals(result.length, 1);
    }

    @Test
    public void test_sorter2() {
        int[] arr = {2,1};
        int[] result = arraySorter.sort(arr);
        assertEquals(result.length, 2);
        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
    }

}