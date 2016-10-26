package advanced_sorting;

public class Merge_sort {
	
		private int[] array;
		private int elements;
		
		//----------------------------------------------------------
		
		public Merge_sort(int max)
		{
			array = new int[max];
			elements = 0;
		}
		
		//----------------------------------------------------------
		
		public void inserte(int value)
		{
			array[elements] = value;
			elements ++;
		}
		
		//----------------------------------------------------------
		
		public void display()
		{
			for (int i = 0; i < elements; i++)
			{
				System.out.println(array[i]);
			}
		}
		
		//----------------------------------------------------------
		
		public void MergeSort()
		{
			int[] workspace = new int[elements];
			MergeSort(workspace,0,elements-1);
		}
		
		public void MergeSort(int[] array,int lowerBound, int upperBound)
		{
			if (lowerBound == upperBound )
			{
				return; //caso base,erray com único elemento já está ordenado.
			}
			
			else
			{
				int mid = (lowerBound + upperBound)/2; //encontra um ponto intermediário.
				MergeSort(array,lowerBound,mid);//metade inferior
				MergeSort(array,mid +1,upperBound);//metade superior
				
			}
		}
		
		public void merge(int array, int lowPointer,int highPointer,int upperBound)
		{
			int j = 0;
			int lowerBound = lowPointer;
			int mid = highPointer -1;
			int n = upperBound - lowerBound + 1; // # of itens
			
			while(lowPointer <= mid && highPointer <= upperBound)
			{
				if ( a)
				array[j++]
			}
		}
}
