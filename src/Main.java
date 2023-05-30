
public class Main {
    public static void main(String[] args) {
        int[] array = {1,8,5,9,3,6,8};
        int[] array2 = {9,3,5,7,2,3};

        System.out.println("Array before sorting:");
        printArray(array);

        bubbleSort(array, array.length);

        System.out.println("Array after bubble sort:");
        printArray(array);

        //Quick Sort
        System.out.println("\n\n\nNext array");
        System.out.println("Array before sorting:");
        printArray(array2);

        quickSort(array2, 0, array2.length-1);

        System.out.println("Array after quick sort:");
        printArray(array2);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr, int n){
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pivotIndex = partition(arr, l, h);
            quickSort(arr, l, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = (l - 1);

        for (int j = l; j <= h - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;

        return (i + 1);
    }

}