package currency;

public class Euro extends Currency {
    public Euro(double kursNBUEx) {
        super(kursNBUEx);
    }

    @Override
    String getCurrencyName() {
        return "EUR";
    }
}
