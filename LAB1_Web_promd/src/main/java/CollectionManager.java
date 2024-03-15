import java.util.HashMap;
import java.util.Map;

public class CollectionManager {
    private Map<String, String> dataMap = new HashMap<>();

    public void put(String key, String value) {
        dataMap.put(key, value);
    }

    public String get(String key) {
        return dataMap.get(key);
    }

    public String replace(String key, String newValue) {
        return dataMap.replace(key, newValue);
    }

    // Дополнительные методы для поиска и замены, если нужно.
}