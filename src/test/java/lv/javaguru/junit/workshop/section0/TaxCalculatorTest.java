package lv.javaguru.junit.workshop.section0;


import lv.javaguru.junit.workshop.section1.TaxCalculator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

public class TaxCalculatorTest {

    private TaxProvidedByYear taxProvidedByYear;
    private TaxCalculator taxCalculator;

    @Before
    public void init() {
        taxProvidedByYear = Mockito.mock(TaxProvidedByYear.class);

    }

    @Test
    public void incomeZero() {
            int year = 2010;
            Mockito.doReturn(20000.0).when(taxProvidedByYear).getTaxAfterBorder(year);

            double income = 0.0;
            double tax = taxCalculator.calculateTax(year, income);
            assertEquals(tax, 0.0, 0.0001);
            Mockito.verify(taxProvidedByYear).getTaxBorder(year);
            Mockito.verify(taxProvidedByYear, times(1)).getTaxBorder(year);
        }

    @Test
    public void shouldReturn25PercentIfIncomeLessThan20k() {
        int year = 2010;

        double tax = taxCalculator.calculateTax(year, 10000);
        assertEquals(tax, 2500, 0.000001);
    }

    @Test
    public void shouldReturn25Plus40PercentFromMoreThan20000K() {
        int year = 2010;
        Mockito.doReturn(20000.0).when(taxProvidedByYear).getTaxBorder(year);
        Mockito.doReturn(0.5).when(taxProvidedByYear).getTaxBeforeBorder(year);
        Mockito.doReturn(0.5).when(taxProvidedByYear).getTaxAfterBorder(year);
        double tax = taxCalculator.calculateTax(year, 30000);
        assertEquals(tax, 9000, 0.000001);
    }
}