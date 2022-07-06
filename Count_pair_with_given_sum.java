//Question: Count pair with given sum
//Link: https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1

import java.util.*;
import java.io.*;

class Count_pair_with_given_sum 
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(solution(arr,n,k));
        sc.close();
    }
    static int solution(int arr[],int n,int k)
    {
        int count=0;
		Map<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(k-arr[i])) {
				count+=map.get(k-arr[i]);
			}
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
	return count;
    }
}