package model.CardType;

/**
 * Created by David on 7/21/16.
 */
public class MCCard implements CardType {
    @Override
    public double getInterest() {
        return .05;
    }
}
