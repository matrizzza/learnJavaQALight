package currency;

public class Currency {
    private int kursNBU;
    private double marga = 0.1;

    public Currency(int kursNBU) {
        this.kursNBU = kursNBU;
    }

    public int getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(int kursNBU) {
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
        System.out.println(String.format("For %s UAH you got %s by kursNBU $s", numberOfGrn, tempResult, kursBuy));
        return tempResult;
    }
}
