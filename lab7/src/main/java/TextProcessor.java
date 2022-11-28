import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    Pattern pattern = Pattern.compile("[0-9]{5}", Pattern.CASE_INSENSITIVE);

    public Object[] process(String text){
        ArrayList<String> list = new ArrayList<String>();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            var elem = matcher.group();
            if(Integer.parseInt(elem) <= 89011) {
                list.add(elem);
            }
        }
        return list.toArray();
    }
}
