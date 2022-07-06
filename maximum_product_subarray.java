/* Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray. */
//Problem Url : https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1

//Solution :

import java.util.*;
import java.io.*;

public class maximum_product_subarray {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(prod(arr, n));
        sc.close();
    }
    static long prod(int arr[], int n)
    {
        long ans=arr[0];
        long ma=ans;
        long mi=ans;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                long temp=ma;
                ma=mi;
                mi=temp;
            }
            ma=Math.max(arr[i],ma*arr[i]);
            mi=Math.min(arr[i],mi*arr[i]);
            ans=Math.max(ans,ma);
            
        }
        return ans;
    }
}
