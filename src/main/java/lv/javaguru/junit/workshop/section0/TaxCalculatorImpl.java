package lv.javaguru.junit.workshop.section0;

public class TaxCalculatorImpl implements TaxCalculator {

    private static final double BORDER_20k = 20000;
    private static final double TAX_25 = 0.25;
    private static final double TAX_40 = 0.4;

    private TaxProvidedByYear taxProvidedByYear;

    public TaxCalculatorImpl(TaxProvidedByYear taxProvidedByYear) {
        this.taxProvidedByYear = taxProvidedByYear;
    }

    @Override
    public double calculateTax(int year, double income) {
        if (income <= BORDER_20k) {
            return income * TAX_25;
        } else {
            return BORDER_20k*TAX_25 +(income-BORDER_20k)*TAX_40;
        }

    }
}
