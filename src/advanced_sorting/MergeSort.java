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
        int[] workspace = new int[elements];
        sort(workspace, 0, elements - 1);
    }

    //----------------------------------------------------------

    private void sort(int[] workspace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;

            sort(workspace, lowerBound, mid);

            sort(workspace, mid + 1, upperBound);

            merge(workspace, lowerBound, mid + 1, upperBound);

        }
    }

    //----------------------------------------------------------

    private void merge(int[] workspace, int lowPointer, int highPointer, int upperBound) {
        int j = 0;
        int lowerBound = lowPointer;
        int mid = highPointer - 1;
        int n = upperBound - lowerBound + 1; // # of itens

        while (lowPointer <= mid && highPointer <= upperBound) {
            if (this.array[lowPointer] < this.array[highPointer]) {
                workspace[j++] = this.array[lowPointer++];
            } else {
                workspace[j++] = this.array[highPointer++];
            }
        }

        while (lowPointer <= mid) {
            workspace[j++] = this.array[lowPointer++];
        }

        while (highPointer <= upperBound) {
            workspace[j++] = this.array[highPointer++];
        }

        for (j = 0; j < n; j++) {
            this.array[lowerBound + j] = workspace[j];
        }

    }

    //----------------------------------------------------------

}
