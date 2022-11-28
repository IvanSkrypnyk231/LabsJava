import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager(new Shop("Shop", 300));
    }

    @Test
    public void getGoodsTest() {
        Assert.assertEquals("Not correct", new ArrayList<Goods>(), manager.getGoods());
    }

    @Test
    public void sortGoodsByWeightTest() {
        boolean correct = true;
        try{
            manager.sortGoodsByWeight(false);
        } catch (Exception e){
            correct = false;
        }
        Assert.assertTrue(correct);
    }
}
