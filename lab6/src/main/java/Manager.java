import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Manager {
    private final Shop shop;

    public Manager(Shop shop) {
        this.shop = shop;
    }

    public void inputGoods(Scanner in) {
        Goods goods = new Goods();
        goods.inputData(in);
        shop.addGoods(goods);
    }

    public List<Goods> getGoods() {
        return shop.getGoods();
    }

    public List<Goods> getGoodsByTypes(Scanner in, boolean reverse) {
        System.out.print("Введіть тип товару: ");
        String typeStr = in.next();
        campaignType type = campaignType.valueOf(typeStr);
        Comparator<Goods> compareByWeight = Comparator.comparing(Goods::getWeight);
        Comparator<Goods> compareByProducer = Comparator.comparing(Goods::getProducer);
        Comparator<Goods> comparator = compareByWeight.thenComparing(compareByProducer);
        if (reverse) comparator = comparator.reversed();
        return shop.getGoods().stream().filter(el -> el.haveTypes(type)).sorted(comparator).collect(Collectors.toList());

    }

    public void sortGoodsByWeight(boolean reverse) {
        shop.sortByWeight(reverse);
    }

}
