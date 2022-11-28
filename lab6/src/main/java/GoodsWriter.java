import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GoodsWriter {

    public void writeToFile(List<Goods> goods) throws IOException {
        StringBuilder data = new StringBuilder(goods.get(0).getHeaders() + "\n");
        for (Goods g : goods) {
            data.append(g.toCSV()).append("\n");
        }
        Files.writeString(Path.of("Goods.csv"), data);
    }

    public String readFromFile() throws IOException {
        return Files.readString(Path.of("Goods.csv"));
    }
}
