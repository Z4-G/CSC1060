import java.util.Scanner;
import java.text.DecimalFormat;
public class Exceptions{

        public static void main(String[] args){
        double a;
        double b;
        double c;
        double discriminant;
        double root1;
        double root2;
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Please enter your values (a, b, c): ");

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        input.close();
        discriminant = (b*b)-(4*a*c);
        if (discriminant < 0 || a == 0){
    
            throw new IllegalArgumentException("The solution to these values does not exist.");
        }else{
            b = b-b*2;
            root1 = (b+Math.sqrt(discriminant))/(2*a);
            root2 = (b-Math.sqrt(discriminant))/(2*a);
        }
        System.out.print("The solutions to your equation are " +  df.format(root1) + " and " +  df.format(root2));
    }
}