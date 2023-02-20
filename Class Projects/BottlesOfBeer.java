import java.util.Scanner;
public class BottlesOfBeer {
    public static void main (String[]args ){
        int bottles = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of bottles of beer on the wall.");
        bottles = input.nextInt();

        for ( int i = bottles; i > 0; i -= 1){
            System.out.println(bottles + " bottles of beer on the wall. \n" + bottles + " bottles of beer");
            bottles  -= 1;
            System.out.println("Take one down, pass it around " + bottles + " bottles of beer on the wall.");

        }
    }
}
