package lv.javaguru.junit.workshop.section0.taxcalculator;

public interface TaxProviderByYear {

    double getTaxBorder(int year);

    double getTaxBeforeBorder(int year);

    double getTaxAfterBorder(int year);

}
