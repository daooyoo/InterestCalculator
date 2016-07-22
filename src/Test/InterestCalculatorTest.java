package Test;

import InterestCalculator.InterestCalculator;
import model.Card;
import model.CardType.DiscoverCard;
import model.CardType.MCCard;
import model.CardType.VisaCard;
import model.Person;
import model.Wallet;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by David on 7/21/16.
 */
public class InterestCalculatorTest {

    @Test
    public void testCase1() {
        InterestCalculator interestCalculator = new InterestCalculator();

        Card visa = new Card(new VisaCard(), 100);
        Card mc = new Card(new MCCard(), 100);
        Card discover = new Card(new DiscoverCard(), 100);

        Card[] cards = {visa, mc, discover};

        Wallet wallet = new Wallet(cards);

        Wallet[] wallets = {wallet};

        Person person = new Person(wallets);

        assertEquals(10, interestCalculator.getCardInterest(visa), 0);
        assertEquals(5, interestCalculator.getCardInterest(mc), 0);
        assertEquals(1, interestCalculator.getCardInterest(discover), 0);

        assertEquals(16, interestCalculator.getTotalInterest(person), 0);
    }

    @Test
    public void testCase2() {
        InterestCalculator interestCalculator = new InterestCalculator();

        Card visa = new Card(new VisaCard(), 100);
        Card mc = new Card(new MCCard(), 100);
        Card discover = new Card(new DiscoverCard(), 100);

        Card[] cards1 = {visa, discover};
        Card[] cards2 = {mc};

        Wallet wallet1 = new Wallet(cards1);
        Wallet wallet2 = new Wallet(cards2);

        Wallet[] wallets = {wallet1, wallet2};

        Person person = new Person(wallets);

        assertEquals(11, interestCalculator.getWalletInterest(wallet1), 0);
        assertEquals(5, interestCalculator.getWalletInterest(wallet2), 0);

        assertEquals(16, interestCalculator.getTotalInterest(person), 0);
    }

    @Test
    public void testCase3() {
        InterestCalculator interestCalculator = new InterestCalculator();

        Card visa = new Card(new VisaCard(), 100);
        Card mc = new Card(new MCCard(), 100);
        Card discover = new Card(new DiscoverCard(), 100);

        Card[] cards1 = {visa, mc, discover};
        Card[] cards2 = {visa, mc};

        Wallet wallet1 = new Wallet(cards1);
        Wallet wallet2 = new Wallet(cards2);

        Wallet[] wallets1 = {wallet1};
        Wallet[] wallets2 = {wallet2};

        Person person1 = new Person(wallets1);
        Person person2 = new Person(wallets2);

        assertEquals(16, interestCalculator.getWalletInterest(wallet1), 0);
        assertEquals(15, interestCalculator.getWalletInterest(wallet2), 0);

        assertEquals(16, interestCalculator.getTotalInterest(person1), 0);
        assertEquals(15, interestCalculator.getTotalInterest(person2), 0);

    }

}