package RobotWar;

public class Key {
    private char damageKey;
    private int damage;
    private boolean isActive;

    public Key(char damageKey, int damage, boolean isActive) {
        this.damageKey = damageKey;
        this.damage = damage;
        this.isActive = isActive;
    }

    public char getDamageKey() {
        return damageKey;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setDamageKey(char damageKey) {
        this.damageKey = damageKey;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
