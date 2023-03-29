package Exam2;

import java.util.Arrays;

public class ArrayKnowledge {
public static int[] fizzArray1(int n){
    int[] holder = new int[n];
    for (int i = 0; i < holder.length; i++){
        holder[i] = i;
    }
    return holder;
}
public static int[] fizzArray3(int start, int end){
    int[] holder = new int[end];
    int[] newArray = new int[end-start];
    for (int i = 0; i < holder.length; i++){
        holder[i] = i;
    }
    for (int k = 0; k < newArray.length; k++){
        newArray[k] = holder[start+k];
    }
    return newArray;
}
public static void main(String[] args){
    System.out.println(Arrays.toString(fizzArray3(1,3)));
}
}
