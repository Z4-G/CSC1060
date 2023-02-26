package exam_1;

public class TenMaker{
    static boolean check = true;
    public static void makes10(int unit1, int unit2){
     if (unit1 + unit2 == 10){
         check = true;
     } else {
         check = false;
     }
    }
    public static void main(String[] args){
        makes10(5,5);
        if (check == true){
            System.out.println("The sum of these values is ten.");
        }else if (check == false){
            System.out.println("The sum of these values is not ten.");
        }
    }
}