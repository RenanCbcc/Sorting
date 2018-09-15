package advanced_sorting;

public class MergeSort {

    private int[] array;
    private int elements;

    //----------------------------------------------------------

    public MergeSort(int max) {
        array = new int[max];
        elements = 0;
    }

    //----------------------------------------------------------

    public void insert(int value) {
        array[elements] = value;
        elements++;
    }

    //----------------------------------------------------------

    public void display() {
        for (int i = 0; i < elements; i++) {
            System.out.println(array[i]);
        }
    }

    //----------------------------------------------------------

    public void sort() {
        int[] workspace = new int[elements];
        sort(workspace, 0, elements - 1);
    }

    //----------------------------------------------------------

    private void sort(int[] workspace, int begin, int end) {
        if (begin == end) {
            /**
             In that case,my array's size is exactly one and there is no need of sorting.
             This is also known as base case of the recursion.
             */

            return;

        } else {
            int middle = (begin + end) / 2;

            sort(workspace, begin, middle);

            sort(workspace, middle + 1, end);

            merge(workspace, begin, middle + 1, end);

        }
    }

    //----------------------------------------------------------
    private void merge(int[] workspace, int begin, int middle, int end) {
        int current = 0;
        int initial = begin;
        int mid = middle - 1;

        while (begin <= mid && middle <= end) {
            if (this.array[begin] < this.array[middle]) {
                workspace[current++] = this.array[begin++];
            } else {
                workspace[current++] = this.array[middle++];
            }
        }

        while (begin <= mid) {
            workspace[current++] = this.array[begin++];
        }

        while (middle <= end) {
            workspace[current++] = this.array[middle++];
        }

        for (int counter = 0; counter < current; counter++) {
            this.array[initial + counter] = workspace[counter];
        }

    }

    //----------------------------------------------------------
    /*
     * Example of mergesorte-like algorithm*/
    private void mergesort(int[] arrayA, int sizeA,
                           int[] arrayB, int sizeB,
                           int[] arrayC) {
        int aDex = 0, bDex = 0, cDex = 0;

        while (aDex < sizeA && bDex < sizeB) {
            if (arrayA[aDex] < arrayB[bDex]) {
                arrayC[cDex++] = arrayA[aDex++];
            } else {
                arrayC[cDex++] = arrayA[bDex++];
            }
        }

        while (aDex < sizeA) {//Array A is not empty.
            arrayC[cDex++] = arrayA[aDex++];
        }

        while (bDex < sizeB) {//Array B is not empty.
            arrayC[cDex++] = arrayB[bDex++];
        }
    }
}
