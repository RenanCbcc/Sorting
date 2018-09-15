package simple_sorting;

public class SelectionSort {
    private int[] array;
    private int elements;

    //----------------------------------------------------------

    public SelectionSort(int max) {
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
            System.out.print(array[i]);
        }
    }

    //----------------------------------------------------------

    public void sort() {
        int in, out, min;
        for (out = 0; out < elements - 1; out++) {
            min = out;
            for (in = out + 1; in < elements; in++) {
                if (array[min] > array[in])
                    min = in;
            }
            swap(out, min);
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
