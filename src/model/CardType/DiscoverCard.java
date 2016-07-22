package model.CardType;

import javax.smartcardio.Card;

/**
 * Created by David on 7/21/16.
 */
public class DiscoverCard implements CardType {
    @Override
    public double getInterest() {
        return .01;
    }
}
