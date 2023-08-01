package List;

import java.util.*;
public class Vector {
    public static void main(String[] args) {

        java.util.Vector list=new java.util.Vector();

        list.add("Rohit");
        list.addElement(4545);
        list.add(true);
        list.addElement("Singh");
        System.out.println(list);

        java.util.Vector<String> srtlist=new java.util.Vector<>();

        srtlist.add("Rohit");
        srtlist.add("Singh");
        srtlist.add("Aman");
        srtlist.add("Snehil");
        srtlist.add("Ashutosh");
        srtlist.add("Sagr");
        System.out.println(srtlist.hashCode());
        System.out.println(srtlist.size());
        srtlist.forEach((item)->{
            System.out.println(item);
        });

    }
}
