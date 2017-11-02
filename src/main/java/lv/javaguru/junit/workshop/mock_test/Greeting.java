package lv.javaguru.junit.workshop.mock_test;

public class Greeting  {

    private Contract contract;

    public Greeting(Contract con) {
        this.contract = con;
    }

    public String sayHello() {
        System.out.println("hello" + contract.addWord());
        return "hello" + contract.addWord();
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting(new Concatinator());
        greeting.sayHello();
    }
}
