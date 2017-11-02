package lv.javaguru.junit.workshop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    private boolean isDevidedBy(int number, int devider) {
        return (number % devider) == 0;
    }

    @Test
    public void test1() {
        for (int i = 3; i < 100; i = i + 3) {
            if (isDevidedBy(i, 3) && !isDevidedBy(i, 5)) {
                String result = fizzBuzz.result(i);
                assertEquals(result, "Fizz");
            }
        }

    }

    @Test
    public void test2() {
        for (int i = 5; i < 100; i = i + 5) {
            if (isDevidedBy(i, 5) && !isDevidedBy(i, 3)) {
                String result = fizzBuzz.result(i);
                assertEquals(result, "Buzz");
            }
        }
    }
    @Test
    public void test3() {
        for (int i = 5; i < 100; i = i + 5) {
            if (isDevidedBy(i, 3) && isDevidedBy(i, 5)) {
                String result = fizzBuzz.result(i);
                assertEquals(result, "FizzBuzz");
            }
        }
    }

    @Test
    public void test4() {
        for (int i = 5; i < 100; i = i + 5) {
            if (!isDevidedBy(i, 3) && !isDevidedBy(i, 5)) {
                String result = fizzBuzz.result(i);
                assertEquals(result, "" +i);
            }
        }
    }

}