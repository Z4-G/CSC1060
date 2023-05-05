package Exam4;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        File log = new File("log.txt");
        Die test = new Die();
        Player[] allPlayers;
        int counter = 0;
        int holder;

        //sets die sides and number of players
        System.out.println("How many sides does your die have?");
        test.setNumSides(input.nextInt());
        System.out.println("How many players are there?");
        holder = input.nextInt();

        //player array intiialized
        allPlayers = new Player[holder];

        //adds player objects to the array
        for (Player i: allPlayers){
            Player newPlayer = new Player();
            allPlayers[counter] = newPlayer;
            counter++;
        }
        //sets the name for each player
        for (Player i: allPlayers){
            System.out.println("What is the name of your Player?");
            i.setName(input.next());
        }
        //rolls each players turn and prints it to the file "log.txt"
        try{
            if (!log.exists()){
                log.createNewFile();
            }
            FileWriter fill = new FileWriter(log, false);
            BufferedWriter bw = new BufferedWriter(fill);
            for (Player i: allPlayers){
                int roundRoll;
                i.setGameDie(test);
                roundRoll = test.roll();
                i.setRoll(roundRoll);
                bw.append(String.format("%s rolled a %s on a %s sided die.\n", i.getName(), roundRoll, test.getNumSides()));
            }
            //prints the winner
            bw.append(decideWinner(allPlayers));
            bw.flush();
            bw.close();
        }
        catch (Exception e) {
            System.exit(-1);
        }
        input.close();
    }
    //methods
    public static String decideWinner(Player[] playerArray){
        int highestValue = 0;
        String winner = "";
        
        //checks for the highest roll
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
