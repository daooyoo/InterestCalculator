package model;

import model.CardType.CardType;

/**
 * Created by David on 7/21/16.
 */
public class Card {

    CardType cardType;
    double balance;

    public Card(CardType cardType, double balance) {
        this.cardType = cardType;
        setBalance(balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return this.cardType.getInterest();
    }
}