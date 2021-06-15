package currency;

import java.util.Scanner;

abstract public class Menu {
    public static int getNumberOfCurrencyFromConsole() {
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextInt();
        } catch (Exception e){
            return 0;
        }
    }
}
