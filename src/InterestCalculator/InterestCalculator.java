package InterestCalculator;

import model.Card;
import model.Person;
import model.Wallet;

/**
 * Created by David on 7/21/16.
 */
public class InterestCalculator {

    public double getCardInterest(Card card) {
        return card.getBalance() * card.getInterest();
    }

    public double getWalletInterest(Wallet wallet) {
        double interest = 0;
        for (Card card : wallet.getCards()) {
            interest += getCardInterest(card);
        }
        return interest;
    }

    public double getTotalInterest(Person person) {
        double interest = 0;
        for (Wallet wallet : person.getWallets()) {
            interest += getWalletInterest(wallet);
        }
        return interest;
    }
}
