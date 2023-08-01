package List;

import javax.xml.catalog.Catalog;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Travers {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(12);
        treeSet.add(45);
        treeSet.add(2);
        treeSet.add(45);
        treeSet.add(12);
        treeSet.add(89);
        treeSet.add(234);
        treeSet.add(5);
        treeSet.add(53);

//        //Traver with ForEach method
//        for (int item : treeSet) {
//            System.out.println(item);
//        }
        treeSet.forEach(e->{
            System.out.println(e);
        });
        System.out.println("-------------------------------------------------------");

        //List.Travers with Iterator Forward Traversing
        System.out.println("List.Travers with Iterator");

       Iterator<Integer> iterator= treeSet.iterator();
       while (iterator.hasNext()){
                int a=iterator.next();
           System.out.println(a);
       }
        System.out.println("--------------------------------------------------");
        ArrayList<String> nameList=new ArrayList<String>();
        nameList.add("Rohit");
        nameList.add("Aman");
        nameList.add("Sara");
        nameList.add("Darhan");
        nameList.add("Hemant");
        nameList.add("Isha");

        //List.Travers with ListIterator Backward Traversing
        ListIterator<String> listIterator=nameList.listIterator(nameList.size());
        while (listIterator.hasPrevious()){
            String previous=listIterator.previous();
            System.out.println(previous);
        }
    }
}


