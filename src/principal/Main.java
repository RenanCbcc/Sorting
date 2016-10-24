package principal;
import simple_sorting.Bubble_sort;
import simple_sorting.Insertion_sort;
import simple_sorting.Selection_sort;

public class Main {
	private int MAX = 100;
	private Bubble_sort array; //objeto do tipo Bubble
	private Selection_sort Selection_array;
	private Insertion_sort Insertion_array;
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
	
	//----------------------------------------------------------
			
	array = new Bubble_sort(MAX);
	array.inserte(0);
	array.inserte(2);
	array.inserte(4);
	array.inserte(7);
	array.inserte(10);
	array.inserte(13);
	array.inserte(5);
	array.inserte(22);
	array.inserte(16);
	array.inserte(15);
	System.out.println("Antes");
	array.display();//antes
	array.Bubblesort();//ordena
	System.out.println("Depois");
	array.display();//depois
	
	//----------------------------------------------------------
	
	}

}
