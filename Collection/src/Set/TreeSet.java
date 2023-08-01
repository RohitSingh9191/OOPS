package Set;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> treeSet=new java.util.TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(45);
        treeSet.add(78);
        treeSet.add(78);

        treeSet.remove(78);
//        treeSet.clear();
        System.out.println(treeSet);

    }
}
