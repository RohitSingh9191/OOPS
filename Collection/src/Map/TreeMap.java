package Map;

public class TreeMap {
    public static void main(String[] args) {

        java.util.TreeMap<Integer,String> treeMap=new java.util.TreeMap<>();

        treeMap.put(2,"A");
        treeMap.put(1,"G");
        treeMap.put(3,"J");
        treeMap.put(8,"B");
        treeMap.put(26,"L");
        treeMap.put(7,"O");

        System.out.println(
                treeMap
        );

    }
}
