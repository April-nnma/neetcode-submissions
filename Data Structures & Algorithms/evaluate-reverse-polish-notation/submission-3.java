class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if(token.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
            
            }else if (token.equals("-")){
                 int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }else if(token.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a*b);
            }else if(token.equals("/")){
            int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }else{
                int number = Integer.parseInt(token);
                stack.push(number);
            }
        }
    return stack.peek();   
    }
}
