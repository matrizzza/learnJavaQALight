package currency;

import java.util.Scanner;

public class MenuActions extends Menu {

    public static void printActionsMenu(Currency workingCurrency) {
        System.out.println();
        System.out.println("Choose action for " + workingCurrency.getCurrencyName() + " : ");
        System.out.println("1 :Change Currency to Grn  ");
        System.out.println("2 :Change Grn to Currency ");
        System.out.println("3 :Change kurs NBU ");
        System.out.println("4 :Show kurs NBU ");
        System.out.println("100: Exit from menu");
        System.out.println("Your choice : ");
    }

    public static void doActionsWithCurrency(Currency workingCurrency, int menuNumber) {
        String currencyName = workingCurrency.getCurrencyName();
        System.out.println("You work with " + currencyName);
        switch (menuNumber){
            case 1:
                System.out.println("Enter number of " + currencyName);
                int numberOfCurrency = Menu.getNumberOfCurrencyFromConsole();
                workingCurrency.exchangeCurrencyToGrn(numberOfCurrency);
                break;
            case 2:
                System.out.println("Enter number of Grn");
                int numberOfGrn = Menu.getNumberOfCurrencyFromConsole();
                workingCurrency.exchangeGrnToCurrency(numberOfGrn);
                break;
            case 3:
                System.out.println("Enter new kurs NBU :");
                Scanner scanner = new Scanner(System.in);
                double newKursNBU = scanner.nextDouble();
                workingCurrency.setKursNBU(newKursNBU);
                break;
            case 4:
                System.out.println("Kurs NBU is " + workingCurrency.getKursNBU());
                break;
            default:
                System.out.println("No action with number " + menuNumber + " Try again!");
        }

    }
}
