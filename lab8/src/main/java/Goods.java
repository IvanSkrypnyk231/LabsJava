import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

@Entity
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private float price;
    private String name;
    private float weight;
    private String producer;
    private campaignType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Goods() {
        this(0, "No name", 0, "No producer", campaignType.Hiking);
    }

    public Goods(float price, String name, float weight, String producer, campaignType type) {
        this.price = price;
        this.name = name;
        this.weight = weight;
        this.producer = producer;
        this.type = type;
    }

    public long getID() { return id; }

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
        return this.type == type;
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
            this.type = campaignType.valueOf(type);

            System.out.println("Бажаєте добавити ще 1 категорію? (y/n)");
            String answer = in.next();
            if(Objects.equals(answer, "n")) {
                break;
            }
        } while (true);
    }
    @Override
    public String toString() {
        String res = "Name: "+ this.name + "\n";
        res += "Price: "+ this.price + "\n";
        res += "Weight: "+ this.weight + "\n";
        res += "Producer: "+ this.producer + "\n";
        res += "Types : "+ this.type + "\n";
        return res;
    }
}
