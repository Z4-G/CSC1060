import java.util.Scanner;
public class StringSorting {
    static void bubbleSort(String[] list, int direction){
    int l = list.length;  
    String temp = "";  
    if (direction == 0){
        for(int i=0; i < l; i++){  
            for(int j=1; j < (l-i); j++){  
                if(list[j-1].compareTo(list[j]) < 0){  
                    temp = list[j-1];  
                    list[j-1] = list[j];  
                    list[j] = temp; 
                }     
            }  
        } 
    } else if (direction == 1){
        for(int i=0; i < l; i++){  
            for(int j=1; j < (l-i); j++){  
                if(list[j-1].compareTo(list[j]) > 0){  
                    temp = list[j-1];  
                    list[j-1] = list[j];  
                    list[j] = temp;  
                }     
            }  
        }  
    }
    }
    public static void main(String[] args){
        int arrayLength = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("how many items would you like to add?");
        arrayLength = input.nextInt();
        String[] list = new String[arrayLength];
        System.out.println();
        
        for (int i = 0; i < arrayLength; i++){
            System.out.print("Please enter an item: ");
            list[i] = input.next();
        }
        System.out.println();

        bubbleSort(list, 1);
        System.out.println("Sorted:");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println();

        bubbleSort(list, 0);
        System.out.println("Reverse sorted:");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
