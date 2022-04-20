package OpportunityToBeInLive;

import java.util.Arrays;
import java.util.List;

public class OpportunityToBeInLive {
    public OpportunityToBeInLive() {
    }

    public final List<Double> rValues = Arrays.asList(2.0, 2.25, 2.5, 2.75, 3.0, 3.25, 3.25, 3.5, 3.75, 4.0, 4.25, 4.5, 4.75, 5.0);

    public boolean checkDataIsValid(double x, double y, double r) {
        return rValues.contains(r) && (-4 <= x && x <= 4) && (-5 <= y && y <= 5);
    }

}
