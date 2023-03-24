import java.util.Scanner;
public class ArrayReversal {
    public static void main(String[] args){
        int[] holder = new int[100];
        int input = 0;
        int count = 0;
        Scanner values = new Scanner(System.in);

        for (int i = 0; i < 100; i++){
        input = values.nextInt();
        holder[i] = input;
        count = count+=1;
            if (input == -1){
                break;
            }
        }
        while (count > 1) {
            System.out.println(holder[count-2]);
            count = count -= 1;
        }
        values.close();
    }
}
