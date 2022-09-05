package no.kristiania.poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokerHandsTest {
    @Test
    void shouldIdentifyHighCard() {
        var hand = new PokerHand(new Card[] {
                new Card(Suit.HEART, Rank.NUMBER_2),
                new Card(Suit.HEART, Rank.NUMBER_3),
                new Card(Suit.SPADES, Rank.NUMBER_4),
                new Card(Suit.CLUBS, Rank.NUMBER_8),
                new Card(Suit.DIAMONDS, Rank.KING),
        });
        assertEquals("high card King", hand.getScore());
    }
}
