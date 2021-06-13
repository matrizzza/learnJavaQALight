package currency;

public class Euro extends Currency implements IsFreeConverted {
    public Euro(double kursNBUEx) {
        super(kursNBUEx);
    }

    @Override
    String getCurrencyName() {
        return "EUR";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
