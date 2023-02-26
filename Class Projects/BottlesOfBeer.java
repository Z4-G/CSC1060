import java.util.Scanner;
public class BottlesOfBeer {
    public static void main (String[]args ){
        int bottles = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of bottles of beer on the wall.");
        bottles = input.nextInt();

        final int save = bottles;
        
        for ( int i = bottles; i > 0; i -= 1){

            if (bottles > 1){
                System.out.println(bottles + " bottles of beer on the wall. \n" + bottles + " bottles of beer.");
                bottles  -= 1;
                if (bottles >= 2){
                    System.out.println("Take one down, pass it around " + bottles + " bottles of beer on the wall.");
                } else if (bottles < 2){
                    System.out.println("Take one down, pass it around " + bottles + " bottle of beer on the wall.");
                }
            } else if (bottles == 1){
                System.out.println(bottles + " bottle of beer on the wall. \n" + bottles + " bottle of beer.");
                bottles  -= 1;
                System.out.println("Take one down, pass it around " + bottles + " bottles of beer on the wall.");
            }

            if (save > 1 && bottles == 0){
                System.out.println("Go to the store, buy some more " + save + " bottles of beer on the wall.");
            } else if (save == 1 && bottles == 0){
                System.out.println("Go to the store, buy some more " + save + " bottle of beer on the wall.");  
            }
            input.close();
        }
    }
}
