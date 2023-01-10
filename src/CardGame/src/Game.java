
// Add cards to hand.  This function in hand class.

// who wins.

public class Game {

    // P1, P2.
    private Hand hand1;
    private Hand hand2;
    private Deck deck;

    public Game () {
        hand1 = new Hand("p1");
        hand2 = new Hand("p2");
        deck.createFullDeck();
        hand1.addHalfDeck();
        hand2.addHalfDeck();
    }

    public Hand getHand1() {
        return hand1;
    }

    public Hand getHand2() {
        return hand2;
    }

    // calculate handValue
    public int getHandValue(Hand hand) {

        int handValue = 0;
        for(Card card : hand.getCardList()) {
            handValue += card.getRank().getValue();
        }
        return handValue;
    }

    public Hand getWhoWins() {
        if(this.getHandValue(hand1) > getHandValue(hand2)) {
            return hand1;
        } else {
            return hand2;
        }
    }
}
