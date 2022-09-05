package no.kristiania.poker;

public enum Rank {
    NUMBER_2, NUMBER_3, NUMBER_4, NUMBER_8, NUMBER_10, KING;

    public String getName() {
        return switch (this) {
            case NUMBER_2 -> "2";
            case NUMBER_3 -> "3";
            case NUMBER_4 -> "4";
            case NUMBER_8 -> "8";
            case NUMBER_10 -> "10";
            case KING -> "King";
        };
    }
}
