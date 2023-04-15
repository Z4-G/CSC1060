package Game;
public class Card {
	private int rank;
	private int suit;
	
	public final String[] RANKS = {
			null, "Ace", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "Jack", "Queen", "King"
	};

	public final String[] SUITS = {
			"Clubs", "Diamonds", "Hearts", "Spades"
	};
	
	public Card(int r, int s) {
		this.rank = r;
		this.suit = s;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public int getSuit() {
		return suit;
	}


	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	public int compareTo(Card oCard) {
//		if (this.suit < oCard.suit) {
//			return -1;
//		}
//		if (this.suit > oCard.suit) {
//			return 1;
//		}
		if (this.rank < oCard.rank) {
			return -1;
		}
		else if (this.rank > oCard.rank) {
			return 1;
		}
		return 0;
	}
	
	public String toString() {
		return String.format("%s   of   %s" , RANKS[rank], SUITS[suit]);
		// return (RANKS[rank] + " of " + SUITS[suit]);
	}
 	
}