package sort;

public class BubbleSort
{
	public void bubbleSort(int[] a)
	{
		boolean flag = true;
		for(int i = 0; i < a.length-1 && flag == false; i++)
		{
			flag = false;
			for(int j = a.length -2; j >= i; j--)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				} 
			}
		}
	}
	
	public void display(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}
	
	public static void main(String[] args)
	{
		BubbleSort bs = new BubbleSort();
		int[] array = new int[]{1, 2,3,4,2,13,4,23,56,9};
		bs.bubbleSort(array);
		bs.display(array);
	}

}
