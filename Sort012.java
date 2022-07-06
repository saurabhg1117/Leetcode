class Solution
{
    public static void sort012(int a[], int n)
    {
        int l=0;
        int m=0;
        int h=a.length-1;
        while(m<=h){
            if(a[m]==0){
                int temp=a[l];
                a[l]=a[m];
                a[m]=temp;
                ++l;
                ++m;
            }
            else if(a[m]==1){
                ++m;
            }
            else if(a[m]==2){
                int temp=a[h];
                a[h]=a[m];
                a[m]=temp;
                --h;
            }
                
            }
            
        }
    }