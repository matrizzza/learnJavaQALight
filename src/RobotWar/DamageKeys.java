package RobotWar;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DamageKeys {
    private String alphabet = "QWEASDZXC";
    private Map<Character, Integer> damageKeys = new HashMap<>();
    private Map<Character, Boolean> activeKeys = new HashMap<>();

    public DamageKeys() {
        for (int i = 0; i < 9; i++) {
            int damage = 0;
            if (i % 2 == 0) {
                damage = 20;
            }
            char key = getRandomKey();
            damageKeys.put(key, damage);
            activeKeys.put(key, true);
        }
    }

    public String getAlphabet() {
        return alphabet;
    }

    public Map<Character, Integer> getDamageKeys() {
        return damageKeys;
    }

    public Map<Character, Boolean> getActiveKeys() {
        return activeKeys;
    }

    private char getRandomKey() {
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        return randChar;
    }

    public void setDamageKeyToInactive(char key) {
        activeKeys.replace(key, false);
    }
}
