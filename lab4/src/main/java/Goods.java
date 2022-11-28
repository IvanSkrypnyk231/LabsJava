import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Goods {
    private float price;
    private String name;
    private float weight;
    private String producer;
    private Set<campaignType> types;

    public Goods() {
        this(0, "No name", 0, "No producer", new HashSet<>());
    }

    public Goods(float price, String name, float weight, String producer, Set<campaignType> types) {
        this.price = price;
        this.name = name;
        this.weight = weight;
        this.producer = producer;
        this.types = types;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public String getProducer() {
        return producer;
    }

    public boolean haveTypes(campaignType type) {
        return types.contains(type);
    }

    public void inputData(Scanner in) {
        System.out.print("Введіть назву: ");
        this.name = in.next();

        System.out.print("Введіть ціну: ");
        this.price = in.nextFloat();

        System.out.print("Введіть вагу: ");
        this.weight = in.nextFloat();

        System.out.print("Введіть виробника: ");
        this.producer = in.next();


        do {
            System.out.print("Введіть тип ( Hiking, mountainHike, Bicycle): ");
            String type = in.next();
            types.add(campaignType.valueOf(type));

            System.out.println("Бажаєте добавити ще 1 категорію? (y/n)");
            String answer = in.next();
            if(Objects.equals(answer, "n")) {
                break;
            }
        } while (true);
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
