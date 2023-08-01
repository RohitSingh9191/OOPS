package List;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Adding elements
        map.put("Rohit", 1);
        map.put("Aman", 2);
        map.put("Akshat", 3);
        map.put("Aditya", 4);//value Duplicacy not allow
        map.put("Aditya", 5);
        map.put("Aditya", 5);//kay Duplicacy not allow
        System.out.println(map);

        map.forEach((key, value) -> {
            System.out.println(key + "=> " + value);
        });
    }

}
