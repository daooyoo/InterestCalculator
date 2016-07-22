package model.CardType;

/**
 * Created by David on 7/21/16.
 */
public class VisaCard implements CardType {
    @Override
    public double getInterest() {
        return .10;
    }
}
