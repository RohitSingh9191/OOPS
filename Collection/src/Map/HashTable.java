package Map;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();


        hashtable.put(4,"Fourth");
        hashtable.put(2,"Second");
        hashtable.put(3,"Third");
        hashtable.put(1,"First");

        System.out.println(hashtable);
    }
}
