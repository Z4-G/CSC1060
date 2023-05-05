package Exam4;

public class Player {
    private String name;
    private Die gameDie;
    private int roll;

    public Player(){
        this.gameDie = null;
        this.name = "";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Die getGameDie() {
        return this.gameDie;
    }

    public void setGameDie(Die gameDie) {
        this.gameDie = gameDie;
    }

    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }

}
