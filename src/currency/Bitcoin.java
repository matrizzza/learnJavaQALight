package currency;

public class Bitcoin extends Currency {
    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public double exchangeGrnToCurrency(int numberOfGrn) {
        System.out.println(String.format("This operation with currency \"%s\" is forbidden by NBU", getCurrencyName()));
        return numberOfGrn;
    }

    @Override
    public double exchangeCurrencyToGrn(int numberOfCurrency) {
        System.out.println(String.format("This operation with currency \"%s\" is forbidden by NBU", getCurrencyName()));
        return numberOfCurrency;
    }
}
