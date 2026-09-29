public class MergeSort {

    static void mergeArray(int[] a, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[100];

        while (i <= mid && j <= high) {

            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }

            k++;
        }

        // Left part 
        while (i <= mid) {
            temp[k] = a[i];
            i++;
            k++;
        }

        // Right part 
        while (j <= high) {
            temp[k] = a[j];
            j++;
            k++;
        }

        for (i = low, k = 0; i <= high; i++, k++) {
            a[i] = temp[k];
        }
    }

    static void mergeSort(int[] a, int low, int high) {

        if (low >=high) return ;//base case

            int mid =low + (high-low) / 2;

            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            mergeArray(a, low, mid, high);
        
    }

    public static void main(String[] args) {

        int[] a = {38, 27, 43, 3, 9, 82, 10};
        int n=a.length;

        mergeSort(a, 0, n-1 );

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}