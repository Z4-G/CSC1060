import java.util.Arrays;

public class StringPractice {
    public static void main(String[] Args){
        String practice = "1,2,3";

        String[] practiceSplit = practice.split(",");

        System.out.println(Arrays.toString(practiceSplit));
        
    } 
}
