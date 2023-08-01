package Shorting;

public class Selection {
    //Selection Short
    public static void main(String[] args) {
        long star = System.nanoTime();
        //int arr[] = {5, 4, 1, 3, 2, 8, 9, 7, 6};
       int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int count = 0;
        int swap=0;
        //Time Complexity-(n^2)
        for (int i = 0; i < arr.length -1; i++) {
                int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                   smallest=j;
                    swap++;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
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
