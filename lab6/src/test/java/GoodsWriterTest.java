import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoodsWriterTest {
    GoodsWriter goodsWriter;
    List<Goods> goods;

    @Before
    public void setUp() {
        goodsWriter = new GoodsWriter();
        goods = new ArrayList<Goods>();
        goods.add(new Goods());
        goods.add(new Goods());
        goods.add(new Goods());
    }

    @Test
    public void writeToFileTest() throws IOException {
        var works = true;
        try{
            goodsWriter.writeToFile(goods);
        }catch (Exception e){
            works = false;
        }
        Assert.assertTrue(works);
    }

    @Test
    public void writeToFileTest2() throws IOException {
        goodsWriter.writeToFile(goods);
        var expected = "price,name,weight,producer,types\n" +
                "0.0,No name,0.0,No producer,[]\n" +
                "0.0,No name,0.0,No producer,[]\n" +
                "0.0,No name,0.0,No producer,[]\n";
        Assert.assertEquals("Must be"+expected, expected, goodsWriter.readFromFile());
    }
}