public class Main {
    public static void main(String[] args) {
        long start=System.nanoTime();
        int n=0;
        for(int i=0;i<100000;i++){

            System.out.println("Hello world!"+n);
            n++;
        }
        long end=(System.nanoTime()-start)/1000000;
        System.out.println("Time take to run time program="+end+"ms");
    }
}