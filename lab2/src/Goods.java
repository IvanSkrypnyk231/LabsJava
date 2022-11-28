import java.util.Set;

public class Goods {
    private float price;
    private String name;
    private float weight;
    private String producer;
    private Set<campaignType> types;

    public Goods(float price, String name, float weight, String producer, Set<campaignType> types) {
        this.price = price;
        this.name = name;
        this.weight = weight;
        this.producer = producer;
        this.types = types;
    }

    @Override
    public String toString() {
        String res = "Назва: "+ this.name + "\n";
        res += "Ціна: "+ this.price + "\n";
        res += "Вага: "+ this.weight + "\n";
        res += "Виробник: "+ this.producer + "\n";
        res += "Типи товару: "+ this.types + "\n";
        return res;
    }
}
