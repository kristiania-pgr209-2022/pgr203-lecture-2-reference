package no.kristiania.poker;

import java.util.Comparator;
import java.util.stream.Stream;

public class PokerHand {
    private final Card[] cards;

    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public String getScore() {
        Rank maxRank = Stream.of(cards).map(card -> card.getRank())
                .max(Comparator.comparingInt(Enum::ordinal))
                .orElseThrow();
        return "high card " + maxRank.getName();
    }
}
