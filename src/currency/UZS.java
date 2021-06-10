package currency;

public class UZS extends Currency implements IsFreeConverted{
    public UZS(double kursNBUEx) {
        super(kursNBUEx);
    }

    @Override
    String getCurrencyName() {
        return "UZS";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
