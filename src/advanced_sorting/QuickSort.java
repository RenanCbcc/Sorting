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
    private void quickSort(int begin, int end) {
        if (end - begin > 1) {//Un array of length one is already orderd.
            int pivot = array[end];
            int partition = partition(begin, end, pivot);
            quickSort(begin, partition - 1);
            quickSort(partition + 1, end);
        }
    }

    //--------------------------------------------------------------

    private int partition(int begin, int end, int pivot) {
        int left = begin - 1;
        int right = end;
        while (true) {
            while (left < end && array[++left] < pivot) {
                //Notice that is  necessary increment the variable before test it(++variable),
                //otherwise the lopping would be always false.
                //Does nothing, just
            }
            while (right > 0 && array[--right] > pivot) {
                //Does nothing, just go on.
            }
            if (left >= right) {
                break;//If the pointer crosses, partition is done.
            } else {
                swap(left, right);
            }

        }
        swap(left, end);//restore pivot.
        return left;

        /*
         * A less elegant solution to fid the partition can be:
         * int pivot = array[end-1];
         * int smallerFounded = 0;
         *for (int i =0; i< end-1; i++){
         *  if(array[i] <= pivot)
         *  {
         *  swap(pivot,smallerFounded);
         *  smallerFounded++;
         *      }
         * }
         * At the end of the lopping, the variable at position smallerFounded and pivot
         * must be exchanged.
         * */

    }

    //--------------------------------------------------------------
    private void swap(int in, int out) {
        int temp = array[in];
        array[in] = array[out];
        array[out] = temp;
    }
    //--------------------------------------------------------------
}
