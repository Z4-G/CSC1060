package VideoGame;

public class Character extends Weapon{
    private String name;
    private int strength;
    private int speed;
    Weapon weapon;

    public Character(){
        this.name = "";
        this.strength = 5;
        this.health = 100;
        this.speed = 5;
    }

    public Character(String name, int strength, int health, int speed, Weapon weapon) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.speed = speed;
        this.weapon = weapon;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    
    
}
