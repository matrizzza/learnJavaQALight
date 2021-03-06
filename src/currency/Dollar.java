package currency;

public class Dollar extends Currency implements IsFreeConverted{
    public Dollar(int kursNBUEx) {
        super(kursNBUEx);
    }

    @Override
    String getCurrencyName() {
        return "USD";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
