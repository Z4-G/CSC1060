package Game;

public class War {

	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println(deck);
		
		deck.shuffle();
		deck.selectionsort();
        
		System.out.println(deck);
		
		Deck subdeck1 = deck.subdeck(0, 25);
		Pile p1 = new Pile(subdeck1);
		
		Deck subdeck2 = deck.subdeck(26, 51);
		Pile p2 = new Pile(subdeck2);	
		
		Pile winP1 = new Pile();
		Pile winP2 = new Pile();
		
		Pile midPile = new Pile();
		
		while (!p1.isEmpty() && !p2.isEmpty()) {

			Card c1 = p1.popCard();
			Card c2 = p2.popCard();

			int result = c1.compareTo(c2);

			if (result > 0) {
				winP1.addCard(c1);
				winP1.addCard(c2);
				winP1.addPile(midPile);
			} else if (result < 0) {
				winP2.addCard(c1);
				winP2.addCard(c2);
				winP2.addPile(midPile);
			} else {
				midPile.addCard(c1);
				midPile.addCard(c2);
			}
		}
		
		if (winP1.size() > winP2.size()) {
			System.out.println("Player 1 wins!");
		} 
		else if (winP2.size() > winP1.size()) {
			System.out.println("Player 2 wins!");
		}
		else {
			System.out.println("It's a tie!");
		}

		
		
	}

}