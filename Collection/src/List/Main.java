package List;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Type-Safe collection
        ArrayList<String> name = new ArrayList<String>();
        name.add("Rohit Sing");
        name.add("55");
        name.add("Rhahul");
        name.add("Anupam");
        name.add("Sara");
        name.add("Rohit Sing");

        System.out.println(name);//-[Rohit Sing, 55, Rhahul, Anupam, Sara]
        System.out.println(name.get(0));//-Rohit Sing
        System.out.println(name.size());//-5

        name.remove("Sara");//-[Rohit Sing, 55, Rhahul, Anupam, Rohit Sing]
        System.out.println(name);
        name.set(0, "Ram");//Remove element on 0 index and set Ram=[Ram, 55, Rhahul, Anupam, Rohit Sing]
        System.out.println(name);
        name.add(0, "Shita");//-[Shita, Ram, 55, Rhahul, Anupam, Rohit Sing]
        System.out.println(name);


        //UnType-Safe collection
        java.util.LinkedList list = new java.util.LinkedList();
        list.add(2001);
        list.add("Rohit Singh");
        list.add(true);
        list.add(22.8);
        System.out.println(list);//-[2001, Rohit Singh, true, 22.8]


        System.out.println("-------------------------------------------------------");

        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(54212.21);
        hashSet.add(12.2);
        hashSet.add(20.36);
        hashSet.add(1.2);
        hashSet.add(14.36);
        hashSet.add(54212.21);
        hashSet.add(54212.21);//Duplicacy not allow do not show multiple time in out-put
        System.out.println(hashSet);

        System.out.println("-------------------------------------------------------");
        TreeSet<Double> treeSet = new TreeSet<Double>(hashSet);
        System.out.println(treeSet);

        for (double item : treeSet) {
            System.out.println(item);
        }

    }
}
