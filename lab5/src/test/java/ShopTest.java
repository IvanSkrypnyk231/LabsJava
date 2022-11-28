import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp() {
        shop = new Shop("Shop", 300);
    }

    @Test
    public void getGoodsTest() {
        Assert.assertEquals("",new ArrayList<Goods>(), shop.getGoods());
    }

    @Test
    public void addGoodsTest() {
        boolean correct = true;
        try {
            shop.addGoods(new Goods());
        } catch (Exception e){
            correct = false;
        }
        Assert.assertTrue(correct);
    }

    @Test
    public void addMoneyTest1() {
        boolean correct = true;
        try{
            shop.addMoney(0);
        } catch (Exception e){
            correct = false;
        }
        Assert.assertTrue(correct);
    }

    @Test
    public void addMoneyTest2() {
        boolean correct = false;
        try{
            shop.addMoney(-10);
        } catch (Exception e){
            correct = true;
        }
        Assert.assertTrue(correct);
    }

    @Test
    public void toStringTest() {
        String expected = "Назва: Shop\n" +
                "Бюджет: 300.0\n" +
                "Список товарів:\n" +
                "[]\n";
        Assert.assertEquals("toString must return *"+expected+"*", expected, shop.toString());
    }
}
