package advanced_sorting;

public class QuickSort {


    private int[] array;
    private int elements;

    //----------------------------------------------------------

    public QuickSort(int max) {
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

    //--------------------------------------------------------------

    public void sort() {
        this.quickSort(0, elements - 1);
    }

    //--------------------------------------------------------------
    public void quickSort(int left, int right) {
        if (right - left <= 0)
            return;
        else {
            long pivot = array[right];
            int partition = partition(left, right, pivot);
            quickSort(left, partition - 1);
            quickSort(partition + 1, right);
        }
    }

    //--------------------------------------------------------------
    public int partition(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (array[++leftPtr] < pivot)
                while (rightPtr > 0 && array[--rightPtr] > pivot)
                    ; // (nop)
            if (leftPtr >= rightPtr)
                // if pointers cross,
                break;
            else
                // not crossed, so
                swap(leftPtr, rightPtr); //

        } // end while(true)
        swap(leftPtr, right);
        // restore pivot
        return leftPtr;
        // return pivot location
    } // end partitionIt()

    //--------------------------------------------------------------
    private void swap(int in, int out) {
        int temp = array[in];
        array[in] = array[out];
        array[out] = temp;
    }
    //--------------------------------------------------------------
}
