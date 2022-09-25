package Assignments;
import java.util.*;
public class third {

	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.println("enter the no of rows of 1st matrix");
		int n=sc.nextInt();
		System.out.println("enter the number of columns of 1st matrix");
		int m=sc.nextInt();
		System.out.println("enter the no of rows of 2nd matrix");
		int r=sc.nextInt();
		System.out.println("enter the no of columns of 2nd matrix");
		int p=sc.nextInt();
		
		if(n==r && m==p)
		{
			int k[][] = new int[n][m];
            int l[][] = new int[r][p];
            int v[][] = new int[n][m];
            System.out.println("enter the 1st matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			k[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the second matrix");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<p;j++)
				{
					 l[i][j]=sc.nextInt();
				}
	         }
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					
					v[i][j]=k[i][j]+l[i][j];
				}
			}
			System.out.println("matrix after addition is");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					
					System.out.println( v[i][j]);
				}
			}
			
		}
		else
			System.out.println("addition cannot be done");
				

}
}
