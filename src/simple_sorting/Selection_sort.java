package simple_sorting;

public class Selection_sort {
	private int[] array;
	private int elements;
	
	//----------------------------------------------------------
	
	public Selection_sort(int max)
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

	public void SelectionSort()
	{
		int in, out, min;
		for (out = 0; out < elements - 1; out ++)
		{
			min = out; // mernor elemento do array 
			for ( in = out +1; in < elements ; in++ )
			{
				if (array[in] < array[min])
					min = in; //agora minimo está na posição 'in'
				
			}
		swap(out,min);
		}
	}
	
	//----------------------------------------------------------

	public void swap(int in, int out)
	{
		 int temp = array[in];
		 array[in] = array[out];
		 array[out] = temp;
		 
	}
	
	//----------------------------------------------------------


}
