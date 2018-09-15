package simple_sorting;

public class InsertionSort {
    private int[] array;
    private int elements;

    //----------------------------------------------------------

    public InsertionSort(int max) {
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
        int in, out;
        for (out = 1; out < elements; out++) {
            in = out;
            while (in > 0 && array[in] < array[in - 1]) {
                swap(in - 1, in);
                in--;
            }
        }
    }

    //----------------------------------------------------------
    private void swap(int in, int out) {
        int temp = array[in];
        array[in] = array[out];
        array[out] = temp;
    }
    //----------------------------------------------------------


}
