package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMaps {

    static class HashMapp<K, V> {//Genrics

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;//number of node
        private int N;//Number of buckets

        private LinkedList<Node> bucket[];//N=buckets.length

        @SuppressWarnings("unchecked")
        public HashMapp() {
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key) {
            int bucketIndex=key.hashCode();
            return Math.abs(bucketIndex)%N;
        }
        private void rehash(){
            LinkedList<Node> oldbukect[]=bucket;
            bucket=new LinkedList[N*2];

            for(int i=0;i<N*2;i++){
                bucket[i]=new LinkedList<>();
            }

            for(int i=0;i< oldbukect.length;i++){
                LinkedList<Node> ll=oldbukect[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        public int searchLinkeList(K key, int bi) {
            LinkedList<Node> ll=bucket[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
                else{
                    return -1;
                }
            }
            return 0;
        }

        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchLinkeList(key, bucketIndex);
            if (dataIndex == -1) {//Key dose not exist
                bucket[bucketIndex].add(new Node(key, value));
                n++;
            }
            else {//Key exist
                Node node= bucket[bucketIndex].get(dataIndex);
                node.value=value;
            }
            double lambda = n/N;
            if(lambda>2.0){
                //Rehashing
                rehash();
            }
        }


        public boolean contains(K key) {

            return false;
        }

        public V get() {
            return null;
        }

        public K remove() {
            return null;
        }

        public ArrayList<K> keySet() {
            return null;
        }

        public boolean isEmpty() {
            return false;
        }

    }

    public static void main(String[] args) {

        HashMapp<String,Integer> hash = new HashMapp();
        hash.put("India",250);
        hash.put("Srilanka",50);
        hash.put("USA",150);
        hash.put("Rasia",350);


 //       java.util.HashMap<Integer, String> hashMap = new java.util.HashMap<>();
//        hashMap.put(05,"Chintu");
//        hashMap.put(06,"Akku");
//        hashMap.put(01,"Rohit");
//        hashMap.put(02,"Aman");
//        hashMap.put(03,"Rahul");
//        hashMap.put(04,"Sonu");
//        hashMap.put(04,"Ranu");//update
//
//        System.out.println(hashMap.get(1));
//        System.out.println(hashMap.get(10));
//
//        System.out.println(hashMap.containsKey(9));
//        System.out.println(hashMap.containsValue("Ranu"));
//
//        System.out.println(hashMap);
//
//        hashMap.remove(4);
//       // for (Map<Integer,String> e: hashMap.entrySet()){}
//        hashMap.forEach((key,value)->{
//            System.out.println(key+" - "+value);
//        });

    }


}
