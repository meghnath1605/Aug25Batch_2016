package day5;

public class DoubleDimensionalArray {

	public static void main(String[] args) {
		String[][] str=new String[2][3];
		str[0][0]="selenium";
		str[0][1]="QTP";
		str[0][2]="LR";
		
		str[1][0]="Jmeter";
		str[1][1]="Codedui";
		str[1][2]="soapui";
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				System.out.print(str[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("###############################3");
		for(String[] s : str)
		{
			for(String x : s)
			{
				System.out.print(x+"   ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
