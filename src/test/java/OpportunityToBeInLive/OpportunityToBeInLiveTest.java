package OpportunityToBeInLive;


import Validators.BestValidatorEver;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class OpportunityToBeInLiveTest {
    OpportunityToBeInLive opportunityToBeInLive = new OpportunityToBeInLive();

    @Test
    public void zxc() {
        System.out.println("zxc");
        boolean expected = true;
//        MockedStatic<BestValidatorEver> utilities = Mockito.mockStatic(BestValidatorEver.class);
        boolean res = BestValidatorEver.checkDataIsValid(0.0, 0.0, 2.0);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void please() {
        boolean expected = true;
        boolean res = opportunityToBeInLive.checkDataIsValid(1.0, 2.0, 3.0);
        Assertions.assertEquals(expected, res);
    }


    @Test
    public void checkDataIsValidExample() {
        boolean expected = true;
        boolean res =opportunityToBeInLive.checkDataIsValid(2.0, 2.0, 3.0);
        Assertions.assertEquals(expected,res);
    }

    @TestFactory
    Stream<DynamicTest> testNegativeCases() {
        List<TestCase> caseList = Arrays.asList(
                new TestCase(1.0, 2.0, 1.0, false),
                new TestCase(5.0, 2.0, 3.0, false),
                new TestCase(0.0, 0.0, 0.0, false)
        );
        return caseList.stream().map(
                entry -> DynamicTest.dynamicTest(
                        String.format("x:%s y:%s r:%s expected:%s", entry.x, entry.y, entry.r, entry.expected),
                        () -> Assertions.assertEquals(opportunityToBeInLive.checkDataIsValid(entry.x, entry.y, entry.r), entry.expected)
                )
        );
    }

    @Data
    @AllArgsConstructor
    static
    class TestCase {
        private double x;
        private double y;
        private double r;
        private boolean expected;
    }
}