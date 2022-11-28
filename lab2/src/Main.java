import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<campaignType> types = new HashSet<campaignType>();
        types.add(campaignType.Hiking);
        List<Goods> goods = new ArrayList<>();
        goods.add(new Goods(1000, "Палатка", 20, "Німечина", types));
        Shop shop = new Shop("Магазин", 10000, goods);
        Client client = new Client("Василій", 5000);

        System.out.println("Магазин:\n"+shop);
        System.out.println("Клієнт:\n"+client);
    }
}
