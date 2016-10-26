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
		
		//----------------------------------------------------------
		
		public void MergeSort(int[] workspace,int lowerBound, int upperBound)
		{
			if (lowerBound == upperBound )
			{
				return; //caso base,erray com único elemento já está ordenado.
			}
			
			else
			{
				int mid = (lowerBound + upperBound)/2; //encontra um ponto intermediário.
				
				MergeSort(workspace,lowerBound,mid);//metade inferior
				
				MergeSort(workspace,mid +1,upperBound);//metade superior
				
				merge(workspace,lowerBound,mid+1,upperBound);
				
			}
		}
		
		//----------------------------------------------------------
		
		public void merge(int[] workspace, int lowPointer,int highPointer,int upperBound)
		{
			int j = 0;
			int lowerBound = lowPointer;
			int mid = highPointer -1;
			int n = upperBound - lowerBound + 1; // # of itens
			
			while (lowPointer <= mid && highPointer <= upperBound)
			{
				if ( this.array[lowPointer] < this.array[highPointer] )
				{
					workspace[j++] = this.array[lowPointer++];
				}
				else
				{
					workspace[j++] = this.array[highPointer++];
				}
			}
			
			while ( lowPointer <= mid )
			{
				workspace[j++] = this.array[lowPointer++];
			}
			
			while ( highPointer <= upperBound )
			{
				workspace[j++] = this.array[highPointer++];
			}
			
			for ( j = 0; j < n; j++ )
			{
				this.array[lowerBound+j] = workspace[j];
			}

		}
		
		//----------------------------------------------------------
		
}
