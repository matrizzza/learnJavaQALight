package RobotWar;

public class Robot {
    private int health;
    private final String name;
    private DamageKeys damageKeys;

    public Robot(String name) {
        this.health = 100;
        this.name = name;
        this.damageKeys = new DamageKeys();
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public boolean isDead() {
        return this.health <= 0;
    }

    public DamageKeys getDamageKeys() {
        return damageKeys;
    }

    public void makeMove(char key) {
        int damage = damageKeys.getDamageByKey(key);
        if (!damageKeys.isDamageKayActive(key)){
            System.out.println("This letter can not be used twice. Next turn...");
        } else if (damage > 0){
            this.health = this.health - damage;
            RobotConsole.printDamageMsg(damage);
        }
        damageKeys.setDamageKeyToInactive(key);
    }
}
