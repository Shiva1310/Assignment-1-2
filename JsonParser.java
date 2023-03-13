import java.util.*;
import java.util.regex.*;

public class JsonParser {
    public static void main(String[] args) {
        String json = "{\"name\":\"Sarah\",\"age\":\"23\"}";

        // Use regex to extract key-value pairs
        Pattern pattern = Pattern.compile("\\{\"(.+?)\":\"(.+?)\"\\}");
        Matcher matcher = pattern.matcher(json);

        // Store key-value pairs in a Map
        Map<String, String> map = new HashMap<>();
        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);
            map.put(key, value);
        }

        // Print out key-value pairs
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
