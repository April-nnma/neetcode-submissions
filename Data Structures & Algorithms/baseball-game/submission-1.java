class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < operations.length; i++){
            String current = operations[i];

            if(current.equals("C")){
                stack.pop();
            }else if(current.equals("D")){
                int lastS = stack.peek();
                int newS = lastS * 2;
                stack.push(newS);
            }else if(current.equals("+")){
                int lastS = stack.pop(); //remove 
                int getS = stack.peek();     //get
                stack.push(lastS);      //undo remove
                int newS = getS + lastS;
                stack.push(newS);
            }else{
                int number = Integer.parseInt(current);
                stack.push(number);
            }    
        }
        int total = 0;
        while(!stack.isEmpty()){
            total = total+ stack.pop();
        }
        return total;
    }
        
}
