import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String[] elements = {"apple", "banana", "apple", "orange", "banana", "apple"};

    public static void main(String[] args) {
        System.out.println(fillingMap(elements));
    }

    public static Map<String,Integer> fillingMap(String[] el){
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < el.length; i++) {
            map.put(el[i], map.getOrDefault(el[i], 0) + 1);
        }
        return map;
    }
}