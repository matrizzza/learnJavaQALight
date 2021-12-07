package RobotWar;

import java.util.*;

public class DamageKeys {
    private String alphabet = "QWEASDZXC";
    private List<Key> damageKeys = new ArrayList<>();

    public DamageKeys() {
        for (int i = 0; i < 9; i++) {
            int damage = 0;
            if (i % 2 == 0) {
                damage = 20;
            }
            char key = getRandomKey();
            damageKeys.add(new Key(key, damage, true));
        }
    }

    public String getAlphabet() {
        return alphabet;
    }

    public List<Key> getDamageKeys() {
        return damageKeys;
    }

    private char getRandomKey() {
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        return randChar;
    }

    public void setDamageKeyToInactive(char key) {
        for (Key damageKey : damageKeys) {
            if (damageKey.getDamageKey() == key){
                damageKey.setActive(false);
            }
        }
    }

    public boolean isDamageKayActive(char key){
        for (Key damageKey : damageKeys) {
            if (damageKey.getDamageKey() == key){
                return damageKey.isActive();
            }
        }
        return false;
    }

    public int getDamageByKey(char key){
        for (Key damageKey : damageKeys) {
            if (damageKey.getDamageKey() == key){
                return damageKey.getDamage();
            }
        }
        return 0;
    }
}
