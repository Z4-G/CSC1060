import java.util.Scanner;
public class CircleCalculation {
    int area = 0;
    double radius = 0;
    int length = 0;
    public static void area(double radius){
        double areaComputed =  radius*radius*Math.PI;
        System.out.println("\nThe area is " + String.format("%.3f", areaComputed));
    }

    public static void diameter(double radius){
        double diameterComputed = 2*radius;
        System.out.println("The diameter is " + String.format("%.3f", diameterComputed));
    }
    public static void circumference(double radius){
        double circumferenceComputer = 2*Math.PI*radius;
        System.out.println("The circumference is " + String.format("%.3f", circumferenceComputer) + "\n");
    }
    public static void main(String[] args){
        double newRadius = 0;        
        Scanner circleInput = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle:");
        newRadius = circleInput.nextDouble();
        //prompts user input for radius

        area(newRadius);
        diameter(newRadius);
        circumference(newRadius);
        circleInput.close();
    }
}

