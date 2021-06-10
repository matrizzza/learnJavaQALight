package currency;

abstract public class Currency {
    private double kursNBU;
    private double marga = 0.1;

    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double exchangeGrnToCurrency(int numberOfGrn) {
        double kursBuy = kursNBU * (1 + marga);
        double tempResult = numberOfGrn / kursBuy;
        System.out.println(String.format("For %s UAH you got %s %s by kursNBU $s", numberOfGrn, tempResult, getCurrencyName(), kursBuy));
        return tempResult;
    }

    public double exchangeCurrencyToGrn(int numberOfCurrency) {
        double kursSell = kursNBU * (1 - marga);
        double tempResult = numberOfCurrency * kursSell;
        System.out.println(String.format("For %s %s you got %s UaH by kursNBU $s", numberOfCurrency, getCurrencyName(), tempResult, kursSell));
        return tempResult;
    }

    abstract String getCurrencyName();
}
