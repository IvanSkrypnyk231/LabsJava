import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Console;

public class ClientTest {
    Client client;

    @Before
    public void setUp() {
        client = new Client("vova", 200);
    }

    @Test
    public void toStringTest() {
        String expected = "Ім'я: vova\n" +
                "Бюджет: 200.0\n" +
                "Список куплених товарів:\n" +
                "[]\n";
        Assert.assertEquals("To string must return *"+expected+"*", expected, client.toString());
    }
}
