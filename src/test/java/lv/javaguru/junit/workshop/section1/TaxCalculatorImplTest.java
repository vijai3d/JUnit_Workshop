package lv.javaguru.junit.workshop.section1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class TaxCalculatorImplTest {

    @Mock private TaxProviderByYear taxProviderByYear;

    @InjectMocks
    private TaxCalculator taxCalculator = new TaxCalculatorImpl();


    @Test
    public void incomeZero() {
        int year = 2010;
        setupTaxProviderByYear(2010, 20000.0, 0.25, 0.4);
        double income = 0.0;
        double tax = taxCalculator.calculateTax(year, income);
        assertEquals(tax, 0.0, 0.0001);

        Mockito.verify(taxProviderByYear).getTaxBorder(year);
        Mockito.verify(taxProviderByYear, times(1)).getTaxBorder(year);
    }

    @Test
    public void income10k() {
        int year = 2010;
        setupTaxProviderByYear(2010, 20000.0, 0.25, 0.4);
        double income = 10000.0;
        double tax = taxCalculator.calculateTax(year, income);
        assertEquals(tax, 2500.0, 0.0001);
    }

    @Test
    public void income20k() {
        int year = 2010;
        setupTaxProviderByYear(2010, 20000.0, 0.25, 0.4);
        double income = 20000.0;
        double tax = taxCalculator.calculateTax(year, income);
        assertEquals(tax, 5000.0, 0.0001);
    }

    @Test
    public void income30k() {
        int year = 2010;
        setupTaxProviderByYear(2010, 20000.0, 0.5, 0.5);
        double income = 30000.0;
        double tax = taxCalculator.calculateTax(year, income);
        assertEquals(tax, 15000.0, 0.0001);
    }

    private void setupTaxProviderByYear(int year,
                                        double taxBorder,
                                        double taxBeforeBorder,
                                        double taxAfterBorder) {
        Mockito.doReturn(taxBorder)
                .when(taxProviderByYear)
                .getTaxBorder(year);

        Mockito.doReturn(taxBeforeBorder)
                .when(taxProviderByYear)
                .getTaxBeforeBorder(year);

        Mockito.doReturn(taxAfterBorder)
                .when(taxProviderByYear)
                .getTaxAfterBorder(year);
    }

}
