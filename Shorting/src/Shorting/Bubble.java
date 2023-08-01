package Shorting;

public class Bubble {
    public static void main(String[] args) {
        long star = System.nanoTime();
        //int arr[] = {5, 4, 1, 3, 2, 8, 9, 7, 6};
       int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        //Bubble Short

        int count = 0;
        int swap=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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

        //time complexity=O(n^2)
    }
}
