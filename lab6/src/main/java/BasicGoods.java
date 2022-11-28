public class BasicGoods {
    protected float price;
    protected String name;
    protected float weight;
    protected String producer;

    public String getHeaders() {
        return "price" + "," + "name" + "," + "weight" + "," + "producer";
    }

    public String toCSV() {
        return price + "," + name + "," + weight + "," + producer;
    }
}
