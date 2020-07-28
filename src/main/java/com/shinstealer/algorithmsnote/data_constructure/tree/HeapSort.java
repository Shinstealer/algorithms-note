package com.shinstealer.algorithmsnote.data_constructure.tree;

/**
 * Heap sort is a comparison based sorting technique based on Binary Heap data
 * structure. It is similar to selection sort where we first find the maximum
 * element and place the maximum element at the end. We repeat the same process
 * for remaining element.
 */
public class HeapSort {

    void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            System.out.println(i);
            maxHeapify(arr, n, i);
        }
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            maxHeapify(arr, i, 0);
        }

    }

    private void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;

        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;

        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            maxHeapify(arr, n, largest);
        }

    }

    private void smallHeapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            smallHeapify(arr, n, smallest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        HeapSort h = new HeapSort();
        h.sort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }

}