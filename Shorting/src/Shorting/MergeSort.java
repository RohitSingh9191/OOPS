package Shorting;

public class MergeSort {
    public static void divide(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        } else {
            int mid = si + (ei - si) / 2;
            System.out.println("Call dive 1");
            divide(arr, si, mid);

            System.out.println("Call dive 2");
            divide(arr, mid + 1, ei);
            System.out.println("Call Conqure");
            conqure(arr, si, mid, ei);
        }
    }
    public static void conqure(int arr[], int si, int mid, int ei) {
        int marge[] = new int[ei - si + 1];
        System.out.println("si= " + si + " mid= " + mid + " ei= " + ei);
        System.out.println("Length= "+marge.length);
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;
        while ((indx1 <= mid && indx2 <= ei)) {
            if (arr[indx1] <= arr[indx2]) {
                System.out.println("x= "+x+" index1= "+indx1 +" index2= "+indx2 );
                marge[x++] = arr[indx1++];
            } else {
                System.out.println("x= "+x+" index2= "+indx2 +" else");
                marge[x++] = arr[indx2++];
            }
        }
        while (indx1 <= mid) {
            marge[x++] = arr[indx1++];
            System.out.println("x= "+x+" index1= "+indx1);
        }
        while (indx2 <= ei) {
            marge[x++] = arr[indx2++];
            System.out.println("x= "+x+" index2= "+indx2);
        }
        for (int i = 0, j = si; i < marge.length; i++, j++) {
            arr[j] = marge[i];
            System.out.print(arr[j]+" ");

        } System.out.println();
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //int arr[]={9,8,7,6,5,4,3,2,1};
        int arr[] = {3, 6, 1, 2, 8, 9, 4};
        int n = arr.length;
        int si = 0;
        int ei = n - 1;
        divide(arr, si, ei);
        printArray(arr);

    }
}
