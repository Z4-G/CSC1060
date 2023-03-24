package CardGame;
public class Deck{
    private card[] cards;
    private Deck() {
        cards = new card[52];
        int cardIndex = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 14; j++){
                cards[cardIndex] = new card(j,i);
                cardIndex++;
            }
        }
    }
}