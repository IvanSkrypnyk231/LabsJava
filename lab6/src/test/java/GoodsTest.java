import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoodsTest {
    Goods goods;

    @Before
    public void setUp() {
        goods = new Goods();
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals("getPrice must return *0*",0, goods.getPrice(),4.0);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("getName must return *\"No name\"*","No name",goods.getName());
    }

    @Test
    public void getWeightTest() {
        Assert.assertEquals("getWeight must return *0*",0, goods.getWeight(), 4.0);
    }

    @Test
    public void getProducerTest() {
        Assert.assertEquals("getProducer must return *\"No producer\"*","No producer",goods.getProducer());
    }

    @Test
    public void toStringTest() {
        String expected = "Назва: No name\n" +
                "Ціна: 0.0\n" +
                "Вага: 0.0\n" +
                "Виробник: No producer\n" +
                "Типи товару: []\n";
        Assert.assertEquals("To string must return *"+expected+"*", expected, goods.toString());
    }
}
