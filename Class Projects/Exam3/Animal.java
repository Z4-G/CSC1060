package Exam3;

public class Animal {
    int weight;
    String color;
    String sound; 
    public Animal(){
        this.weight = 0;
        this.color = "";
        this.sound = "";
    }
    public Animal(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setSound(String sound){
        this.sound = sound;
    }
    public String getSound(){
        return sound;
    }    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return String.format("Cow: Weight: %s Color: %s Sound: %s", weight, color, sound);
    }
    public String sing(){
        return String.format("%s %s %s", sound, sound, sound);
    }

}
