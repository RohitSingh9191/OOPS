package Map;

public class LinkedHashMap {
    public static void main(String[] args) {

        java.util.LinkedHashMap<Integer,String> linkedHashMap=new java.util.LinkedHashMap<>();

        linkedHashMap.put(45,"hii");
        linkedHashMap.put(02,"hi");
        linkedHashMap.put(null,"hello");
        linkedHashMap.put(25,"hii");

        System.out.println(linkedHashMap);
    }
}
