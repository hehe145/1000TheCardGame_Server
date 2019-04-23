package com.hehe145.cardgame.server.model;

public class Card {

    public enum Suite {
        DIAMOND, HEART, SPADES, CLUB, NONE
    }
    public enum Rank {
        NINE(0), JACK(2), QUEEN(3), KING(4), TEN(10), ACE(11);

        private int value;
        public int value() {return value;}
        Rank(int value) { this.value = value;}
    }

    private Rank rank;
    private Suite suite;

    Card( Rank rank, Suite suite){
        this.rank = rank;
        this.suite = suite;
    }

    public Card getStrongestCard( Card card2, Card card3, Suite trumpSuite) {

        int value1 = 20, value2 = 0, value3 = 0;

        if ( trumpSuite == Suite.NONE){

            if ( this.suite == card2.suite)
                value2 = 20;
            if ( this.suite == card3.suite)
                value3 = 20;

        }else {

            if ( this.suite == trumpSuite)
                value1 = 40;
            if ( card2.suite == trumpSuite)
                value2 = 40;
            if ( card3.suite == trumpSuite)
                value3 = 40;
        }

        value1 += this.rank.value;
        value2 += this.rank.value;
        value3 += this.rank.value;

        if ( value1 > value2) {
            if ( value1 > value3)
                return this;
            else
                return card3;
        }else {
            if ( value2 > value3)
                return card2;
        }

        return card3;
    }


}
