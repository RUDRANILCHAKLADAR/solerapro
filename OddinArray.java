package Assignments;
import java.util.*;
public class OddinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows of matrix");
		int n=sc.nextInt();
		System.out.println("enter the no of columns of matrix");
		int m=sc.nextInt();
		int l[][]=new int[100][100];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				 l[i][j]=sc.nextInt();
			}
		}
		System.out.println("the odd numbers are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(l[i][j]%2==1)
					System.out.println(l[i][j]);
			}
		}
		
	}

}
