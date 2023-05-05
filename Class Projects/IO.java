import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) throws FileNotFoundException{
        File readFile = null;
        Scanner input = null;

        try {
        readFile = new File("C:\\Users\\TheM4\\findMe.txt");
        input = new Scanner(readFile); 
        } catch (FileNotFoundException e) {
            System.out.println("The file you entered does not exist. Please check path and spelling.");
            System.out.println(e.getMessage());  
            e.printStackTrace();
            System.exit(-1);
        } finally {
            System.out.println("Safe from exceptions!");
        }
        while (input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }
}
