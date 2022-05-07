package stackandqueue;

import java.util.Stack;

public class EvalRPN {
    public static void main(String[] args) {
        String[] v = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(v));
    }
    public static  int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        String s;
        for (int i = 0; i < tokens.length; i++) {
            s = tokens[i];
            if(s.matches("^[-]?\\d+")){
                stack.push(s);
            }else{
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if(s.equals("+")){
                    res = num1 + num2;
                }else if(s.equals("-")){
                    res = num1 - num2;
                }else if(s.equals("*")){
                    res = num1 * num2;
                }else{
                    res = num1 / num2;
                }
                stack.push("" + res);
            }

        }
        return Integer.parseInt(stack.pop());


    }

}
