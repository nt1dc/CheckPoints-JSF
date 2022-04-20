package Validators;

import OpportunityToBeInLive.OpportunityToBeInLive;
import org.junit.Assert;
import org.junit.Test;


public class OpportunityToBeInLiveTest {
    OpportunityToBeInLive opportunityToBeInLive = new OpportunityToBeInLive();


    @Test
    public void please() {
        boolean res = opportunityToBeInLive.checkDataIsValid(1.0, 2.0, 3.0);
        Assert.assertTrue(res);
    }

//
//    @Test
//    public void checkDataIsValidExample() {
//        Assertions.assertFalse(opportunityToBeInLive.checkDataIsValid(2.0, 2.0, 3.0));
//    }

//    @TestFactory
//    Stream<DynamicTest> testNegativeCases() {
//        List<TestCase> caseList = Arrays.asList(
//                new TestCase(1.0, 2.0, 1.0, false),
//                new TestCase(5.0, 2.0, 3.0, false),
//                new TestCase(0.0, 0.0, 0.0, false)
//        );
//        return caseList.stream().map(
//                entry -> DynamicTest.dynamicTest(
//                        String.format("x:%s y:%s r:%s expected:%s", entry.x, entry.y, entry.r, entry.expected),
//                        () -> Assertions.assertEquals(opportunityToBeInLive.checkDataIsValid(entry.x, entry.y, entry.r), entry.expected)
//                )
//        );
//    }
//
//    @Data
//    @AllArgsConstructor
//    static
//    class TestCase {
//        private double x;
//        private double y;
//        private double r;
//        private boolean expected;
//    }
}