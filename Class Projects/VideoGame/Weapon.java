package VideoGame;
import java.util.Random;

public class Weapon{
    private int range;
    private int damageFactor;
    double health;
    

    public Weapon() {
        this.range = 0;
        this.damageFactor = 0;
    }

    public Weapon(int range, int damageFactor) {
        this.range = range;
        this.damageFactor = damageFactor;
    }

    public int getRange() {
        return this.range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamageFactor() {
        return this.damageFactor;
    }

    public void setDamageFactor(int damageFactor) {
        this.damageFactor = damageFactor;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    //methods
    public double doDamage(){
        Random rand = new Random();
        double random = rand.nextDouble();
        double damage = random*damageFactor;
        return damage;
    }
    public void recordDamage(double damage){
        health = health - damage;
        if (health < 0){
            health = 0;
        }
    }
    public boolean isDead(){
        return health == 0;
    }
}
