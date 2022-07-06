// Question : Cyclically rotate array by one
// Problem Link: https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one/0


// Solution:

class Compute {
    
    public void rotate(int arr[], int n)
    {
        int x=arr[n-1];
        for(int i=n-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
    }
}