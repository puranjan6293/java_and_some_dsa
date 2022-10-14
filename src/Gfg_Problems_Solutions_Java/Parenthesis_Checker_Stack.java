package Gfg_Problems_Solutions_Java;

import java.util.Stack;

public class Parenthesis_Checker_Stack {
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<Character>();
        int n=x.length();
        for(int i=0;i<n;i++){
            char c = x.charAt(i);
            if(c=='[' || c=='{' || c=='('){
                st.push(c);
            }
            else if(c==']'){
                if(st.size()>0 && st.peek()=='['){
                    st.pop();
                }
                else st.push(c);
            }
            else if(c=='}'){
                if(st.size()>0 && st.peek()=='{'){
                    st.pop();
                }
                else st.push(c);
            }
            else if(c==')'){
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }
                else st.push(c);
            }
        }
        return st.size()==0;
    }
}
