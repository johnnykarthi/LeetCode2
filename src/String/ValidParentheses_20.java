package String;

import com.sun.source.tree.ReturnTree;

import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> k = new Stack<>();
        char m = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                k.push(c);
            } else {
                if(k.isEmpty())
                    return false;
                m = k.pop();
                if(c == ')' && m =='(' || c == '}' && m =='{' || c == ']' && m =='[')
                    continue;
                else
                    return false;
            }
        }
        return k.isEmpty();
    }
}
