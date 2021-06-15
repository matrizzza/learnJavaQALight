package currency;

import javax.swing.*;

public class CurrencyExchange {
    public static void main(String[] args) {
        Currency workingCurrency;
        Dollar dollar = new Dollar(28);
        Euro euro = new Euro(32);

        ListOfCurrency.addCurrency(dollar);
        ListOfCurrency.addCurrency(euro);

        int currencyNumber;
        do {
            CurrencyMenu.printCurrencyMenu();
            currencyNumber = CurrencyMenu.getNumberOfCurrencyFromConsole();
            if (currencyNumber == 0){
                System.out.println("Wrong currency. Try again!");
                continue;
            } else if (currencyNumber != 100){
                workingCurrency = CurrencyMenu.setCurrency(currencyNumber);
                System.out.println("Currency is " + workingCurrency.getCurrencyName() + ", kurs is " + workingCurrency.getKursNBU());

                boolean exitActionsMenu;
                do{
                    MenuActions.printActionsMenu(workingCurrency);
                    int menuNumber = MenuActions.getNumberOfCurrencyFromConsole();
                    exitActionsMenu = menuNumber != 100;
                    if (exitActionsMenu){
                        System.out.println("Some Actions");
                    }
                }   while (exitActionsMenu);
            }
        } while (currencyNumber != 100);
    }
}
