package advanced_sorting;

public class ShellSort {

    private int[] array;
    private int elements;

    //----------------------------------------------------------

    public ShellSort(int max) {
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
        int inner, outer;
        int temp;
        int h = 1;
        while (h <= elements / 3)
            h = h * 3 + 1;
        while (h > 0) {
            for (outer = h; outer < elements; outer++) {
                temp = array[outer];
                inner = outer;
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;

                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;

        }

    }

    //--------------------------------------------------------------
}

