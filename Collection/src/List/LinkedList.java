package List;

import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> name=new java.util.LinkedList<>();
        name.add("Rohit Sing");
        name.add("55");
        name.add("Rhahul");
        name.add("Anupam");
        name.add("Sara");
        name.add("Rohit Sing");
        name.addLast("Hero");
        name.addFirst("Hii");
        name.add(4,"Hello Sir");
        name.removeFirst();
        System.out.println(name);//-[Rohit Sing, 55, Rhahul, Anupam, Sara]
        System.out.println(name.get(0));//-Rohit Sing
        System.out.println(name.size());//-5
    }
}
