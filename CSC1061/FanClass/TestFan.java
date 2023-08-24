package FanClass;

public class TestFan extends Fan{
    public static void main(String[] args){
        Fan fan1 = new Fan(fast, true, 10, "Yellow" );
        Fan fan2 = new Fan(medium, false, 5, "Blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}


