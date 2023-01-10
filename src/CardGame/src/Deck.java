import java.util.*;

// full 52 cards deck.
public class Deck {

    private List<Card> cardList;
    private Random rand = new Random();

    public Deck() {
        cardList = new ArrayList<>();
    }

    public void createFullDeck() {
        cardList.add(new Card(Suit.HEARTS,Rank.FOUR));
        cardList.add(new Card(Suit.CLUB, Rank.KING));
    }

    // Shuffle
    public void shuffle() {
        int cardListSize = cardList.size();
        for(int i = 0; i < cardListSize; i ++) {
            Collections.swap(cardList, i, randRange(i, cardListSize));
        }
    }

    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    public List<Card> getCardList() {
        return cardList;
    }
}
