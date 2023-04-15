package Game;
import java.util.ArrayList;

public class Pile {
	private ArrayList<Card> hand;
	
	public Pile() {
		hand = new ArrayList<Card>();
	}
	
	public Pile(Deck deck) {
		hand = new ArrayList<Card>();
		for (Card card: deck.getCards()) {
			hand.add(card);
		}
	}
	
	public boolean isEmpty() {
		return hand.isEmpty();
	}
	
	public int size() {
		return hand.size();
	}
	
	public Card popCard() {
		Card next = hand.remove(0);
		return next;
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void addPile(Pile pile) {
		for(int i = 0; i < pile.hand.size(); i++) {
			Card card = pile.hand.remove(i);
			this.hand.add(card);
		}
	}
}