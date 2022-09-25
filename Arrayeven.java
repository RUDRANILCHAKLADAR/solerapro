package Assignments;
import java.util.*;
public class Arrayeven {
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     int s[]= new int[10];
     for(int i=0;i<10;i++)
     {
    	  s[i]=sc.nextInt();
     }
     for(int i=0;i<10;i++)
     {
    	 if(s[i]%2==0)
    	 {
    		 System.out.println(s[i]);
    	 }
     }
     
 
	}

}
