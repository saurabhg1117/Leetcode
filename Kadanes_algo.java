import java.util.*;
import java.io.*;

public class Kadanes_algo {
    public static void main(String[] args) throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(maxsum(arr,n));
        sc.close();
    }
    int maxSubarraySum(int arr[], int n){
        
        int maxSoFar=Integer.MIN_VALUE;
        int maxEndingHere=0;
        for(int i=0;i<arr.length;i++){
            maxEndingHere+=arr[i];
            if(maxEndingHere>maxSoFar){
                maxSoFar=maxEndingHere;
            }
            if(maxEndingHere<0){
                maxEndingHere=0;
            }
        }
        return maxSoFar;
        
    }
}
