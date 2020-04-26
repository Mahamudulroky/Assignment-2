package assignment;
import java.util.Scanner;
class Solution
{
    private int[] numbers;
    private int rotation;
    
    public Solution(int [] numbers, int rotation)
    {
        this.numbers=numbers;
        this.rotation=rotation;
    }
    
    public int[]rotate()
    {
           int n=numbers.length;
           int m=rotation%n;
           for(int i=0;i<n;i++)
           {
              System.out.print((numbers[(m + i) % n])+" ");
           }       
          return null;
    }
}
public class Driver
{
    public static void main(String[] args)
    {
        int i;
        Scanner input=new Scanner(System.in);
       
        int n=input.nextInt();
        int d=input.nextInt();
        
        
         int a[] =new int[n];
        //Inputting Arrays
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        
        //Passing arrays
        Solution ob=new Solution(a, d);
        ob.rotate();   
    }
    
}
