//Time = O(n)
//Space = O(1)

class Main{
public static void moveAllNegativeFirstAndPositiveEnd(int[] arr) {
		int i=-1;
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j]<0) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}
			
		}

	}
}