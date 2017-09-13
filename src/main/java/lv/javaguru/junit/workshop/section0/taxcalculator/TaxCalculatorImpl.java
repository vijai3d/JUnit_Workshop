package lv.javaguru.junit.workshop.section0.taxcalculator;

public class TaxCalculatorImpl
        implements TaxCalculator {

    private TaxProviderByYear taxProviderByYear;

    public TaxCalculatorImpl(TaxProviderByYear taxProviderByYear) {
        this.taxProviderByYear = taxProviderByYear;
    }

    @Override
    public double calculateTax(int year,
                               double income) {
        double taxBorder = taxProviderByYear.getTaxBorder(year);
        double taxBeforeBorder = taxProviderByYear.getTaxBeforeBorder(year);
        double taxAfterBorder = taxProviderByYear.getTaxAfterBorder(year);

        if (income <= taxBorder) {
            return income * taxBeforeBorder;
        }
        return taxBorder * taxBeforeBorder
                + (income - taxBorder) * taxAfterBorder;
    }

}
