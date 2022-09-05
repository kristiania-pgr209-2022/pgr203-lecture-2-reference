package no.kristiania.poker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class PokerHand {
    private final Card[] cards;

    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public String getScore() {
        Map<Rank, List<Card>> rankFrequency = new HashMap<>();
        for (Card card : cards) {
            if (!rankFrequency.containsKey(card.getRank())) {
                rankFrequency.put(card.getRank(), new ArrayList<>());
            }
            rankFrequency.get(card.getRank()).add(card);
        }

        for (Rank rank : rankFrequency.keySet()) {
            if (rankFrequency.get(rank).size() == 2) {
                return "pair of " + rank.getName();
            }
        }


        Rank maxRank = Stream.of(cards)
                .map(Card::getRank)
                .max(Comparator.naturalOrder())
                .orElseThrow();
        return "high card " + maxRank.getName();
    }
}
