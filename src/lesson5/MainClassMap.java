package lesson5;

import java.util.HashMap;
import java.util.Map;

public class MainClassMap {
    public static void main(String[] args) {
        Map<String, String> ourMap = new HashMap();
        System.out.println(ourMap);
        ourMap.put("login", "Test");
        System.out.println(ourMap);
        ourMap.put("pass", "9090");
        System.out.println(ourMap);
        ourMap.put("autorisation", "true");
        System.out.println(ourMap);

        if (ourMap.get("autorisation").equals("true")){
            System.out.println("TRUE");
        }

        if (Boolean.parseBoolean(ourMap.get("autorisation"))) {
            System.out.println("Boolean True");
        }

    }
}
