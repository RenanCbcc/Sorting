package simple_sorting;
/* Insertion sort � prefir�vel ao Quick sort para pastas pequenas
 * e para pastas pequenas parcialmente ordenadas. De fato, Insertion
 * sort � comumente usado como parte do Quick sort. 
 */
public class Insertion_sort {
		private int[] array;
		private int elements;
		
		//----------------------------------------------------------
		
		public Insertion_sort(int max)
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
		
		public void InsertionSort()
		{
			int in,out,temp;
			for ( out = 1; out < elements; out ++ )
			{
				temp = array[out];
				in = out;//inicia a mudan�a em out;
				while( in > 0 && array[in - 1] >= temp)
				{
					array[in] = array[in - 1]; // muda �tem da direita
					in --; // vai para a esquerda
				}
				
				array[in] = temp;
				
			}
		}

}
