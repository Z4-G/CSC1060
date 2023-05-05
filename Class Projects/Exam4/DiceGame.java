package Exam4;
import java.util.Scanner; 

public class DiceGame {
    public static void main(String[] args){
        Player[] allPlayers;
        Die test = new Die();
        Scanner input = new Scanner(System.in);
        int holder;
        int counter = 0;

        System.out.println("How many sides does your die have?");
        test.setNumSides(input.nextInt());
        System.out.println("How many players are there?");
        holder = input.nextInt();

        allPlayers = new Player[holder];

        for (Player i: allPlayers){
            Player newPlayer = new Player();
            allPlayers[counter] = newPlayer;
            counter++;
        }
        for (Player i: allPlayers){
            System.out.println("What is the name of your Player?");
            i.setName(input.next());
        }
        for (Player i: allPlayers){
            int roundRoll;
            i.setGameDie(test);
            roundRoll = test.roll();
            i.setRoll(roundRoll);
            System.out.println(String.format("%s rolled a %s on a %s sided die.", i.getName(), roundRoll, test.getNumSides()));
        }
        System.out.print(decideWinner(allPlayers));

        input.close();
    }
    public static String decideWinner(Player[] playerArray){
        String winner = "";
        int highestValue = 0;
        for (Player i: playerArray){
            if (i.getRoll() > highestValue){
                highestValue = i.getRoll();
                winner = i.getName();
            } else if (i.getRoll() == highestValue){
                return String.format("There is Tie");
            }
        }
        return String.format("The winner is %s", winner);
    }
}
