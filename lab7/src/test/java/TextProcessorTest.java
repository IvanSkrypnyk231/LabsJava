import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TextProcessorTest {
    TextProcessor tp;

    @Before
    public void setUp() {
        tp = new TextProcessor();
    }

    @Test
    public void toStringTest() {
        String[] result = new String[]{
                "12345",
                "72362",
                "58457"
        };
        String text = "nhudxwuh12345 jnicuerc 72362 90449jfjk58457";
        Assert.assertEquals("To string must return *"+result+"*", result, tp.process(text));
    }
}
