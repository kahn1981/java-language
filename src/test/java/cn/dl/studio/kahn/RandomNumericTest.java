package cn.dl.studio.kahn;

// import junit.framework.TestCase;
// import org.junit.Assert;
// import org.junit.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomNumericTest {
    @Mock
    private RandomNumeric randomNumeric=new RandomNumeric();

    // @Test
    public void testGenerateRandomNumeric() {
        String result= RandomNumeric.GenerateRandomNumeric();
        assertEquals("", result);
    }

    // @Test
    public void testGetCheckResult() {
    }
}