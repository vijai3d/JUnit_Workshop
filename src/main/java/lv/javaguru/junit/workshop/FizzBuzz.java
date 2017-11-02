package lv.javaguru.junit.workshop;

public class FizzBuzz {

    public String result(int number) {
        if (isDevidedBy(number,3) && isDevidedBy(number,5)) {
            return "FizzBuzz";
        }
        if(number % 3 ==0) {
            return "Fizz";
        }
        if(number % 5 ==0) {
            return "Buzz";
        }
        return "" + number;
    }

    private boolean isDevidedBy(int number, int devider) {
        return  (number%devider)==0;
    }
}
