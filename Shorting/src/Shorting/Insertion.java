package Shorting;

public class Insertion {


    public static void main(String[] args) {
        //Insertion Short

        long star = System.nanoTime();
        int count = 0;
        int swap = 0;
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 1; i < arr.length; i++) {
            int a = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[a] < arr[j]) {
                    int temp = arr[a];
                    arr[a] = arr[j];
                    arr[j] = temp;
                    a--;

                    System.out.println();
                    swap++;
                }
                count++;
            }
        }

        for (int itme : arr
        ) {
            System.out.print(itme + " ");
        }

        long end = (System.nanoTime() - star) / 1000000;

        System.out.println("\n" + "Tima take =" + end + "ms");
        System.out.println("Swaping run=" + swap);
        System.out.println("Loop run=" + count);
    }


}
