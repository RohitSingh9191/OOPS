package Shorting;

public class HeapSort {

    public void heapSort(int[] arr) {
        int n = arr.length;
        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);}

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move the current root (max element) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        System.out.println(n+" "+i);
        peintArray(arr);
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is larger than the root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // Check if right child is larger than the root
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If the largest element is not the root, then swap and continue heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
        public static void peintArray(int arr[]){
            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    public static void main(String[] args) {
        int[] arr = {9,3,2,7,6,1,5};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);
        peintArray(arr);

    }
}
