package currency;

public class MainClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(28);
        
        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(29);
        System.out.println(dollar.getKursNBU());
        System.out.println(dollar.getMarga());

        dollar.setMarga(0.11);
        System.out.println(dollar.getMarga());

        dollar.exchangeGrnToCurrency(1000);
        dollar.setKursNBU(30);
        dollar.exchangeGrnToCurrency(1000);
        dollar.setKursNBU(40);
        dollar.exchangeGrnToCurrency(1000);

        dollar.setMarga(0.14);
        dollar.exchangeGrnToCurrency(1000);

        dollar.exchangeCurrencyToGrn(100);

        Euro euro = new Euro(35);
        System.out.println(euro.getKursNBU());

        euro.exchangeGrnToCurrency(1000);
        euro.exchangeCurrencyToGrn(100);
        euro.setKursNBU(36);
        euro.setMarga(0.12);
        euro.exchangeCurrencyToGrn(1000);

        UZS uzs = new UZS(0.0021);
        uzs.exchangeGrnToCurrency(100);
        uzs.setKursNBU(0.0026);
        uzs.exchangeCurrencyToGrn(100);

        // HW8
        Bitcoin bitcoin = new Bitcoin(259999);
        System.out.println(bitcoin.getKursNBU());
        bitcoin.exchangeCurrencyToGrn(100);
        bitcoin.exchangeGrnToCurrency(100);
    }
}
