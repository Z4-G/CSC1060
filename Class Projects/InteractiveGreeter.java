import java.util.Scanner;
public class InteractiveGreeter {
    public static void main(String[] arg){

        String name = "";
        String location = "";
        String activity = "";
        double donation = 0;
        int age = 0;

        Scanner question = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        name = question.nextLine();
        System.out.println("Hi, " + name + ", Where do you live?");
        location = question.nextLine();
        System.out.println("What a lovely palce to be. What's your favorite thing to do around there?");
        activity = question.nextLine();
        System.out.println("Imagine being able to " + activity + " whenever you want. Sounds like a blast.\nCould you now provide us with your age?");
        age = question.nextInt();
        question.nextLine();
        System.out.println("Well " + name + ", " + age + "," + " from " + location + ". Thank you for visiting us today. How much would you like to donate?");
        donation = question.nextDouble();
        question.nextLine();
        System.out.println("WOW! " + donation + " is very generous, Thank you!");

        
        question.close();
    }
}
