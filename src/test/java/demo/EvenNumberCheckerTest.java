package demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EvenNumberCheckerTest {
    private Integer inputNumber;
    private Boolean expectedResult;
    private EvenNumberChecker evenNumberChecker;

    @Before
    public void initialize() {
        evenNumberChecker = new EvenNumberChecker();
    }

    public EvenNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection numbers() {
        return asList(new Object[][]{
                {1, false},
                {2, true},
                {19, false},
                {22, true},
                {23, false}
        });
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test
    public void testPrimeNumberChecker() {
        assertEquals(expectedResult, evenNumberChecker.isEven(inputNumber));
    }
}