import java.util.Stack;
public class Solution {

	public static int countBracketReversals(String input) {
        if(input.length()%2==1){
            return -1;
        }
        if(input.length()==0){
            return 0;
        }
		//Your code goes here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c=='{'){
                st.push(c);
            }
            else if(c=='}'){
                
               if(st.isEmpty() || st.peek()=='}') {
                    st.push('}');
                }
                else{
                    st.pop();
                }
            }
        }
        int count=0;
       	while(!st.isEmpty()){
            char c1=st.pop();
            char c2=st.pop();
            if(c1==c2){
                count+=1;
            }
            else{
                count+=2;
            }
        }
        return count;
	}

}