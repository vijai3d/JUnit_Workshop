package lv.javaguru.junit.workshop.mock_test;

public class Concatinator implements Contract {
    String word = " Jim";
    public String addWord() {
        return this.word;
    }
}
