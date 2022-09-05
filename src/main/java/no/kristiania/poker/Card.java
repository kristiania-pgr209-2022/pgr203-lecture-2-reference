package no.kristiania.poker;

public class Card {
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }
}
