package lv.javaguru.junit.workshop.section1;

public class TaxCalculator {

    private static final double BORDER_20k = 20000;
    private static final double TAX_25 = 0.25;
    private static final double TAX_40 = 0.4;

    public double calculateTax(double income) {
        if (income <= BORDER_20k) {
            return income * TAX_25;
        } else {
            return BORDER_20k * TAX_25 + (income - BORDER_20k) * TAX_40;
        }
    }

}
