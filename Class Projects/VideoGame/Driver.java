package VideoGame;

import java.util.Random;

public class Driver {
    public static void main(String[] args){
        Weapon zenith = new Weapon(20, 15);
        Character player1 = new Character("Michael", 10, 100, 5, zenith);

        Weapon waterBolt = new Weapon(20, 15);
        Character player2 = new Character("Steve", 10, 100, 5, waterBolt);

        while (!player1.isDead() && !player2.isDead()){

            Random winner = new Random();
            int nextPlayer = winner.nextInt(100);

            if (nextPlayer < 40){
                double damage = player1.getWeapon().doDamage();
                player2.recordDamage(damage);
                System.out.println(player2.getHealth());
            } else if (nextPlayer > 40){
                double damage = player2.getWeapon().doDamage();
                player1.recordDamage(damage);
                System.out.println(player1.getHealth());
            }
        }

        if (player1.isDead()){
            System.out.println("Player 2 Wins!");
        }else if(player2.isDead()){
            System.out.println("Player 1 Wins!");
        }
    }
}
