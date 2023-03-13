import java.util.Scanner;
public class StringSorting {
    static void bubbleSort(String[] list, int direction){
        int l = list.length;  
        String temp = "";
          
        if (direction == 0){
            for(int i=0; i < l; i++){  
            //runs for length of array
                for(int j=1; j < (l-i); j++){  
                //accounts for array start at 0
                    if(list[j-1].compareTo(list[j]) < 0){  
                        temp = list[j-1];  
                        list[j-1] = list[j];  
                        list[j] = temp; 
                    }
                    //sorts reverse lexographically      
                }  
            } 
        } else if (direction == 1){
            for(int i=0; i < l; i++){ 
            //runs for length of array
                for(int j=1; j < (l-i); j++){
                //accounts for array start at 0 
                    if(list[j-1].compareTo(list[j]) > 0){  
                        temp = list[j-1];  
                        list[j-1] = list[j];  
                        list[j] = temp;  
                    }     
                    //sorts lexographically
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
        //checks for length of array

        for (int i = 0; i < arrayLength; i++){
            System.out.print("Please enter an item: ");
            list[i] = input.next();
        }
        System.out.println();
        //receives input for each item

        bubbleSort(list, 1);
        //sorts alphabetically

        System.out.println("Sorted:");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println();
        //prints each item in the list

        bubbleSort(list, 0);
        //sorts reverse alphabetically

        System.out.println("Reverse sorted:");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        //prints each item in the list
        input.close();
    }
}
