package model;

/**
 * Created by David on 7/21/16.
 */
public class Wallet {
    Card[] cards;

    public Wallet(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return this.cards;
    }
}
