package Validators;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static Validators.BestValidatorEver.checkDataIsValid;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BestValidatorEverTest {
    @Test
    void checkDataIsValidExample() {
        assertFalse(checkDataIsValid(2.0, 2.0, 3.0));
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
                        String.format("x:%s y:%s r:%s expected:%s", entry.x,entry.y, entry.r, entry.expected),
                        () -> assertEquals(checkDataIsValid(entry.x, entry.y, entry.r), entry.expected)
                )
        );
    }

    @Data
    @AllArgsConstructor
    class TestCase {
        private double x;
        private double y;
        private double r;
        private boolean expected;
    }
}