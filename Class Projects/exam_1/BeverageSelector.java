package exam_1;
import java.util.Scanner;
public class BeverageSelector {

    public static void main(String[] args){
        int beverage = 0;
        Scanner choice = new Scanner(System.in);
        System.out.println("Please select your drink:\n 1 - water \n 2 - Coke \n 3 - Coffee");
        beverage = choice.nextInt();
        choice.nextLine();

        while (beverage != 1 && beverage != 2 && beverage != 3){
            System.out.println("Please enter a valid option, 1, 2, or 3.");
            beverage = choice.nextInt();
            choice.nextLine();
        }
        if (beverage == 1){
            System.out.println("You have selected Water, Dispensing below.\n");
        }else if (beverage == 2){
            System.out.println("You have selected Coke, Dispensing below.\n");
        }else if (beverage == 3){
            System.out.println("You have selected Coffee, Dispensing below.\n");
        } 
        choice.close();
    }
}
