package stackandqueue;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                characters.push(')');
            }else if(ch == '['){
                characters.push(']');
            }else if(ch == '{'){
                characters.push('}');
            }else if(characters.empty() || ch != characters.peek()){
                return false;
            }else {
                characters.pop();
            }
        }
        return characters.empty();
    }
}
