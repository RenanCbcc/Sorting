package simple_sorting;

public class BubbleSort {
    private int[] array;
    private int elements;

    //----------------------------------------------------------

    public BubbleSort(int max) {
        array = new int[max];
        elements = 0;
    }

    //----------------------------------------------------------

    public void inserte(int value) {
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
        for (out = elements - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, out);

                }
            }

        }
    }

    //----------------------------------------------------------

    private void swap(int in, int out) {
        int temp = array[in];
        array[in] = array[out];
        array[out] = temp;

    }
}
