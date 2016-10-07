package day3;

public class ArraysExample {

	
	public static void main(String[] args) {
		int[] a={20,90,50,30};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println("The max no  is "+max);

	}

}
