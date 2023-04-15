package Game;
import java.util.Random;

public class Deck {

	private Card[] cards;
		
	public Deck() {
		cards = new Card[52];
		int cardIndex = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++) {
				cards[cardIndex] = new Card(j,i);
				cardIndex++;
			}
		}
	}
	
	public Deck(int numCards) {
	    cards = new Card[numCards];
	}
	
	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public Deck subdeck(int start, int end) {
		Deck subdeck = new Deck(end - start + 1);
		int j = 0;
		for(int i = start; i <= end; i++) {
			subdeck.cards[j] = this.cards[i];
			j++;
		}
		return subdeck;
	}
	
	public void shuffle() {
		Random randGen = new Random();
		for (int i = 0; i < cards.length; i++) {
			int swapIndex = randGen.nextInt(cards.length);
			Card temp = cards[i];
			cards[i] = cards[swapIndex];
			cards[swapIndex] = temp;
		}
	}
	
	public static void shuffle(Card[] cards) {
		Random randGen = new Random();
		for (int i = 0; i < cards.length; i++) {
			int swapIndex = randGen.nextInt(cards.length);
			Card temp = cards[i];
			cards[i] = cards[swapIndex];
			cards[swapIndex] = temp;
		}
	}
	
	public static void shuffle(Deck deck) {
		Card[] cards = deck.cards;
		Random randGen = new Random();
		for (int i = 0; i < cards.length; i++) {
			int swapIndex = randGen.nextInt(cards.length);
			Card temp = cards[i];
			cards[i] = cards[swapIndex];
			cards[swapIndex] = temp;
		}
	}
	
	public void bubbleSort() {
		
	}
    
    public void selectionsort(){
        int n = cards.length;

        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (cards[j].getRank() < cards[minIdx].getRank()) {
                    minIdx = j;
                }
            }
            Card temp = cards[i];
            cards[i] = cards[minIdx];
            cards[minIdx] = temp;
        }
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (cards[j].getSuit() < cards[minIdx].getSuit()) {
                    minIdx = j;
                }
            }
            Card temp = cards[i];
            cards[i] = cards[minIdx];
            cards[minIdx] = temp;
        }
    }
	public String toString() {
		StringBuilder string = new StringBuilder();
//		for(Card card : cards) {
//			string.append(card);
//		}
		for (int k = 0; k < cards.length; k++) {
			if (k > 0 && k % 13 == 0) {
				string.append("\n");
			}
			string.append(cards[k]);
			string.append(", ");
		}
		return string.toString();
	}
}
