package exam_1;

public class TenMaker{
    public static void makes10(int unit1, int unit2){
    boolean check = true;
     if (unit1 + unit2 == 10){
         check = true;
         System.out.println("The sum of these values is 10");
         System.out.println("check = " + check);
     } else {
         check = false;
         System.out.println("This sum of these values is not 10");
         System.out.println("check = " + check);
     }
 }
 public static void main(String[] args){
    makes10(4,5);
 }
}