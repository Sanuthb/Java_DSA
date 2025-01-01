import java.util.Scanner;

class Bubble_sort {
    static void bubbleSort(int arr[], int n) {
        // for (int i = 0; i < n; i++) {
        //     for (int j =0; j < n - 1 - i; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        for (int i = 0; i < n; i++) {
            for (int j =i+1; j < n ; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(arr, size);
    }
}