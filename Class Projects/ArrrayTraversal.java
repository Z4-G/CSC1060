import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrrayTraversal {
    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int x = 0;

        while (x != -1){
            System.out.println("Please enter your next value");
            x = input.nextInt();
            input.nextLine();
            if (x != -1){
            values.add(x);
            }
        }   
        System.out.println("Your values reversed: ");

        for (int i = 1; i <= values.size(); i++ ){
            System.out.println(values.get(values.size()-i));
        }
        input.close();
    }
}
