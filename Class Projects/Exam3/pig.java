package Exam3;

public class pig extends Animal{
    public pig(){
        super();
        this.sound = "Oink!";
    }
    public pig(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.sound = "Oink!";
    }
    public String sing(){
        return super.sing();
    }
    public String toString(){
        return String.format("Pig: Weight: %s Color: %s Sound: %s", weight, color, sound);
    }
}
