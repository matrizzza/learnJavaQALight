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
        if (!damageKeys.getActiveKeys().get(key)){
            System.out.println("This letter can not be used twice. Next turn...");
        } else if (damageKeys.getDamageKeys().get(key) > 0){
            this.health = this.health - damageKeys.getDamageKeys().get(key);
            RobotConsole.printDamageMsg(damageKeys.getDamageKeys().get(key));
        }
        damageKeys.setDamageKeyToInactive(key);
    }
}
