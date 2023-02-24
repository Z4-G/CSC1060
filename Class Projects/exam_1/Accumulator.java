package exam_1;
import java.util.Scanner;
public class Accumulator {
    public static void main(String[] args){
        double holder = -1;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first Value");
        holder = input.nextDouble();  
              
        while (holder != 0){
            sum = holder + sum;
            System.out.println("Please enter your next value");
            holder = input.nextDouble();
        }

        System.out.println("Your final value is " + sum );
        input.close();
    }
}

