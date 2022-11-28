import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private float money;
    private List<Goods> goodsList;

    public Shop(String name, float money) {
        this(name,money, new ArrayList<>());
    }

    public Shop(String name, float money, List<Goods> goodsList) {
        this.name = name;
        this.money = money;
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        String res = "Назва: "+ this.name + "\n";
        res += "Бюджет: "+ this.money + "\n";
        res += "Список товарів:\n"+ this.goodsList + "\n";
        return res;
    }
}
