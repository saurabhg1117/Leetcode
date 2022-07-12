import java.util.Stack;
public class Solution {

    public static boolean isBalanced(String expression) {
        //Your code goes here
        Stack<Character> st=new Stack();
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(c=='('){
                st.push('c');
            }
            else if(c==')'){
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        return st.size()==0;
    }
}