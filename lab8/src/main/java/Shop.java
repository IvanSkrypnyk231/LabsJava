import java.util.*;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.stream.Collectors;

public class Shop {
    private final String name;
    private float money;
    private ArrayList<Goods> goodsList;


    public Shop(String name, float money) {
        this(name,money, new ArrayList<Goods>());
    }

    public Shop(String name, float money, ArrayList<Goods> goodsList) {
        this.name = name;
        this.money = money;
        this.goodsList = goodsList;
    }

    public void updateGoods(int id, Goods goods){
        for(int i=0; i<goodsList.size(); i+=1){
            if(goodsList.get(i).getID() == id){
                goodsList.set(i, goods);
                return;
            }
        }
    }
    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }

    public void addMoney(float money) {
        this.money += money;
    }

    public ArrayList<Goods> getGoods() {
        return goodsList;
    }

    public void sortByWeight(boolean reverse) {

        //Comparator<Goods> compareByWeight= Comparator.comparing( Goods::getWeight );
        //if (reverse) compareByWeight = compareByWeight.reversed();
        //goodsList = goodsList.stream().sorted(compareByWeight).collect(Collectors.toList());
    }
    @Override
    public String toString() {
        String res = "Назва: "+ this.name + "\n";
        res += "Бюджет: "+ this.money + "\n";
        res += "Список товарів:\n"+ this.goodsList + "\n";
        return res;
    }

    public void delete(int id) {
        for(int i=0; i<goodsList.size(); i+=1){
            if(goodsList.get(i).getID() == id){
                goodsList.remove(i);
                return;
            }
        }
    }
}
