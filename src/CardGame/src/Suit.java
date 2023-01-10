public enum Suit {
    DIAMONDS("Diamonds"),
    CLUB("Clubs"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private String suit;

    private Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
