package Exam3;

public class cow extends Animal{
    public cow(){
        super();
        this.sound = "MoOo";
    }
    public cow(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.sound = "moOo";
    }
    public String sing(){
        return super.sing();
    }
        public String toString(){
        return String.format("Cow: Weight: %s Color: %s Sound: %s", weight, color, sound);
    }
}
