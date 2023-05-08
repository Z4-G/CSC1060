import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TotalCalculation {
    public static void main(String[] args){
        File items = new File("Items.txt");
        File total = new File("total.txt");
        Double holder = 0.0;
        Double tax = .053;

        try{
            Scanner input = new Scanner(items);
            FileWriter fill = new FileWriter(total, false);
            BufferedWriter bw = new BufferedWriter(fill);
            
            while (input.hasNextDouble()){
                holder += input.nextDouble();
            }

            bw.append(String.format("Your subtotal is: $%.2f", holder));
            bw.newLine();
            bw.append("Your tax at a " + (String.format("%.2f", (tax*100)) + "% rate is $" + String.format("%.2f", (tax*holder))));
            bw.newLine();
            bw.append(String.format("Your new total is: $%.2f", (holder+(holder*tax))));
            bw.flush();
            bw.close();

            input.close();
        } catch (Exception e){
            System.exit(-1);
        }
    }
}
