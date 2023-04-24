package Exam3;

public class sheep extends Animal {
    public sheep(){
        super();
        this.sound = "BaAa";
    }
    public sheep(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.sound = "BaAa";
    }
    public String sing(){
        return super.sing();
    }
    public String toString(){
        return String.format("Sheep: Weight: %s Color: %s Sound: %s", weight, color, sound);
    }
}
