package Exam4;
import java.util.Random;

public class Die extends Player{
    private int numSides;
    private int value;

    public Die() {
        this.numSides = 6;
        this.value = 1;
    }
    public Die(int numSides){
        this.numSides = numSides;
        this.value = 1;
    }

    public int getNumSides() {
        return this.numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //methods 
    
    public int roll(){
        Random rollValue = new Random();
        value = rollValue.nextInt(numSides);
        if (value == 0){
            value++;
        }
        return value;
    }

    public String toString(){
        return String.format("Your die has %s sides, and you rolled a %s", numSides, value);
    }
}
