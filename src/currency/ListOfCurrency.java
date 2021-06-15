package currency;

import java.util.HashMap;

public class ListOfCurrency {
    private static HashMap<String, Currency> currencyHashMap = new HashMap<>();

    public static void addCurrency(Currency currency){
        currencyHashMap.put(currency.getCurrencyName(), currency);
    }

    public static HashMap<String, Currency> getCurrencyHashMap(){
        return currencyHashMap;
    }
}
