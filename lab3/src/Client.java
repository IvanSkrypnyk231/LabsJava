import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private float money;
    private List<Goods> goodsList;

    public Client(String name, float money) {
        this(name, money, new ArrayList<>());
    }

    public Client(String name, float money, List<Goods> goodsList) {
        this.name = name;
        this.money = money;
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        String res = "Ім\'я: "+ this.name + "\n";
        res += "Бюджет: "+ this.money + "\n";
        res += "Список куплених товарів:\n"+ this.goodsList + "\n";
        return res;
    }
}
