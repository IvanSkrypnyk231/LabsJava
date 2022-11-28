import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shop {
    private final String name;
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

    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }

    public void addMoney(float money) {
        this.money += money;
    }

    public List<Goods>  getGoods() {
        return goodsList;
    }

    public void sortByWeight(boolean reverse) {

        Comparator<Goods> compareByWeight= Comparator.comparing( Goods::getWeight );
        if (reverse) compareByWeight = compareByWeight.reversed();
        goodsList = goodsList.stream().sorted(compareByWeight).collect(Collectors.toList());
    }
    @Override
    public String toString() {
        String res = "Назва: "+ this.name + "\n";
        res += "Бюджет: "+ this.money + "\n";
        res += "Список товарів:\n"+ this.goodsList + "\n";
        return res;
    }


}
