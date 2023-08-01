package Shorting;

public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
              //  System.out.println(i);
            }
        }
        i++;
        // System.out.println(i);
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        //printarr(arr);
        return i;//PivatIndex
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            System.out.println("pivotIndex="+pivotIndex);

            quickSort(arr, low, pivotIndex - 1);
            System.out.print("First="); printarr(arr);
            System.out.println("high="+high);

            quickSort(arr, pivotIndex + 1, high);
            System.out.print("Second="); printarr(arr);




        } else {
        }

    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 6, 7, 5};
        // int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

       // printarr(arr);

    }

    private static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
