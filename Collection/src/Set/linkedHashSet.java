package Set;

import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add(45);
        linkedHashSet.add(23);
        linkedHashSet.add(89);
        linkedHashSet.add(56);
        linkedHashSet.add(100);

        linkedHashSet.remove(100);
        System.out.println(linkedHashSet);
        linkedHashSet.forEach((element)->{
            System.out.println(element);
        });

    }
}
