package Exam2;

public class LogicKnowledge {
    public static int greenTicket(int a, int b, int c){
        if (a == b && b == c){
            return 20;
        }else if(a == b || a == c || c==b){
            return 10;
        }
        return 0;
    }
    public static int makeChocolate(int small, int large, int goal){
        int totalNeeded = goal - (large*5);
        if (totalNeeded <= small){
            return totalNeeded;
        }else if (totalNeeded > small){
            return -1;
        }
        return -1;
    }
public static void main(String[] args){
    System.out.println(makeChocolate(4, 1, 7));
}
}

