package model;

/**
 * Created by David on 7/21/16.
 */
public class Person {
    Wallet[] wallets;

    public Person(Wallet[] wallets) {
        this.wallets = wallets;
    }

    public Wallet[] getWallets() {
        return this.wallets;
    }
}
