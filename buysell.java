
package buysell;

import java.util.*;
public class BuySell {


    public static void main(String[] args) {
System.out.println("Enter the number of elements");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the prices");
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
int min_price=Integer.MAX_VALUE;
int max_price=0;
for(int i=0;i<n;i++)
{
    if(arr[i]<min_price)
    {
        min_price=arr[i];
    }
    else if(arr[i]-min_price>max_price)
    {
        max_price=arr[i];
    }
}
System.out.println("Max profit is" +max_price);
    }
    
}
