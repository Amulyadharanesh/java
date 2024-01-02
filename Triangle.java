public class Triangle{
	public static void main(String[]args)
	{
		int n=5;
		for(int i=0;i<=n;i++)//Rows outer loop
		{
		for (int j=0;j<i;j++)//cloumns inner loop
		{
		System.out.print("*  ");
		}
	System.out.println();
	
}
System.out.println("_____________________");
    
        for(int i=0;i<n;i++)//Rows outer loop
		{
		for (int j=i;j<n;j++)//cloumns inner loop
		{
		System.out.print("*  ");
		}
		System.out.println();
	
}
}
}