package Set;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> hashSet=new java.util.HashSet<>();

        hashSet.add(45);
        hashSet.add(42);
        hashSet.add(49);
        hashSet.add(41);
        hashSet.add(5);
        hashSet.add(53);
        hashSet.add(45);
        boolean a=hashSet.contains(45);
        System.out.println(a);
        hashSet.remove(5);
        System.out.println(hashSet);

       hashSet.forEach((element)->{
           System.out.println(element);
       });
    }
}
