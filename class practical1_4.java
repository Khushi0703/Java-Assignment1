//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//array123([1, 1, 2, 3, 1]) → true
//array123([1, 1, 2, 4, 1]) → false
//array123([1, 1, 2, 1, 2, 3]) → true


//Prepared by Khushi Shah 21CE127

import java.util.*;
public class practical1_4 {
    static public void array123(int[] a)
    {
        int flag=0;
        for(int i=0;i<(a.length-2);i++)
        {
            if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
            {
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println(true);
        }
        else
        System.out.println(false);
    }
    
   public static void main(String args[])
   {
   Scanner s= new Scanner(System.in);
   System.out.println("Enter no:");
   int n=s.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
    arr[i]=s.nextInt();
   }
   array123(arr);
   s.close();
   }

}
