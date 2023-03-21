package array_strings;

public class cloning {

	public static void main(String[] args) {
		
		//deep array
		
		System.out.println("deep copy");
		int arr[]= {2,3,5,6,8,9};
		int arrayclone[]=arr.clone();
		System.out.println(arr==arrayclone);
		//it shows false because the memory location is different
		for(int i=0;i<arrayclone.length;i++)
		{
			System.out.println(arrayclone[i]+" ");
		}
		System.out.println(arr);//location is different for deep copy
		System.out.println(arrayclone);
		System.out.println();
		
		//shallow copy
		
		System.out.println("shallow copy");
		int[][] num= new int[5][5];							
		int[][] numclone= num.clone();
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				num[i][j]=(int)(Math.random()*100);
			}
		}
		System.out.println(num[1]==numclone[1]);
		
		for(int i=0;i<numclone.length;i++)
		{
			for(int j=0;j<numclone[i].length;j++)
			{
				System.out.print(numclone[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(num[1]);//location is same in shallow copy 
		System.out.println(numclone[1]);
		System.out.println();
		
		// jagged array
		
		System.out.println("jagged array");
		int jag_array[][]=new int [3][];
		jag_array[0]=new int[3];
		jag_array[1]=new int[4];
		jag_array[2]=new int[5];
		int count=0;
		for(int i=0;i<jag_array.length;i++)
		{
			for(int j=0;j<jag_array[i].length;j++)
			{
				jag_array[i][j]=count++;
			}
		}
		
		//print the data of the jagged array
			
		for(int i=0;i<jag_array.length;i++)
		{
			
			for(int j=0;j<jag_array[i].length;j++)
			{
				System.out.print(jag_array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
