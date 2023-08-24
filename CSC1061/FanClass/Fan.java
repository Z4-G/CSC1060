package FanClass;

public class Fan {
    static int slow = 0;
    static int medium = 1;
    static int fast = 2;
    int ID = 1;
    private int speed = slow;
    private boolean state = false;
    private double radius = 5.0;
    static int count = 1;
    String color = "Blue";
    
    
    public Fan(){
        this.speed = slow;
        this.state = false;
        this.radius = 5.0;
        this.color = "Orange";
        ID = count++;
    }

    public Fan(int speed, boolean state, double radius, String color){
        this.speed = speed;
        this.state = state;
        this.radius = radius;
        this.color = color;
        ID = count++;
    }

    public int getID(){
        return ID;
    }

    public String getSpeed() {
        if (speed == 0){
            return "Slow";
        }else if (speed == 1){
            return "Medium";
        }else{
            return "Fast";
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isState() {
        return this.state;
    }

    public boolean getState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (state == true){
        return String.format("\nThe fan is on.\nSpeed: %s\nColor: '%s'\nRadius: %s\nID: %s\n", getSpeed(), getColor(), getRadius(), getID());
        }else{
        return String.format("The fan is off.\nColor: '%s'\nRadius: %s\nID: %s\n", getColor(), getRadius(), getID());
        }
    }

    
}
