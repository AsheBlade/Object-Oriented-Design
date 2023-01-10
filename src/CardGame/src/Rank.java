public enum Rank {

    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    KING("King", 13);


    private String rank;
    private int value;

    Rank(String rank, int value) {
        this.rank = rank;
        this.value = value;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }
}
