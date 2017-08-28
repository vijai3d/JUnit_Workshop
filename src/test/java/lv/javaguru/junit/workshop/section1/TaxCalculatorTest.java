package lv.javaguru.junit.workshop.section1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxCalculatorTest {

    private TaxCalculator taxCalculator = new TaxCalculator();

    @Test
    public void shouldReturnZeroIfIncomeZero() {
        double tax = taxCalculator.calculateTax(0);
        assertEquals(tax, 0, 0.000001);
    }

    @Test
    public void shouldReturn25PercentIfIncomeLessThan20k() {
        double tax = taxCalculator.calculateTax(10000);
        assertEquals(tax, 2500, 0.000001);
    }

    @Test
    public void shouldReturn25PercentIfIncomeEquals20k() {
        double tax = taxCalculator.calculateTax(20000);
        assertEquals(tax, 5000, 0.000001);
    }

    @Test
    public void shouldReturn40PercentIfIncomeMoreThen20k() {
        double income = 30000;
        double tax = taxCalculator.calculateTax(30000);
        double taxForFirst20k = 20000 * 0.25;
        double taxGreater20k = (income - 20000) * 0.4;
        assertEquals(tax, taxForFirst20k + taxGreater20k, 0.000001);
    }

}