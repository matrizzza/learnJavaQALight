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
    }
}
