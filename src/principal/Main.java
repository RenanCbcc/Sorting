package principal;
import simple_sorting.Bubble_sort;
import simple_sorting.Insertion_sort;
import simple_sorting.Selection_sort;
import advanced_sorting.Merge_sort;

public class Main {
	
	static int MAX = 100;
	static Bubble_sort 		Bubble_array; //objeto do tipo Bubble
	static Selection_sort	Selection_array;
	static Insertion_sort	Insertion_array;
	static Merge_sort		Merge_array;
	public static void main(String[] args) {
	
		
		
		// TODO Auto-generated method stub
	
	//----------------------------------------------------------
		/*	
		Bubble_array = new Bubble_sort(MAX);
		Bubble_array.inserte(0);
		Bubble_array.inserte(2);
		Bubble_array.inserte(4);
		Bubble_array.inserte(7);
		Bubble_array.inserte(10);
		Bubble_array.inserte(13);
		Bubble_array.inserte(5);
		Bubble_array.inserte(22);
		Bubble_array.inserte(16);
		Bubble_array.inserte(15);
		System.out.println("Antes");
		Bubble_array.display();//antes
		Bubble_array.BubbleSort();//ordena
		System.out.println("Depois");
		Bubble_array.display();//depois
		*/
	//----------------------------------------------------------
		/*
		Selection_array = new Selection_sort(MAX);
		Selection_array.inserte(10);
		Selection_array.inserte(20);
		Selection_array.inserte(30);
		Selection_array.inserte(50);
		Selection_array.inserte(40);
		Selection_array.inserte(70);
		Selection_array.inserte(80);
		Selection_array.inserte(60);
		Selection_array.inserte(100);
		Selection_array.inserte(90);
		System.out.println("Antes");
		Selection_array.display();//antes
		Selection_array.SelectionSort();//ordena
		System.out.println("Depois");
		Selection_array.display();//depois
		*/
	//----------------------------------------------------------
		/*
		Insertion_array = new Insertion_sort(MAX);
		Insertion_array.inserte(50);
		Insertion_array.inserte(40);
		Insertion_array.inserte(30);
		Insertion_array.inserte(90);
		Insertion_array.inserte(10);
		Insertion_array.inserte(60);
		Insertion_array.inserte(100);
		Insertion_array.inserte(80);
		Insertion_array.inserte(70);
		Insertion_array.inserte(20);
		System.out.println("Antes");
		Insertion_array.display();
		Insertion_array.InsertionSort();
		System.out.println("Depois");
		Insertion_array.display();
		*/
		
		//----------------------------------------------------------
		
		Merge_array = new Merge_sort(MAX);
		Merge_array.inserte(50);
		Merge_array.inserte(40);
		Merge_array.inserte(30);
		Merge_array.inserte(90);
		Merge_array.inserte(10);
		Merge_array.inserte(60);
		Merge_array.inserte(100);
		Merge_array.inserte(80);
		Merge_array.inserte(70);
		Merge_array.inserte(20);
		System.out.println("Antes");
		Merge_array.display();
		Merge_array.MergeSort();
		System.out.println("Depois");
		Merge_array.display();
		
	}

}
