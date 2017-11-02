package lv.javaguru.junit.workshop.section1;

public class TaxCalculatorImpl implements TaxCalculator, MailSender{

    private TaxProviderByYear taxProviderByYear;


    @Override
    public double calculateTax(int year,
                               double income) {
        double taxBorder = taxProviderByYear.getTaxBorder(year);
        double taxBeforeBorder = taxProviderByYear.getTaxBeforeBorder(year);
        double taxAfterBorder = taxProviderByYear.getTaxAfterBorder(year);

        if (income <= taxBorder) {
            return income * taxBeforeBorder;
        }
        sendMail(income);
        return taxBorder * taxBeforeBorder
                + (income - taxBorder) * taxAfterBorder;
    }

    @Override
    public void sendMail(double income) {

    }
}
