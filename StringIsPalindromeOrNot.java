class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        int i=0;
        int j=S.length()-1;
        int flag=1;
        while(i<j){
            if(S.charAt(i)!=S.charAt(j)){
                flag=0;
            }
                ++i;
                --j;
        }
        return flag;
    }
}