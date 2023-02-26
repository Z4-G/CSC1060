import java.util.Scanner;
public class CircleCalculation {
    int area = 0;
    double radius = 0;
    int length = 0;
    static double areaComputed;
    static double diameterComputed;
    static double circumferenceComputer;

    public static double area(double radius){
        areaComputed =  radius*radius*Math.PI;
        return areaComputed;
    }

    public static double diameter(double radius){
        diameterComputed = 2*radius;
        return diameterComputed;
    }
    public static double circumference(double radius){
        circumferenceComputer = 2*Math.PI*radius;
        return circumferenceComputer;
    }
    public static void main(String[] args){
        double newRadius = 0;        
        Scanner circleInput = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle:");
        newRadius = circleInput.nextDouble();
        //prompts user input for radius

        area(newRadius);
        System.out.println("\nThe area is " + String.format("%.2f", areaComputed));
        diameter(newRadius);
        System.out.println("The diameter is " + String.format("%.2f", diameterComputed));
        circumference(newRadius);
        System.out.println("The circumference is " + String.format("%.2f", circumferenceComputer) + "\n");
        circleInput.close();
    }
}

