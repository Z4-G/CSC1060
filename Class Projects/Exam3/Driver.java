package Exam3;

public class Driver {
    static Animal[][] choir;
    public static void main(String[]args){
        Animal pig = new pig(1, "pink");
        Animal cow = new cow(1, "green");
        Animal sheep = new sheep(1, "orange");
        choir = new Animal[2][6];
        choir[0][0] = pig;
        choir[0][1] = cow;
        choir[0][2] = sheep;
        choir[0][3] = pig;
        choir[0][4] = cow;
        choir[0][5] = sheep;
        choir[1][0] = pig;
        choir[1][1] = cow;        
        choir[1][2] = sheep;
        choir[1][3] = pig;
        choir[1][4] = cow;
        choir[1][5] = sheep;
        for (Animal[] i: choir){
            for (Animal a : i){
                System.out.println(a);
            }
        }
        for (Animal[] i: choir){
            for (Animal a : i){
                System.out.println(a.sing());
            }
        }
    }
}
