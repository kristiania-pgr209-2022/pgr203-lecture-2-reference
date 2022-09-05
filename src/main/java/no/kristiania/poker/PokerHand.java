package no.kristiania.poker;

import java.util.Comparator;
import java.util.stream.Stream;

public class PokerHand {
    private final Card[] cards;

    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public String getScore() {
        Rank maxRank = Stream.of(cards)
                .map(Card::getRank)
                .max(Comparator.naturalOrder())
                .orElseThrow();
        return "high card " + maxRank.getName();
    }
}
